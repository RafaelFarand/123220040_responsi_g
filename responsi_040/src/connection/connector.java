/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.sun.jdi.connect.spi.Connection;
import java.sql.SQLException;
/**
 *
 * @author Lab Informatika
 */
public class connector {
static Connection con;
    /**
     * @param args the command line arguments
     * @return 
     */
    public static Connection connection(){
        if(con == null){
            MysqlDataSource data = new MysqlDataSource();
        data.setDatabaseName("MysqlDataSource");
        data.setUser("root");
        data.setPassword(" ");
        try {
            con = data.getConnection();
            System.out.println("connection successful");
        }catch(SQLExeption ex){
            ex.printStackTrace();
            System.out.println("connection Failed");
        }
    }
    return con;
}
}
