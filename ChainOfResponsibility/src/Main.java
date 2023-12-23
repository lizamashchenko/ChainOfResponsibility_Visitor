import java.security.KeyPair;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> coins = Arrays.asList(1, 2, 5, 10, 20, 50);
        CMP cmp = new CMP(170, coins);
        Map<Integer, Integer> res = cmp.solve();
        System.out.println("Target sum -> " + cmp.getTargetSum());
        for (Map.Entry<Integer, Integer> entry : res.entrySet()) {
            System.out.println("Coin of value " + entry.getKey() + "; amount -> " + entry.getValue());
        }
    }
}
