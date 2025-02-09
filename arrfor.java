import java.util.Scanner;
public class arrfor {

    public static void main(String[] args) {
        Scanner lk=new Scanner(System.in);
        System.out.print("Enter the array value: ");
        int a=lk.nextInt();
        int[] score = new int[a];
        int mv=a/2;
        for (int i = 0; i <=a-1; i++) {
            score[i]=lk.nextInt();
        
        }
        for (int i = 0; i <=a-1; i++) {
            System.out.println("\n\n"+score[i]+"\n\n"); 
        }
      
        if (a%2==0) {
            System.out.println("meddle value "+score[mv-1]);
        }
        else{
            System.out.println("meddle value "+score[mv]);
        }
    }
}