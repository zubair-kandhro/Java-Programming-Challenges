package CH7;

public class Rainfall {
    double[] monthlyRain;
    double total=0;

    Rainfall(double[] monthlyRain){
        this.monthlyRain = monthlyRain;
    }
    public double totalRainfall(){
        for(int i=0; i<monthlyRain.length; i++){
            total = total + monthlyRain[i];
        }
        return  total;
    }

    public double averageRainfall(){
        for(int i=0; i<monthlyRain.length; i++){
            total = total + monthlyRain[i];
        }
        return  total/monthlyRain.length;
    }

    public int maxRainMonth(){
        int max = 0;
        for(int i =1; i<monthlyRain.length; i++){
            if(monthlyRain[i] > monthlyRain[max]){
                max = i;
            }
        }
        return max + 1;
    }

    public int minRainMonth(){
        int min = 0;
        for(int i =1; i<monthlyRain.length; i++){
            if(monthlyRain[i] < monthlyRain[min]){
                min = i;
            }
        }
        return min + 1;
    }

    public static void main(String[] args){
        double monthlyRain[] = {12.3, 2.3, 1.0, 9.6, 6.5, 4, 13.5, 4.4, 3.5, 4, 2.0, 12.9 };
        Rainfall r = new Rainfall(monthlyRain);


        System.out.println("Total rainfall for the year: " + r.totalRainfall());
        System.out.printf("Average monthly rainfall : %.2f", r.averageRainfall());
        System.out.println();
        System.out.println("The month " + r.maxRainMonth() + " has the most rain");
        System.out.println("The month " + r.minRainMonth() + " has the least rain");
        
    }
}
