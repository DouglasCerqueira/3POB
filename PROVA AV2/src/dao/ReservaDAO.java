package dao;

import conexao.Conexao;
import main.Reserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ReservaDAO {
    private Conexao conexao;
    private Connection connect;

    public ReservaDAO(){
        this.conexao = new Conexao();
        this.connect = this.conexao.getConexao();
    }

    public void inserir(Reserva reserva){
        String sql = "INSERT INTO reserva(idQuarto, idCama, idCliente, dataEntrada, dataSaida) VALUES " +
                "(?, ?, ?, ?, ?)";

        try{
            PreparedStatement stmt = this.connect.prepareStatement(sql);
            stmt.setInt(1, reserva.getIdQuarto());
            stmt.setInt(2, reserva.getIdCama());
            stmt.setInt(3, reserva.getIdCliente());
            stmt.setString(4, reserva.getDataEntrada());
            stmt.setString(5, reserva.getDataSaida());
            stmt.execute();

        } catch (Exception e){
            System.out.println("Erro ao inserir reserva. " + e.getMessage());
        }
    }

    public void alterar(Reserva reserva){
        String sql = "UPDATE reserva SET idQuarto=?, idCama=?, idCliente=?, dataEntrada=?, dataSaida=? WHERE id=?";

        try{
            PreparedStatement stmt = this.connect.prepareStatement(sql);
            stmt.setInt(1, reserva.getIdCliente());
            stmt.setInt(2, reserva.getIdCama());
            stmt.setInt(3, reserva.getIdCliente());
            stmt.setString(4, reserva.getDataEntrada());
            stmt.setString(5, reserva.getDataSaida());
            stmt.setInt(6, reserva.getId());
            stmt.execute();

        } catch (Exception e){
            System.out.println("Erro ao alterar reserva. " + e.getMessage());
        }
    }

    public void excluir(int id){
        String sql = "DELETE FROM reserva WHERE id=?";

        try{
            PreparedStatement stmt = this.connect.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();

        } catch (Exception e){
            System.out.println("Erro ao excluir reserva. " + e.getMessage());
        }
    }

    public List<Reserva> getReserva(){
        String sql = "SELECT * FROM reserva";

        try{
            PreparedStatement stmt = this.connect.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            List<Reserva> listaReserva = new ArrayList<Reserva>();
            while(rs.next()){
                Reserva reserva = new Reserva();
                reserva.setId(rs.getInt("id"));
                reserva.setIdQuarto(rs.getInt("idQuarto"));
                reserva.setIdCliente(rs.getInt("idCliente"));
                reserva.setDataEntrada(rs.getString("dataEntrada"));
                reserva.setDataSaida(rs.getString("dataSaida"));
                listaReserva.add(reserva);
            }
            return listaReserva;

        }catch (Exception e){
            return null;
        }
    }
}
