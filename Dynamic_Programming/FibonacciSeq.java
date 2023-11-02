package Dynamic_Programming;
import java.util.*;
//Fibonacci sequence problem, naive approach using DP
//Sequence: 0,1,1,2,3,5,8,13,21...
public class FibonacciSeq{

    //this is a naive approach on solving the problem with poor time complexity O(2^n)
    //but we can improve it by utilizing dp
    public static int fib(int n){
        if(n < 2){ //this if statement just checks if our input is 0 or 1
                   //to return it
            return n;
        }else
        return fib(n - 1) + fib(n - 2);
    }
    

    //dp approach using memoization, time complexity O(n)
    public static int fibMemoization(int n, Map<Integer,Integer> cache){
        if(n < 2)
            return n;
        
        if(cache.containsKey(n))//this if statement checks the pairs in which a key and value is paired
                                //for example the fib seq. (0:1),(1:1),(2:1),(3:2),(4:3),(5:5)(6:8)(7:13)
            //the .get(n) method gets the key in the map and returns the value so for example it can take the
            //6-key and return 8.
            return cache.get(n);
        
        int result = fibMemoization(n - 1, cache) + fibMemoization(n - 2, cache);
        //here we add the key-value pair to the map
        cache.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        Map<Integer,Integer> memo = new HashMap<>();
        int n = 7; //desired fib number to compute
        int result1 = fib(n);
        int result2 = fibMemoization(n, memo);

        System.out.println("Fibonacci (Naive Approach): "+ n + " = " + result1);
        System.out.println("Fibonacci (DP Technique): "+ n + " = " + result2);
}
}