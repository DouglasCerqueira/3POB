package dao;

import conexao.Conexao;
import main.Quarto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class QuartoDAO {
    private Conexao conexao;
    private Connection connect;

    public QuartoDAO(){
        this.conexao = new Conexao();
        this.connect = this.conexao.getConexao();
    }

    public void inserir(Quarto quarto){
        String sql = "INSERT INTO quarto(nomeQuarto, qtdeCamas, temBanheiro, descricao) VALUES " +
                "(?, ?, ?, ?)";

        try{
            PreparedStatement stmt = this.connect.prepareStatement(sql);
            stmt.setString(1, quarto.getNomeQuarto());
            stmt.setInt(2, quarto.getQtdeCamas());
            stmt.setBoolean(3, quarto.isTemBanheiro());
            stmt.setString(4, quarto.getDescricao());
            stmt.execute();

        } catch (Exception e){
            System.out.println("Erro ao inserir quarto. " + e.getMessage());
        }
    }

    public void alterar(Quarto quarto){
        String sql = "UPDATE quarto SET nomeQuarto=?, qtdeCamas=?, temBanheiro=?, descricao=? WHERE id=?";

        try{
            PreparedStatement stmt = this.connect.prepareStatement(sql);
            stmt.setString(1, quarto.getNomeQuarto());
            stmt.setInt(2, quarto.getQtdeCamas());
            stmt.setBoolean(3, quarto.isTemBanheiro());
            stmt.setString(4, quarto.getDescricao());
            stmt.setInt(5, quarto.getId());
            stmt.execute();

        } catch (Exception e){
            System.out.println("Erro ao alterar quarto. " + e.getMessage());
        }
    }

    public void excluir(int id){
        String sql = "DELETE FROM quarto WHERE id=?";

        try{
            PreparedStatement stmt = this.connect.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();

        } catch (Exception e){
            System.out.println("Erro ao excluir quarto. " + e.getMessage());
        }
    }

    public List<Quarto> getQuartos(){
        String sql = "SELECT * FROM quarto";

        try{
            PreparedStatement stmt = this.connect.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            List<Quarto> listaQuartos = new ArrayList<Quarto>();
            while(rs.next()){
                Quarto quarto = new Quarto();
                quarto.setId(rs.getInt("id"));
                quarto.setNomeQuarto(rs.getString("nomeQuarto"));
                quarto.setTemBanheiro(rs.getBoolean("temBanheiro"));
                quarto.setDescricao(rs.getString("descricao"));
                listaQuartos.add(quarto);
            }
            return listaQuartos;

        }catch (Exception e){
            return null;
        }
    }
}
