import PaymentStrategy.CreditCardStrategy;

public class Dmart extends Shopping{

    public Dmart(){
       super(new CreditCardStrategy("123456789", "123"));
   }
}
