package entity;

import java.util.Date;
public class Show {
    private int Hall_id;
    private int Movie_id;
    private Date Show_time;

    public Show() {
    }

    public Show(int hall_id, int movie_id, Date show_time) {
        Hall_id = hall_id;
        Movie_id = movie_id;
        Show_time = show_time;
    }

    public int getHall_id() {
        return Hall_id;
    }

    public void setHall_id(int hall_id) {
        Hall_id = hall_id;
    }

    public int getMovie_id() {
        return Movie_id;
    }

    public void setMovie_id(int movie_id) {
        Movie_id = movie_id;
    }

    public Date getShow_time() {
        return Show_time;
    }

    public void setShow_time(Date show_time) {
        Show_time = show_time;
    }
}
