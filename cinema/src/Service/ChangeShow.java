package Service;

import entity.Show;

/**
 * @author Bear  管理员添加、删除、修改场次*/
public interface ChangeShow {
    public Show addShow();
    public Show delShow();
    public Show changeShow();
}
