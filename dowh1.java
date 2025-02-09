import java.util.Scanner;

public class dowh1 {
    public static void main(String[] args) {
        Scanner lk=new Scanner(System.in);
        int count=0;
        do { 
            System.out.println("Enter the number > 10 : ");
            count=lk.nextInt();
        } while (count<10);

        System.out.println("the gater then value"+count);
    }
}
