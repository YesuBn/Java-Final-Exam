import java.io.*;
import java.net.*;
public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ServerSocket ss = new ServerSocket(4999);
        Socket s = ss.accept();
        
        System.out.println("Client holbogdloo");
        
        ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
        ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
        Tickets t1 = new Tickets();
        t1 = (Tickets) ois.readObject();
        System.out.println("Avsan medeelel: \nKino: " + t1.getMovie()+ "\nUne: " + t1.getPrice() + "\nSuudal: " + t1.getSeat());
        ois.close();
        s.close();
        ss.close();
    }
}
