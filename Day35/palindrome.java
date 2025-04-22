package Day35;

public class palindrome {
        boolean palindrome(String num){
            int i = 0;
            int j = num.length()-1;
            while(i < j){
                if(num.charAt(i).equals(num.charAt(j))){
                    i++;
                    j--;
                    continue;
                }
                return false;
            }
            return true;
        }
}
