package Day25;

// custom exception class for out selves
class customException extends Exception{
    customException(String msg){
        super(msg);
    }
}

public class customEx {
    static int divide() throws customException{
        try{int d =  10/0;
            return d;
        }catch(Exception ex){
            throw new customException(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        try{
            int d = divide();
            System.out.println("the d of this cal is "+d);
            System.exit(0);
        }catch(ArithmeticException ex){
            System.out.println("Exception caught while trying to divide "+ex);
        }catch(Exception ex){
            System.out.println("in general exception block "+ex);
        }finally{
            System.out.println("Inside finally block!");
        }
    }
}
