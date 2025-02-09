
import java.util.Scanner;

public class colour {
    public static void main(String[] args) {
        Scanner lk =new Scanner(System.in);
        String l=lk.nextLine();
        if(l.equals("R")) {
            System.out.println("stop");
        } 
        else if (l.equals("Y")) {
            System.out.println("Get ready");
        }
        else if (l.equals("G")){
            System.out.println("GO");
        }
    }
}
