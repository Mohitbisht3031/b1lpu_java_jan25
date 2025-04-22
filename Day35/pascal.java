package Day35;

public class pascal {
    int[] pascalTriangle(int nr){
        if(nr == 1){
            return {1};
        }
        if(nr == 2){
            return {1,1};
        }
        int[] prev = {1,1};
        for(int i = 3;i<=nr;i++){
            int cr[] = new int[i];
            cr[0] =1;
            cr[i-1] = 1;
            for(int j = 1;j<i-1;j++){
                cr[j] = prev[j-1]+prev[j];
            }
            prev = cr;
        }

        return prev;
    }
}
