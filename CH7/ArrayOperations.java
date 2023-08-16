package CH7;

public class ArrayOperations {


    public int getTotal(int[] arr){
        return arr.length;
    }

    public double getAverage(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        return ((double)sum/arr.length);
    }
    public double getHighest(int[] arr){
        int max=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public double getLowest(int[] arr){
        int min=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }


    public static  void main(String[] args){
        ArrayOperations op = new ArrayOperations();
        int[] testData= {2,1,9,4};

        System.out.println("\nTotal values in the array: " + op.getTotal(testData));
        System.out.println("Average of the values: " + op.getAverage(testData));
        System.out.println("Highest value in the array: " + op.getHighest(testData));
        System.out.println("Lowest value in the array: " + op.getLowest(testData));

    }
}
