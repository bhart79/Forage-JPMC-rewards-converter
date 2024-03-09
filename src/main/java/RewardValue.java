public class RewardValue {
    double cash;
    double miles;
    public static final double convRate = .0035;
    public RewardValue(double cashValue) {
        cash = cashValue;
    }
    public RewardValue(int milesValue) {
        miles = milesValue;

    }
    public double getCashValue() {
        return miles / convRate;
    }
    public double getMilesValue() {
        return cash * convRate;

    }
}
