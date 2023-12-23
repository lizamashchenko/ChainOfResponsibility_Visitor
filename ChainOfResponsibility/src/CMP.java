import java.util.*;

public class CMP {
    private int targetSum = 0;
    public List<ChangeHandler> chain = new ArrayList<>();

    public CMP(int targetSum, List<Integer> coinValues) {
        this.targetSum = targetSum;
        ChangeHandler prev = new ChangeHandler(coinValues.get(0), null);
        chain.add(prev);
        for(int i = 1; i < coinValues.size(); i++) {
            ChangeHandler current = new ChangeHandler(coinValues.get(i), prev);
            chain.add(current);
            prev = current;
        }
    }

    public Map<Integer, Integer> solve() {
        chain.get(chain.size() - 1).handle(targetSum);
        return chain.get(chain.size() - 1).getCoinDistribution();
    }
    public int getTargetSum() {
        return targetSum;
    }
}
