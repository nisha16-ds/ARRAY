// sum of each row of matrix
// Sum of each row of a matrix
import java.util.Scanner;
public class Rows_matrix_sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("No. of rows: ");
        int r = sc.nextInt();
        
        System.out.print("No. of columns: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        System.out.println("Enter array elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Sum of each row:");
        for (int i = 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++) {
                sum += arr[i][j];
            }
            System.out.println("Row " + (i + 1) + " sum = " + sum);
        }
    }
}


    

