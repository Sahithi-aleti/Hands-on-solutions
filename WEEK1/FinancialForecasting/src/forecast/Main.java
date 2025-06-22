package forecast;


public class Main {
 public static void main(String[] args) {
     double presentValue = 10000; 
     double growthRate = 0.08;   
     int years = 5;

     double forecastedValue = FinancialForecast.futureValue(presentValue, growthRate, years);
     System.out.printf(" Forecasted Value after %d years: ₹%.2f%n", years, forecastedValue);
 }
}
