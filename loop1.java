import java.util.Scanner;

public class loop1 {
    public static void main(String[] args) {
        Scanner lk=new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        int a=lk.nextInt();
        System.out.print("Enter the value of B: ");
        int b=lk.nextInt();
        
        
        for(int l=a;l<=b;l=l+2)
                 {
                System.out.println(l); 
        }
    }
}
