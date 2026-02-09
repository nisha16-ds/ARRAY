// given an array element, check if there exist a pair (i,j) such that arr[i] + arr[j] == k and i !=j
// note : i and j are index value and the k is given sum

public class Pair_sum {
    public static void main(String[] args) {
        int[] arr = {12,21,24,11,34,22};
        int k = 23;
        boolean found = false;
        for(int i =0;i< arr.length;i++){
            for(int j =i+1;j< arr.length;j++){
                if((arr[i]+arr[j]==k) && i!=j){
                    found=true;
                }
            }
        }
        if(found==true){
            System.out.println("yes pairs exist");
        }else{
            System.out.println("no pairs exist");
        }
    }
}
