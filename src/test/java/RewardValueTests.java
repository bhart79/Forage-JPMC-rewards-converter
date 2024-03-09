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
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        var miles = new RewardValue(cashValue);
        int CMilesValue = (int) (cashValue / RewardValue.convRate);
        assertEquals(miles, (CMilesValue));

    }

    @Test
    void convert_from_miles_to_cash() {
        double milesValue = 10000;
        var cash = new RewardValue(milesValue);
        double CCashValue = (milesValue * RewardValue.convRate);
        assertEquals(cash, CCashValue);
    }
}
