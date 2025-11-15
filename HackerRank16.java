import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        child obj=new child();
        obj.func();
    }
}
class parent{
    public void func(){
        System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
    }
}
class child extends parent{
    
    @Override
    public void func(){
        System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");
        super.func();
    }
}
