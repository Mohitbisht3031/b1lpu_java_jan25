package Day25;

import java.util.Scanner;

public class tryWithResource {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int v = sc.nextInt();
            int d = 10/v;
            System.out.println("Value is "+d);
        }catch(Exception ex){
            System.out.println("the vlaue of ex is "+ex);
        }
    }
}
