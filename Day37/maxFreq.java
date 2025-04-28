package Day37;

import java.util.ArrayList;
import java.util.HashMap;

public class maxFreq {
    int maxFreq(ArrayList<Integer>arr){
        HashMap<Integer,Integer>mp  = new HashMap<>();
        int maxi = 0;
        for(int e : arr){
            if(mp.containsKey(e)){
                mp.put(e, mp.get(e)+1);
            }else mp.put(e, 1);

            maxi = Math.max(maxi,mp.get(e));
        }
        return maxi;
    }
    public static void main(String[] args) {
        
    }
}
