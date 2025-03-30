import PaymentStrategy.DebitCardStrategy;

public class Mall extends Shopping{
    public Mall(){
        super(new DebitCardStrategy(674664647, 12));
    }
}
