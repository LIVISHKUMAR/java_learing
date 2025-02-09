
import java.util.Scanner;

public class loan {
    public static void main(String[] args) {
        Scanner lk=new Scanner(System.in);
        System.out.print("Enter you salary:");
        int salary=lk.nextInt();
        System.out.print("Enter you  Age:");

        int age=lk.nextInt();
      
        if (salary>=20000||age<=25) {
            System.out.println("Eligible for loan");
            System.out.println("-YOu need amount-");
            int loa =lk.nextInt();
            if (loa<=50000) {
                System.out.println("loan is yes");
            }  
            else{
                System.out.println("max amount is 50000");
            }
        }
        
        else{
            System.out.println("No loan for you");
        }
    }
}
