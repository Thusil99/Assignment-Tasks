import java.util.*;
 
public class GFG {
    public static void main(String args[])
    {
 
        
        List<Integer> list = new ArrayList<Integer>();
        int sum = 0;
        int count = 0;
 
    
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
 
        
        while (list.size() > count) {
 
            
            sum += list.get(count);
 
            
            count++;
        }
        
        System.out.println(" The sum of list is: " + sum);
    }
}