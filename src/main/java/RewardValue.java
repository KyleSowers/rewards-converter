public class RewardValue {

    //instance variables
    public double cashValue;
    public double milesValue;

    //constructors
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertCashToMiles();
    }

    public RewardValue(String milesValue) {
        this.milesValue = Double.parseDouble(milesValue);
        this.cashValue = convertMilesToCash();
    }

    //getters
    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    //methods of conversion
    private double convertCashToMiles() {
        return cashValue / 0.0035;
    }

    private double convertMilesToCash() {
        return milesValue * 0.0035;
    }

}