package Day26;

public class assertionEx {
    public static void main(String[] args) {
        try{
            int val = -1;
            assert cal < 0 : "Value have to be +ve";
            System.out.println("the value is +ve");
        }catch(AssertionError ex){
            System.out.println("caught assert exception "+ex);
        }
    }
}
