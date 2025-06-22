public class Main { 
   public static void main(String[] args) { 
       double initialValue = 10000;   // ₹10,000 
       double growthRate = 0.10;      // 10% annual growth 
       int years = 5; 
       
       System.out.println("Initial Value: "+initialValue); 
       System.out.println("Growth Rate: "+growthRate); 
       System.out.println("Years: "+years); 
       System.out.println("\nRecursive Forecast:"); 
       double result = FinancialForecast.futureValueRecursive(initialValue, growthRate, years); 
       System.out.printf("Future value after %d years: ₹%.2f\n", years, result); 
       System.out.println("\nOptimized Forecast using Memoization:"); 
       double[] memo = new double[years + 1]; 
       double optimizedResult = FinancialForecast.futureValueMemoized(initialValue, growthRate, years, 
memo); 
       System.out.printf("Future value after %d years: ₹%.2f\n", years, optimizedResult); 
   } 
} 