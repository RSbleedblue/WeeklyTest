/*
Take an integer array arr as input and print "true" if any value appears at least twice in the array, else print "false" if every element is distinct.
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
        boolean res = isDuplicate(arr);
        System.out.println(res);
    }
    public static boolean isDuplicate(int arr[]){
        boolean ans = false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getValue() > 1){
                ans = true;
                return ans;
            }
        }
        return ans;
    }
}
