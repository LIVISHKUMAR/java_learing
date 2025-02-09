
import java.util.Scanner;

public class van {
    public static void main(String[] args) {
        Scanner lk=new Scanner(System.in);
        int l=lk.nextInt();
        if (l>=35&&l<59) {
            System.out.println("ps5");
        }
       else if (l>=60&&l<89) 
        {
        System.out.println("s25 ultra");    
        }
      else  if (l>=90) {
            System.out.println("LOQ lqptop pro");
        }
    }
}
