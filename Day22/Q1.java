package Day22;

import java.util.Arrays;

public class Q1 {
    char uniqueChar(char arr[]){
        for(int i = 0;i<arr.length;i++){
            boolean f = true;
            for(int j = 0;j<arr.length;j++){
                if(i!=j && arr[i] == arr[j]){
                    f = false;
                    break;
                }
            }
            if(f)return arr[i];
        }
        return ' ';
    }

    char uniqueChar2(char[] arr){
        if(arr.length == 1)return arr[0];
        Arrays.sort(arr);
        for(int i = 1;i<arr.length-1;i++){
            if(arr[i] != arr[i-1] && arr[i] != arr[i+1])return arr[i];
        }
        if(arr[0] != arr[1])return arr[0];
        if(arr[arr.length-1] != arr[arr.length-2])return arr[arr.length-1];
        return ' ';
    }
}
