
//write a program to find sum of core element of a matrix :
import java.util.Scanner;

public class Core_elementsSum {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows and columns:");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        int sum = 0;

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        } 

        // Sum of core elements
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(i != 0 && i != r-1 && j != 0 && j != c-1){
                    sum = sum + a[i][j];
                }
            }
        }

        System.out.println("Sum of core elements = " + sum);
    }
}

    

