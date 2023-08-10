package CH6;

public class Car {
    int yearModel;
    String make;
    int speed;

    Car(int yearModel, String make){
        this.yearModel = yearModel;
        this.make = make;
        this.speed = 0;
    }
    public int getYearModel(){
        return yearModel;
    }
    public String getMake(){
        return make;
    }
    public int getSpeed(){
        return speed;
    }

    public int accelerate(){
        speed = speed + 5;
        return speed;
    }

    public int brake(){
        speed = speed - 5;
        return speed;
    }
    public static void main(String[] args){
        Car car = new Car(2023, "Honda");
        System.out.println(car.getYearModel());
        System.out.println(car.getMake());
        System.out.println(car.getSpeed());

        car.accelerate();
        System.out.println(car.getSpeed());
        car.accelerate();
        System.out.println(car.getSpeed());
        car.accelerate();
        System.out.println(car.getSpeed());
        car.accelerate();
        System.out.println(car.getSpeed());
        car.accelerate();
        System.out.println(car.getSpeed());

        System.out.println();
        car.brake();
        System.out.println(car.getSpeed());
        car.brake();
        System.out.println(car.getSpeed());
        car.brake();
        System.out.println(car.getSpeed());
        car.brake();
        System.out.println(car.getSpeed());
        car.brake();
        System.out.println(car.getSpeed());

}
}
