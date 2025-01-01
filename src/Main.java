import jdk.swing.interop.DropTargetContextWrapper;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args) {
        //printTriangle();
        printInvertedTriangle();
    }
public static void printTriangle() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the number of row of triangle");
    int row = scanner.nextInt();
    scanner.close();
    for (int i = 0; i <= row; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }

        System.out.println("");
    }
}
    public static void printInvertedTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of row of triangle");
        int row = scanner.nextInt();
        scanner.close();
        for (int i = row; i >=0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println("");
        }
    }
}
