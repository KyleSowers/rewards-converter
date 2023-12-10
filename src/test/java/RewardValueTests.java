import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 0;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(0, milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 0;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(0, rewardValue.getMilesValue(), 0.01);
    }

    @Test
    void convert_from_miles_to_cash() {
        double milesValue = 0;
        var rewardValue = new RewardValue(Integer.toString((int) milesValue));
        assertEquals(0, rewardValue.getCashValue(), 0.01);
    }
}
