package Authority;
/**
 * Created by diandian on 2019/7/7.
 */
/**
 * 顾客权限  查询，订票，退票，改签
 */
public interface Normal {
    public void order();
    public void refund();
    public void search();
    public void change();
}
