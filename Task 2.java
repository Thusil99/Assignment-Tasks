import java.io.*;
import java.util.*;
import java.util.Iterator;
 
class GFG {


    public static void main(String[] args)
    {
 
    
        List<String> list1 = new ArrayList<String>();
        
        list1.add("Geeks");
        list1.add("Geeks");
        list1.add("portal");
 
        
        List<String> list2 = new ArrayList<String>();
 
        
        list2.add("for");
        list2.add("is CSE");
        list2.add("portal");
 
        
        System.out.print("List1 contents: ");

        Iterator iterator = list1.iterator();
 

        while (iterator.hasNext()) {
 
            
            System.out.print(iterator.next() + " ");
        }
 
    
        System.out.println();
 
        
        System.out.print("List2 contents: ");

    
        iterator = list2.iterator();
 
        
        while (iterator.hasNext()) {
 
            
            System.out.print(iterator.next() + " ");
        }
 
        
        int i = 0;
        int j = 0;
 
        
        List<String> merged_list = new ArrayList<String>();
 

        while (i < list1.size() && j < list2.size()) {
 
            
            merged_list.add(list1.get(i));
 
            
            merged_list.add(list2.get(j));

            
            i++;
            j++;
        }
 
        
        while (i < list1.size()) {
            merged_list.add(list1.get(i));
 
            
            i++;
        }
 
        
        while (j < list2.size()) {
            merged_list.add(list2.get(j));
 
            
            j++;
        }
 

        System.out.println();
 
    
        System.out.print("Merged List contents: ");
 
    
        iterator = merged_list.iterator();
 
    
        while (iterator.hasNext()) {
 
        
            System.out.print(iterator.next() + " ");
        }
    }
}