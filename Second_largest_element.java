
//given an integer array a you have to find the second largest element in 
// the array or report no such element exists 


public class Second_largest_element {
    public static void main(String[] args) {
        int a[] = {1,2,10,30,50};
        int max = a[0];
        int s_max = a[0];
        for(int i=0; i<a.length; i++){
            if(a.length<=1){
                System.out.println("element not found");
            }
            if(a[i]>max){
                s_max = max;
                max = a[i];
            }
        }
        System.out.println(s_max);
    }
}
