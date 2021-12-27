
import java.io.Serializable;

public class Tickets implements Serializable {
        Object movie;
        int seat;
        Object price;
        String date;
        public Object getMovie() {
            return movie;
        }
        public int getSeat() {
            return seat;
        }
        public Object getPrice() {
            return price;
        }
        public String getDate() {
            return date;
        }
        
        public void setMovie(Object movie) {
            this.movie = movie;
        }
        public void setSeat(int seat) {
            this.seat = seat;
        }
        public void setPrice(Object price) {
            this.price = price;
        }
        public void setDate(String date) {
            this.date = date;
        }
    }