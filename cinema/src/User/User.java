package User;

/**
 * Created by diandian on 2019/7/7.
 */
public class User {
    private Role role = null;

    public boolean login(){
        return true;
    }

    public boolean register(){
        return false;
    }


    public void search() {
        role.search();
    }

    public void order() {
        role.order();
    }

    public void refund() {
        role.refund();
    }

    public void change() {
        role.change();
    }
    public void addMovie() {
        role.addMovie();
    }

    public void delMovie() {
        role.delMovie();
    }

    public void addShow() {
        role.addShow();
    }

    public void delShow() {
        role.delShow();
    }

    public Role getRole() {
        return role;
    }
    public void setRole(Role role) {
        this.role = role;
    }
}
