package DBopeartion.impl;

import DBopeartion.BaseDao;
import DBopeartion.ticketDao;
import entity.Arrange;
import entity.Show;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ticketDaoimpl extends BaseDao implements ticketDao {
    private Connection conn = null; // 保存数据库连接

    private PreparedStatement pstmt = null; // 用于执行SQL语句

    private ResultSet rs = null; // 用户保存查询到的\结果集
    @Override
    public List<Show> findShow() {
        List<Show> showList=new ArrayList<Show>();
        try{
            String preparedSql="select * from Show";
            conn= getConn();
            pstmt = conn.prepareStatement(preparedSql);
            rs = pstmt.executeQuery(); //执行
            while (rs.next()){
                Show show=new Show();
                show.setHall_id(rs.getInt(1));
                show.setMovie_id(rs.getInt(2));
                show.setShow_time(rs.getDate(3));
                showList.add(show);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }finally {
            super.closeAll(conn,pstmt,rs);
        }
        return showList;
    }

    @Override
    public List<Arrange> search(String sql, String[] param) {
        List<Arrange> arrangesList= new ArrayList<Arrange>();
        try{
            conn=getConn();
            pstmt=conn.prepareStatement(sql);
            if(param!=null){
                for(int i=0;i<param.length;i++) {
                    pstmt.setString(i+1,param[i]);
                }
            }
            rs=pstmt.executeQuery();
            while(rs.next()){
                Arrange arrange=new Arrange();
                arrange.setAud_id(rs.getInt(1));
                arrange.setHall_id(rs.getInt(2));
                arrange.setMovie_id(rs.getInt(3));
                arrange.setLine(rs.getInt(4));
                arrange.setRow(rs.getInt(5));
                arrange.setArrange_time(rs.getTime(6));
                arrangesList.add(arrange);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }finally {
            super.closeAll(conn,pstmt,rs);
        }
        return arrangesList;
    }

    @Override
    public int insertArrange(String sql, String[] param) {
        int count=super.executeSQL(sql,param);
        return count;
    }

    @Override
    public int updateArrange(String sql, String[] param) {
        int count=super.executeSQL(sql,param);
        return count;
    }

    @Override
    public int delArrange(String sql, String[] param) {
        int count=super.executeSQL(sql,param);
        return count;
    }
}
