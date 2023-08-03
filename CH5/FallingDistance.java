package CH5;

public class FallingDistance {

    public double fallingDistance(int seconds){
        double d = 0.5 * (9.8 * seconds * seconds);
        return d;
    }
    public static void main(String[] args){
        FallingDistance d = new FallingDistance();

        for(int i=1; i<=10; i++) {
            System.out.printf("Object has fallen %.2f meters during " + i + " seconds", d.fallingDistance(i));
            System.out.println();
        }
    }
}
