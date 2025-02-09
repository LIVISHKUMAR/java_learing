
import java.util.Scanner;

public class fordivi {
    public static void main(String[] args) {
        Scanner lk=new Scanner(System.in);
        int a=lk.nextInt();
        int b=lk.nextInt();
        for (int i = a; i <=b; i++) {
            if(i%3==0 && i%5==0){
                System.out.println(i+" Divied by 3&5");
            }
            else{
                //no need to print
            }
            
        }
    }
    
}
