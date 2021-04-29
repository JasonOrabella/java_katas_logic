package babysitter;

public class WageCalculator {
    public int calculateShiftWage(int startingHour, int endingHour, int bedtime) {
        int wage = 0;
        int midnight = 7;
        int hourlyRateBeforeBedtime = 12;
        int hourlyRateBetweenBedtimeAndMidnight = 8;
        int hourlyRateAfterMidnight = 16;
        int endTimeLim = 11;

        if (startingHour <= bedtime) {
            if (endingHour < bedtime) {
                wage = hourlyRateBeforeBedtime * (endingHour - startingHour);
            } else if ((endingHour < midnight) && (endingHour > bedtime)&&((endingHour-startingHour)>=3)) {
                wage = (hourlyRateBeforeBedtime * (bedtime - startingHour)) +
                        (hourlyRateBetweenBedtimeAndMidnight * (midnight - bedtime)) +
                        ((hourlyRateAfterMidnight * (endingHour - midnight)));
            }else if ((endingHour <= midnight) && (endingHour > bedtime)&&((endingHour-startingHour)<3)) {
                    wage = (hourlyRateBetweenBedtimeAndMidnight * (endingHour-startingHour));
            }else if(endingHour>midnight){
                    wage = (hourlyRateBeforeBedtime * (bedtime - startingHour)) +
                            (hourlyRateBetweenBedtimeAndMidnight * (midnight - bedtime)) +
                            ((hourlyRateAfterMidnight * (endingHour - midnight)));
                }
            }
         else if (startingHour > bedtime) {
            if (endingHour < midnight) {
                wage = (hourlyRateBeforeBedtime * (endingHour - startingHour));
            } else if ((endingHour <= endTimeLim) && (endingHour > midnight)) {
                wage = (hourlyRateBetweenBedtimeAndMidnight * (midnight - startingHour)) +
                        ((hourlyRateAfterMidnight * (endingHour - midnight)));

            }
            }
            return wage;
        }
    public class WageCalculatorException{

    }
    }
