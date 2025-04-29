package Day38;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class kFreq {
    ArrayList<Integer> kFrequent(ArrayList<Integer>arr){
        HashMap<Integer,Integer>mp = new HashMap<>();
        for(int e : arr){
            if(mp.containsKey(e)){
                mp.put(e, mp.get(e)+1);
            }else mp.put(e, 1);
        }
        ArrayList<Integer>a = new ArrayList<>(mp.keySet());
        Collection.sort(a,(x,y) -> mp.get(y) - mp.get(x)); // sorting the keys in desc order based on there freq.
        ArrayList<Integer>ans = new ArrayList<>();
        for(int i = 0;i<k;i++){
            ans.add(a.get(i));
        }

        return ans;
    }
}
