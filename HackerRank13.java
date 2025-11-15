import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);       
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        checkPrime(a);
        checkPrime(a, b);
        checkPrime(a, b, c);
        checkPrime(a, b, c, d, e);
        
    }
    private static void checkPrime(int... nums){
        for(int val:nums){
            if(Isprime(val)){
                System.out.print(val+" ");
            }
        }
        System.out.println();
    }
    private static boolean Isprime(int n){
        if(n<2) return false;
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
