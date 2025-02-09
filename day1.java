
import java.util.Scanner;


public class day1 {
    public static void main(String[] args) {
        Scanner lk=new Scanner(System.in);
        int l=lk.nextInt();
        if (l<50) {
            System.out.println("you need to improve");
            
        }
        else if (l>=50&&l<69) {
            System.out.println("Good job");
            
        }
        else if (l>=70) {
            System.out.println("Excellent perfomance");
            
        }
         
    }
}