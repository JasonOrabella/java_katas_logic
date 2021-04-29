package babysitter;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

//start =0
//midnight=7
//4 am =11
public class BabySitterTest {
    @Test
    public void oneHourPreBedTimeShouldPay12() {
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage(0, 1, 3);
        assertThat(wage).isEqualTo(12);
    }

    @Test
    public void oneHourPostBedtimeShouldPay8() {
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage(3, 4, 3);
        assertThat(wage).isEqualTo(8);
    }

    @Test
    public void midnightToEndOfShift() {
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage(7, 11, 5);
        assertThat(wage).isEqualTo(64);
    }

    @Test
    public void startBeforeKidsAsleepAndWorkUntil2Am() {
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage(1, 11, 5);
        assertThat(wage).isEqualTo(128);
    }

    @Test
    public void startAfterBedtimeTooMidnight() {
        WageCalculator underTest = new WageCalculator();
        int wage = underTest.calculateShiftWage(6, 7, 6);
        assertThat(wage).isEqualTo(8);

    }
}
