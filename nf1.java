
import java.util.Scanner;

public class nf1 {
    public static void main(String[] args) {
        Scanner lk=new Scanner(System.in);
        int a=lk.nextInt();
        // t is used for row
        for (int i = 1; i <=a; i++) {
            // it is used for Space
            for (int j =1; j<=a-i; j++) {
                System.out.print(" ");
            }
            // it is used for coloumn
            for (int j = 1; j<=i; j++) {
                System.out.print( i+" ");
            }
            System.out.println();
        }
    }
}

/* 
   // outer loop to handle lower part
   for (i = n-1; i >= 1; i--) {
    // inner loop to print spaces
    for (j = 1; j <= n - i; j++) {
        System.out.print(" ");
    }
    // inner loop to print stars
    for (j = 1; j <= 2 * i - 1; j++) {
        System.out.print("*");
    }
    System.out.println();
}
} */