package ClassCode;
/*MAKING THE CUSTOM EXCEPTION*/


//AmountNotEnoughException class must extend Exception
class AmountNotEnoughException extends Exception {
    public String toString() {
        return "AmountNotEnoughException";
    }

    public String getMessage() {
        return "Amount should be greater than 500";
    }

}

//Driver Code
public class JavaExceptionSec {
    public void withDraw(int amount) throws AmountNotEnoughException {
        if (amount < 500) {
            throw new AmountNotEnoughException();
        }
        System.out.println("Thank You");
    }

    public static void main(String[] args) {
        JavaExceptionSec jes = new JavaExceptionSec();
        try {
            jes.withDraw(100);
        } catch (AmountNotEnoughException e) {
            System.out.println(e);
        }
    }
}
