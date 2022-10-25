import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;

public class ReverseMaxPossibleNumber {
    public static void main(String[] args) {
        int[] a = { 50, 2, 1, 9 };
        int len = a.length;
        String ch = "";
        List<Map<String, ArrayList<String>>> list_map = new ArrayList<Map<String, ArrayList<String>>>();
        Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for (int i = 0; i < len; i++) {
            ch = "" + a[i];
            String str = "";
            ArrayList<String> arraylist = new ArrayList<String>();
            for (int j = 0; j < len; j++) {
                str = "" + a[j];
                if (ch.charAt(0) == str.charAt(0)) {
                    arraylist.add(str);
                    Collections.sort(arraylist);
                    map.put("" + ch.charAt(0), arraylist);
                }
            }
        }
        list_map.add(map);
        String str = "";
        for (String key : map.keySet()) {
            str = map.get(key) + str;

        }
        str = str.replaceAll("\\D+", "");
        System.out.println(str);
    }
}