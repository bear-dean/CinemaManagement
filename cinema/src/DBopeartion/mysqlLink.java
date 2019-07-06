package DBopeartion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class mysqlLink {
    Connection con;

    public Connection getmySqlConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("数据库驱动加载成功");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinema","root","gfnb");
            System.out.println("数据库连接成功,哈哈！！");
        }catch (SQLException e){
            e.printStackTrace();
        }
        return con;
    }
    public static void main(String arg[]){
        mysqlLink C = new mysqlLink();
        C.getmySqlConnection();
    }


}
