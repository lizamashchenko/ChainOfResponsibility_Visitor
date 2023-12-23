import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;

public class ChangeHandler implements Handler
{
    private static Map<Integer, Integer> coinCounter = new Hashtable<>();
    private int value = 0;
    private ChangeHandler nextHandler;

    public ChangeHandler(int value, ChangeHandler next) {
        this.value = value;
        nextHandler = next;
    }

    public Map<Integer, Integer> getCoinDistribution() {
        return coinCounter;
    }

    @Override
    public void handle(int amount) {
        int coinAmount = amount / value;
        int remainder = amount - coinAmount * value;

        coinCounter.put(value, coinAmount);
        if(remainder > 0 && nextHandler != null) {
            nextHandler.handle(remainder);
        }
    }
}
