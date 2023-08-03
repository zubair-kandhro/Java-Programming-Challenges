package CH5;

public class DistanceTraveled {
    public void distance(int speed, int time){
        int d = speed * time;
        System.out.println("Distance Traveled: " + d);
    }
    public static void main(String[] args){
        DistanceTraveled d = new DistanceTraveled();

        d.distance(80, 60);
    }
}
