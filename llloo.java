import java.util.Scanner;

class llloo {
    public static void main(String[] args) {
       Scanner lk=new Scanner(System.in);
       System.out.println("enter m: ");
       int m=lk.nextInt();
       System.out.println("enter n: ");
       int n=lk.nextInt();
       int u=0;
       for (int i =m; i <=n; i++) {
        if (i%2==0) {
          //  System.out.println(i);           
        }
        else{
            System.out.println(i+" is odd number");
                u++;       
        }
    
       }
       System.out.println("total in odd numbers we sheen :"+u);
    }
}