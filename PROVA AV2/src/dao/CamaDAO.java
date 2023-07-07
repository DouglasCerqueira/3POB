package dao;

import conexao.Conexao;
import main.Cama;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CamaDAO {
    private Conexao conexao;
    private Connection connect;

    public CamaDAO(){
        this.conexao = new Conexao();
        this.connect = this.conexao.getConexao();
    }

    public void inserir(Cama cama){
        String sql = "INSERT INTO cama(codigoCama, ehBeliche, posicao, descricao) VALUES " +
                "(?, ?, ?, ?)";

        try{
            PreparedStatement stmt = this.connect.prepareStatement(sql);
            stmt.setInt(1, cama.getCodigoCama());
            stmt.setBoolean(2, cama.isEhBeliche());
            stmt.setString(3, cama.getPosicao());
            stmt.setString(4, cama.getDescricao());
            stmt.execute();

        } catch (Exception e){
            System.out.println("Erro ao inserir cama. " + e.getMessage());
        }
    }

    public void alterar(Cama cama){
        String sql = "UPDATE cama SET codigoCama=?, ehBeliche=?, posicao=?, descricao=? WHERE id=?";

        try{
            PreparedStatement stmt = this.connect.prepareStatement(sql);
            stmt.setInt(1, cama.getCodigoCama());
            stmt.setBoolean(2, cama.isEhBeliche());
            stmt.setString(3, cama.getPosicao());
            stmt.setString(4, cama.getDescricao());
            stmt.setInt(5, cama.getId());
            stmt.execute();

        } catch (Exception e){
            System.out.println("Erro ao alterar cama. " + e.getMessage());
        }
    }

    public void excluir(int id){
        String sql = "DELETE FROM cama WHERE id=?";

        try{
            PreparedStatement stmt = this.connect.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();

        } catch (Exception e){
            System.out.println("Erro ao excluir cama. " + e.getMessage());
        }
    }

    public List<Cama> getCamas(){
        String sql = "SELECT * FROM cama";

        try{
            PreparedStatement stmt = this.connect.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            List<Cama> listaCamas = new ArrayList<Cama>();
            while(rs.next()){
                Cama cama = new Cama();
                cama.setId(rs.getInt("id"));
                cama.setCodigoCama(rs.getInt("codigoCama"));
                cama.setEhBeliche(rs.getBoolean("ehBeliche"));
                cama.setPosicao(rs.getString("posicao"));
                cama.setDescricao(rs.getString("descricao"));
                listaCamas.add(cama);
            }
            return listaCamas;

        }catch (Exception e){
            return null;
        }
    }
}
