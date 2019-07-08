package DBopeartion;

import entity.Arrange;
import entity.Show;

import java.util.List;

public interface ticketDao {
    /**
     * 查询场次*/
    public abstract List<Show> findShow();
    /**
     * 查询票务信息*/
    public abstract List<Arrange> search(String sql,String[] param);
    /**
     * 订票*/
    public abstract int insertArrange(String sql,String[] param);
    /**
     * 改票*/
    public abstract int updateArrange(String sql,String[] param);
    /**
     * 退票*/
    public abstract int delArrange(String sql,String[] param);
}
