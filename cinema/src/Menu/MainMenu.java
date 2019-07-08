package Menu;
import java.util.*;
import User.User;
/**
 * Created by diandian on 2019/7/6.
 */
//主页面
public class MainMenu {
    static User user = new User();

    Scanner input = new Scanner(System.in);
    public void menu(){
        int choice;
        while(true) {
            System.out.println("###########电影管理系统##############");
            System.out.println("1.用户登陆\t2.用户注册\t3.退出");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    loginmenu();
                    break;
                case 2:
                    registermenu();
                    break;
                case 3:
                    System.out.println("拜拜～～");
                    return;
                default:
                    System.out.println("输入错误，请重新输入");
                    choice = input.nextInt();
            }
        }
    }
    public void loginmenu(){
        System.out.println("这是登陆页面");
        if(user.login())
            next();

    }
    public void registermenu(){
        System.out.println("这是注册页面");
        if(user.register())
            next();

    }
    public void next(){
        System.out.println("这是登陆后的界面");
        System.out.println("###########电影管理系统##############");
        System.out.println("请输入您的操作的类型（1.管理员   2.用户）");
        while (true) {
            int temp = input.nextInt();
            if (temp == 1) {
                System.out.println("欢迎您，管理员请选择您的操作");
                System.out.println("1.查询\t2.添加放映信息\t3.上架影片\t4.安排放映\t5.下架影片\t6.取消放映\t7.退出");
                int temp2 = input.nextInt();
                switch (temp2){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        return;
                    default:
                        System.out.println("输入错误，请重新输入");
                        temp2 = input.nextInt();
                }

            } else if (temp == 2) {
                System.out.println("欢迎您，亲爱的顾客朋友，请选择您的服务");
                System.out.println("1.订票\t2.退票\t3.改签\t4.查看放映信息\t5.查询\t6.退出");
                int temp2 = input.nextInt();
                switch (temp2){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        return;
                    default:
                        System.out.println("输入错误，请重新输入");
                        temp2 = input.nextInt();
                }
            } else {
                System.out.println("输入错误，请重新输入");
            }
        }
        //System.out.println("###########电影管理系统##############");
        //System.out.println("1.查询\t2.添加放映信息\t3.上架影片\t4.安排放映\t5.下架影片\t6.取消放映\t7.退出");
        //System.out.println("请输入查询类型");
        //System.out.println("1.查询当前热映的电影\t2.查询所有库内所有电影信息\t3.按影片查询放映场次\t4.按影厅查询放映场次\t5.退出");
        //System.out.println("1.订票\t2.退票\t3.改签\t4.查询\t5.退出");
        //System.out.println("请输入查询类型");
        //System.out.println("1.当前热映\t2.评分最高\t3.类型查找\t4.退出\t");
    }
}
