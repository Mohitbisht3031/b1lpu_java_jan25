package Day34;

import java.util.HashMap;

import Day17.inhert;

public class Majority {
    // TC : O(n^2) and sc : O(1)
    int majorityElement(int nums[]){
        for(int  i = 0;i<nums.length;i++){
            int c = 0;
            for(int j = 0;j<nums.length;j++){
                if(nums[i] == nums[j])c++;
            }
            if(c >= (nums.length)/2)return nums[i];
        }
        return -1;
    }

    // Optimized
    // TC : O(n) , sc : O(n)
    int majorityElement(int nums[]){
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int e : nums){
            if(mp.containsKey(e)){
                int v = mp.get(e);
                mp.remove(e);
                mp.put(e, v+1);
            }else{
                mp.put(e, 1);
            }
            int v = mp.get(e);
            if(v >= (nums.length)/2)return e;
        }

        return -1;
    }

    // TC : O(n) , SC :O(1)
    int majorityElement(int nums[]){
        int c = 1;
        int n = nums[0];
        for(int e : nums){
            if(n == e)c++;
            else c--;
            if(c == 0){
                c =1;
                n = e;
            }
        }
        return n;
    }
}
