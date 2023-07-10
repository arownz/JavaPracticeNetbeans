public class methods{
    public void full(){
        System.out.println("the car is going full speed");
    }
    public void speed(int maxspeed){
        System.out.println("the car full speed is: " + maxspeed);
    }
    public static void main (String[] args){
        methods car = new methods();
        car.full();
        car.speed(200);
    }
}