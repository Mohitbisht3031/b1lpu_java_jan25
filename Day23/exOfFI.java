package Day23;

import java.util.ArrayList;
import java.util.Comparator;

public class exOfFI {
    public static void main(String[] args) {
       ArrayList<String> arr= new ArrayList();
       arr.add("Mohit");
       arr.add("Rohit");
       arr.add("Abhishek");
       arr.add("Medha");

       Comparator<String> lc =  (String s1,String s2) -> Integer.compare(s1.length(), s2.length());

       arr.sort(lc);

       System.out.println(arr);
    }
}
