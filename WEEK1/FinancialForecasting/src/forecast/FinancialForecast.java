package forecast;


public class FinancialForecast {

    // Recursive method to calculate future value
    public static double futureValue(double presentValue, double rate, int years) {
        if (years == 0) {
            return presentValue; // Base case
        }
        return (1 + rate) * futureValue(presentValue, rate, years - 1);
    }
}
