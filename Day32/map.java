package Day32;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<String,Integer> mp = new LinkedHashMap<>();
        mp.put("Mohit",1);
        mp.put("Abhi",2);
        mp.put("Medha",0);

        for(String v : mp.keySet()){
            System.out.println("the value of key "+v+" the value is "+mp.get(v));
        }

    }
}
