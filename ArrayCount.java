// given -N array
//find count no. of elements having atleast 1 element greater than itself.

//EXAMPLE: [-2,5,3,4,7,8,6]
//count=6                          max_element= 8

//Objective >: for every max element there won't be any element greater than
public class ArrayCount {
    public static void main(String[] args) {

        // Given array
        int arr[] = {5, 3, 9, 2, 9, 1};
        int max = arr[0];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }

        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < max) {
                count++;
            }
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Count element: " + count);
    }
}









    

