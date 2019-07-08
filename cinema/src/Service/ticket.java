package Service;

import entity.Arrange;
import entity.Show;

import java.util.List;

/**
 * @author Bear 客户查询、订购、修改、退票*/
public interface ticket {
    public Arrange order();
    public Arrange refund();
    /**
     * 查询票务信息*/
    public Arrange search();
    public Arrange change();
    public List<Show> find();
}
