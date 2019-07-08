package Service.impl;


import entity.Arrange;
import entity.Movie;
import entity.Show;
import Service.ticket;
import Service.ChangeMovie;
import Service.ChangeShow;
import java.util.List;

/**
 * @author Bear 影院服务
 * */
public class service implements ChangeShow,ChangeMovie,ticket{
    public Movie addMovie(){
        Movie temp=new Movie();
        return temp;
    }
    public Movie delMovie(){
        Movie temp=new Movie();
        return temp;
    }
    public Show addShow(){
        Show temp=new Show();
        return temp;
    }
    public Show delShow(){
        Show temp=new Show();
        return temp;
    }
    public Show changeShow(){
        Show temp=new Show();
        return temp;
    }
    public Arrange order(){
        Arrange temp=new Arrange();
        return temp;
    }
    public Arrange refund(){
        Arrange temp=new Arrange();
        return temp;
    }
    public Arrange search(){
        Arrange temp=new Arrange();
        return temp;
    }
    public Arrange change(){
        Arrange temp=new Arrange();
        return temp;
    }

    @Override
    public List<Show> find() {
        return null;
    }
}
