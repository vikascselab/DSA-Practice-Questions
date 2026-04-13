import java.util.*;

public class Main{
    public static void main(String [] arg){
        System.out.println("welcome");
        
        Scanner Input= new Scanner(System.in);
        
        String str=Input.nextLine();
        
        if(str.startsWith("[") && str.endsWith("]")){
            str=str.substring(1,str.length()-1);
        }
        
        String ch[]=str.split(",");
        
        ArrayList<Integer> arr= new ArrayList<> ();
        
        for(String token: ch ){
            int num=Integer.parseInt(token);
            arr.add(num);
        }
        
        for( int a:arr){
            System.out.println(a);
        }
    }
    
    
}