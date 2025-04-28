package Day37;

import java.util.ArrayList;

public class pascalUsingAL {
    ArrayList<Integer> pascal(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        if(n == 1){
            return arr;
        }
        arr.add(1);
        if(n == 2)return arr;

        for(int i = 3;i<=n;i++){
            ArrayList<Integer>cr = new ArrayList<>();
            cr.add(1);
            for(int j =1;j<i;j++){
                cr.add((arr.get(i) + arr.get(i-1)));
            }
            arr = cr;
        }

        return arr;
    }
}
