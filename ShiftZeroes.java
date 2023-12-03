/*Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        shiftZeroes(arr);
    }
    public static void shiftZeroes(int arr[]){
        Stack<Integer> st = new Stack<>(); 
        int start = 0;
        for(int i = 0; i < arr.length; i++){
            int cVal = arr[i];
            if(cVal!=0){
                st.push(cVal);
                start++;
            }
        }
        int zeroesC = arr.length - start;
        int i = 0;
        while(i < zeroesC){
            st.push(0);
            i++;
        }
        int j = 0;
        while(!st.isEmpty()){
            arr[j] = st.pop();
            j++;
        }
        reverse(arr);
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
    public static void reverse(int arr[]){
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
