package User;

import Authority.impl.DefaultCustomer;
import Authority.impl.DefaultManage;
import entity.Auident;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by diandian on 2019/7/7.
 */
public class User {
    private Role role = null;
    HashMap<String,Auident> map=new HashMap<String,Auident>();

    //数据库中读取观众信息
    boolean init(){

        return false;
    }
    /**
    *注册函数
    * edited by dean
    */
    public boolean login(){
        role = new Role();
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = scanner.next();
        System.out.println("请输入密码");
        String password = scanner.next();
        //管理员登录
        if(username.equals("admin")&&password.equals("admin")){
            role.setDescription("管理员");
            DefaultManage admin = new DefaultManage();
            role.setMange(admin);
        }else if(username.equals("admin")&&!password.equals("admin")){
            System.out.println("管理员密码错误");
            return false;
        }
        //用户登录
        if(!map.containsKey(username))
        {
            System.out.println("用户名不存在！");
            return false;
        }else if(!map.get(username).getAid_password().equals(password))
        {
            System.out.println("密码错误！重新输入");
            password=scanner.nextLine();
            if(!map.get(username).getAid_password().equals(password)){
                System.out.println("密码错误！重新输入");
                password=scanner.nextLine();
                if(!map.get(username).getAid_password().equals(password)) {
                    System.out.println("输入错误三次，本次登陆失败");
                    return false;
                }else {
                    role.setDescription("用户");
                    DefaultCustomer audience = new DefaultCustomer();
                    role.setNormal(audience);
                    return true;}
            }else {
                role.setDescription("用户");
                DefaultCustomer audience = new DefaultCustomer();
                role.setNormal(audience);
                return true;}
        }

        return true;
    }
    //注册函数
    //edited by dean
    //新增用户放到范型集合里
    public boolean register(){
        System.out.println("请输入要注册的用户名(用户名长度3~20)：");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        System.out.println("请输入密码");
        String password=scanner.nextLine();
        if(name.length()>=3&&name.length()<=20)
        {
            if(map.containsKey(name))
            {
                System.out.println("用户名已存在");
                return false;
            }
            else
            {
                System.out.println("请再次输入密码：");
                String password2=scanner.nextLine();
                if(password.equals(password2))
                {
                    System.out.println("请输入您的电话");
                    String tel = scanner.next();
                    System.out.println("是否订阅VIP服务：1、是  2、否");
                    String type=scanner.next();
                    map.put(name,new Auident(map.size()+1,name,tel,type,password));
                    return true;
                }
                else
                    System.out.println("两次密码输入必须相同！");
                return false;
            }
        }
        else
            System.out.println("请输入正确长度的用户名！");
        return false;
    }
    //保存新增用户到数据库中
    public void save(){

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
