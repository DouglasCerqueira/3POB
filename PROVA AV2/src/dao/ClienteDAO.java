package dao;

import conexao.Conexao;
import main.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ClienteDAO {
    private Conexao conexao;
    private Connection connect;

    public ClienteDAO(){
        this.conexao = new Conexao();
        this.connect = this.conexao.getConexao();
    }

    public void inserir(Cliente cliente){
        String sql = "INSERT INTO cliente(nome, endereco, postalCode, pais, cpf, passaporte, email, dataNascimento) VALUES " +
                "(?, ?, ?, ?, ?, ?, ?, ?)";

        try{
            PreparedStatement stmt = this.connect.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEndereco());
            stmt.setString(3, cliente.getPostalCode());
            stmt.setString(4, cliente.getPais());
            stmt.setString(5, cliente.getCpf());
            stmt.setString(6, cliente.getPassaporte());
            stmt.setString(7, cliente.getEmail());
            stmt.setString(8, cliente.getDataNascimento());
            stmt.execute();

        } catch (Exception e){
            System.out.println("Erro ao inserir cliente. " + e.getMessage());
        }
    }

    public void alterar(Cliente cliente){
        String sql = "UPDATE cliente SET nome=?, endereco=?, postalCode=?, pais=?, cpf=?, passaporte=?, email=?, dataNascimento=? WHERE id=?";
        try{
            PreparedStatement stmt = this.connect.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEndereco());
            stmt.setString(3, cliente.getPostalCode());
            stmt.setString(4, cliente.getPais());
            stmt.setString(5, cliente.getCpf());
            stmt.setString(6, cliente.getPassaporte());
            stmt.setString(7, cliente.getEmail());
            stmt.setString(8, cliente.getDataNascimento());
            stmt.setInt(9, cliente.getId());
            stmt.execute();

        } catch (Exception e){
            System.out.println("Erro ao alterar cliente. " + e.getMessage());
        }
    }

    public void excluir(int id){
        String sql = "DELETE FROM cliente WHERE id=?";
        try{
            PreparedStatement stmt = this.connect.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();

        } catch (Exception e){
            System.out.println("Erro ao excluir cliente. " + e.getMessage());
        }
    }
}
