/*
Given an array H representing heights of buildings. You have to count the buildings which will see the sunrise (Assume : Sun rise on the side of array starting point).
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        int result = facingSun(arr);
        System.out.println(result);
    }
    public static int facingSun(int arr[]){
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < arr.length;i++){
            int cVal = arr[i];
            if(!st.isEmpty() && cVal > st.peek()){
                st.push(cVal);
            }
            else if(st.isEmpty()){
                st.push(cVal);
            }
            else{
                continue;
            }
        }
        return st.size();
    }
}
