package Day35;

import java.util.HashMap;

public class missing {
    // TC :O(n^2) , SC:O(1)
    int missingElement(int arr[]){
        for(int i = 0;i<=arr.length;i++){
            boolean f = false;
            for(int j = 0;j<arr.length;j++){
                if(arr[j] == i){
                    f = true;
                    break;
                }
            }
            if(!f)return i;
        }
        return -1;
    }

    // TC : O(n) , SC:O(n)
    int missingElement(int arr[]){
        HashMap<Integer,Integer>mp = new HashMap<>();
        for(int e : arr)mp.put(e, 1);
        for(int i = 0;i<=arr.length;i++){
            if(mp.containsKey(i))continue;
            return i;
        }
        return -1;

    }
    // TC : O(n) , SC:O(1)
    int missingElement(int arr[]){
        int s = 0;
        for(int e : arr)s+=e;
        int ts =(n*(n+1))/2;
        return ts - s;
    }

}
