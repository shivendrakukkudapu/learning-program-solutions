public class FinancialForecast { 
   // Recursive method to calculate future value 
   public static double futureValueRecursive(double initialValue, double growthRate, int years) { 
       if (years == 0) { 
           return initialValue; 
       } 
       return (1 + growthRate) * futureValueRecursive(initialValue, growthRate, years - 1); 
   } 
   // Optimized method using memoization 
   public static double futureValueMemoized(double initialValue, double growthRate, int years, 
double[] memo) { 
       if (years == 0) return initialValue; 
       if (memo[years] != 0) return memo[years]; 
       memo[years] = (1 + growthRate) * futureValueMemoized(initialValue, growthRate, years - 1, memo); 
       return memo[years]; 
   } 
} 