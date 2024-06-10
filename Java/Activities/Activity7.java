public class Activity7 {
    public static void main(String[] args) {
        MountainBike obj = new MountainBike(4, 0, 12);
        System.out.println(obj.bicycleDesc());
        obj.speedUp(20);
        obj.applyBrake(5);
    }
    
}
interface BicycleParts {
    public int gears = 0;
    public int currentspeed = 0;
}
interface BicycleOperations {
    public void applyBrake(int decrement);
    public void speedUp(int increment);
}
class Bicycle implements BicycleParts , BicycleOperations{
    public int gears;
    public int currentspeed;
    public Bicycle(int gears, int currentspeed){
        this.gears = 4;
        this.currentspeed = 12;
    }
    public void applyBrake(int decrement){
        currentspeed -= decrement;
        System.out.println("Current speed: " + currentspeed);
    }
    public void speedUp(int increment){
        currentspeed += increment;
        System.out.println("Current speed: " + currentspeed);
    }
    //Method to print info of Bicycle
    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentspeed);
    }
}
class MountainBike extends Bicycle{
    public int seatHeight;
    public MountainBike(int gears, int currentspeed, int startheight) {
        super(gears, currentspeed);
        seatHeight = startheight;
    }
        public void setHeight(int newValue) {
            seatHeight = newValue;
        }
        public String bicycleDesc() {
            return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
        } 
        
}
