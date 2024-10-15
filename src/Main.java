import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    /**
     * Mean Methods
     */

    public static int meanTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        int total = 0;
        for(int i = 0; i < totalWasteKgPerCapitaPerYear.length; i++){
            total += totalWasteKgPerCapitaPerYear[i];
        }
        return total/totalWasteKgPerCapitaPerYear.length + 1;
    }

    public static int meanHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        int total = 0;
        int mean =0;
        for(int i = 0; i<householdEstimatesKgPerCapitaPerYear.length;i++){
            total += householdEstimatesKgPerCapitaPerYear[i];
        }
        mean = total/householdEstimatesKgPerCapitaPerYear.length + 1;
        return mean;
    }

    public static int meanHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int meanRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        int b = 0;
        for (int i : retailEstimatesKgPerCapitaPerYear) {
            b = b + retailEstimatesKgPerCapitaPerYear[i];
        }
        b = b / retailEstimatesKgPerCapitaPerYear.length;
        return b;
    }

    public static int meanRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        int a = 0;
        for (int i=0;i<retailEstimatesTonnesPerYear.length;i++) {
            a += retailEstimatesTonnesPerYear[i];
        }
        a = a / retailEstimatesTonnesPerYear.length;
        return a;
    }

    public static int meanFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        double sum = 0;
        for (int i:foodServiceEstimatesKgPerCapitaPerYear){
            sum = sum + i;
        }
        double mean = (sum/foodServiceEstimatesKgPerCapitaPerYear.length)+0.5;
        return (int)mean;
    }

    public static int meanFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Median Methods
     */

    public static int medianTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int medianRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        int median = 0;
        Arrays.sort(retailEstimatesKgPerCapitaPerYear);
        int middle = retailEstimatesKgPerCapitaPerYear[retailEstimatesKgPerCapitaPerYear.length/2];
        if(retailEstimatesKgPerCapitaPerYear.length%2 == 0){
            int secondValue = retailEstimatesKgPerCapitaPerYear[retailEstimatesKgPerCapitaPerYear.length/2+1];
            median = (middle + secondValue)/2;
        }
        else{
            median = middle;
        }


        return median;
    }

    public static int medianRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int medianFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Min Methods
     */

    public static int minTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        int minVal = totalWasteKgPerCapitaPerYear[0];
        for (int i : totalWasteKgPerCapitaPerYear) if (minVal > i) minVal = i;
        return minVal;
    }

    public static int minHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int minRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int minFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Max Methods
     */
    
    public static int maxTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        int max = totalWasteKgPerCapitaPerYear[0];
        for(int val: totalWasteKgPerCapitaPerYear){
            if(val>max){
                max = val;
            }
        }
        return max;
    }

    public static int maxHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int maxRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        if (retailEstimatesKgPerCapitaPerYear == null || retailEstimatesKgPerCapitaPerYear.length == 0) {
            return -1;
        }
        int mv = retailEstimatesKgPerCapitaPerYear[0];
        for (int e : retailEstimatesKgPerCapitaPerYear) {
            if (e > mv) {
                mv = e;
            }
        }
        return mv;
    }

    public static int maxRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear) {
        if (retailEstimatesTonnesPerYear == null || retailEstimatesTonnesPerYear.length == 0) {
            return -1;
        }
        int me = retailEstimatesTonnesPerYear[0];
        for (int e : retailEstimatesTonnesPerYear) {
            if (e > me) {
                me = e;
            }
        }
        return me;
    }

    public static int maxFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Misc Methods
     */

    public static int getCountryTotalWastePerYear(String country, String[] countries, int[] totalWasteKgPerCapitaPerYear)
    {
        int indexofcountry=0;
        for(int i=0;i<totalWasteKgPerCapitaPerYear.length;i++){
            if(countries[i].equals(country)){
                indexofcountry=i;
            }
        }
        return totalWasteKgPerCapitaPerYear[indexofcountry];
    }

    public static String getCountryWithMostWastePerCapita(String[] countries, int[] totalWasteKgPerCapitaPerYear)
    {
        int max=totalWasteKgPerCapitaPerYear[0];
        int indexmax=0;
        for(int i=0;i<totalWasteKgPerCapitaPerYear.length;i++){
            if(totalWasteKgPerCapitaPerYear[i]>max){
                max=totalWasteKgPerCapitaPerYear[i];
                indexmax=i;
            }
        }
        return ""+countries[indexmax];
    }

    public static String[] getCountriesWithHighestPovertyPercentage(String[] countries, double[] percentagesShareInPoverty)
    {
        double maxPoverty = -1;
        for (double poverty : percentagesShareInPoverty) {
            if (poverty > maxPoverty) {
                maxPoverty = poverty;
            }
        }
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < percentagesShareInPoverty.length; i++) {
            if (percentagesShareInPoverty[i] == maxPoverty) {
                result.add(countries[i]);
            }
        }

        return result.toArray(new String[0]);
    }

    public static String[] getCountriesWithHighConfidence(String[] countries, String[] confidences)
    {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < confidences.length; i++) {
            if (confidences[i].equals("High Confidence")) {
                result.add(countries[i]);
            }
        }
        return result.toArray(new String[0]);
    }
}
