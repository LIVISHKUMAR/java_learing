public class fumper {
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void min(int a,int b){
        System.out.println(a-b);
    }
    void div(int a,int b){
        System.out.println(a%b);
    }
    void mult(int a,int b){
        System.out.println(a*b);
    }
    public static void main(String[] args) {
        fumper add=new fumper();
        add.sum(35,49);
        add.min(21,22);
        add.div(31,42);
        add.mult(54,76);
    }
}
