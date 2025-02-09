
import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner lk=new Scanner(System.in);
        System.out.println("Enter the yes or no");
        int MS=lk.nextInt();
        int SM=lk.nextInt();

        String result=MS>SM?"First value is big":"Second alue is big"; 
        System.out.println(result);
    }

}
