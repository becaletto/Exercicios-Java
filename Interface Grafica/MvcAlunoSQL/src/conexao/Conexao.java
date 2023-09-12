/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author taniabasso
 */
public class Conexao {
    public Connection getConnection() throws SQLException, ClassNotFoundException {    
       
       String driver = "com.mysql.jdbc.Driver"; 
       String url = "jdbc:mysql://143.106.241.3:3306/cl202193";
       String usuario = "cl202193";
       String senha = "cl*19072006";
       try{
           return DriverManager.getConnection(url, usuario, senha);
       }catch(SQLException ex){
       System.out.println("Erro de conecao" + ex.toString());
       exit(1);
       return null; 
    }
    }
}
