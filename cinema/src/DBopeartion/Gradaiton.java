package DBopeartion;

/**
 * Created by diandian on 2019/7/4.
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Gradaiton {
    static Connection con;
    static Statement sql;
    static ResultSet res;

    public static void main(String args[]){
        Gradaiton c = new Gradaiton();
        con = new mysqlLink().getmySqlConnection();
        try {
            // 实例化Statement
            sql = con.createStatement();
            // 执行sql语句，返回结果集
            res = sql.executeQuery("select * from Movie");
            // 如果当前语句不是最后一条，则进入循环
            while (res.next()){
                int id = res.getInt("Movie_id");
                String name = res.getString("Movie_name");
                int price = res.getInt("Base_price");
                String Category = res.getString("Category");

                System.out.println("电影id："+id+"\t电影名："+name+"\t价格"+price+"\t分类"+Category);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
