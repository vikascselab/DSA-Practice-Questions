import java.util.*;
import java.io.*;

public class Main{
    public static void main(String [] arg) throws Exception{
        System.out.println("hi how are you");
        
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        int a=Integer.parseInt(br.readLine());
        
        System.out.println(a);
    }
}