/*
Given a sequence of N strings,
the task is to check if any two similar words come together 
then they destroy each other than print  the number of words left in the sequence after this pairwise destruction
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] arr = new String[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.next();
        }
        int result = deleteCons(arr,size);
        System.out.println(result);
    }
    public static int deleteCons(String[] arr,int n){
        Stack<String> st = new Stack<>();
        for(String word : arr){
            if(!st.isEmpty() && st.peek().equals(word)){
                st.pop();
            }
            else{
                st.push(word);
            }
        }
        return st.size();
    }
}
