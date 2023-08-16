public class _2DArrayOperations {
    public static int getTotal(int[][] arr) {
        int total = 0;
        for (int[] row : arr) {
            for (int value : row) {
                total += value;
            }
        }
        return total;
    }

    public static double getAverage(int[][] arr) {
        int total = getTotal(arr);
        return (double) total / (arr.length * arr[0].length);
    }

    public static int getRowTotal(int[][] arr, int rowIndex) {
        int total = 0;
        for (int value : arr[rowIndex]) {
            total += value;
        }
        return total;
    }

    public static int getColumnTotal(int[][] arr, int columnIndex) {
        int total = 0;
        for (int[] row : arr) {
            total += row[columnIndex];
        }
        return total;
    }

    public static int getHighestInRow(int[][] arr, int rowIndex) {
        int highest = arr[rowIndex][0];
        for (int value : arr[rowIndex]) {
            if (value > highest) {
                highest = value;
            }
        }
        return highest;
    }

    public static int getLowestInRow(int[][] arr, int rowIndex) {
        int lowest = arr[rowIndex][0];
        for (int value : arr[rowIndex]) {
            if (value < lowest) {
                lowest = value;
            }
        }
        return lowest;
    }

    public static void main(String[] args) {
        int[][] testData = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        System.out.println("Total: " + getTotal(testData));
        System.out.println("Average: " + getAverage(testData));
        System.out.println("Total of row 2: " + getRowTotal(testData, 1));
        System.out.println("Total of column 1: " + getColumnTotal(testData, 0));
        System.out.println("Highest in row 0: " + getHighestInRow(testData, 0));
        System.out.println("Lowest in row 2: " + getLowestInRow(testData, 2));
    }
}
