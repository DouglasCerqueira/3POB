package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    public Connection getConexao(){
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/av2?serverTimezone=UTC",
                    "root", "");
            return conn;

        } catch (Exception e){
            System.out.println("Erro ao se conectar ao banco. " + e.getMessage());
            return null;
        }
    }
}
