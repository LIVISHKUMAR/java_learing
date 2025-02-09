
import java.util.Scanner;

public class Mark {
    public static void main(String[] args) {
        Scanner lk=new Scanner(System.in);
        int t=lk.nextInt();
        int e=lk.nextInt();
        int m=lk.nextInt();
        int s=lk.nextInt();
        int ss=lk.nextInt();
        int all=t+e+m+s+ss;
        int k=all/5;
        if(k>35){
            System.out.println("Your good to go");
        }
        else{
            System.out.println("you need more training");
        }
        }
    }
    
