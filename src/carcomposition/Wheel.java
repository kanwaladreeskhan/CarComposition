package carcomposition;
public class Wheel {
    private int numberOfWheels;
    private float pressure;
    private float standardpressure=56.3f;
     Wheel(float pressure){
         this.pressure=pressure;
     }
    public void checkPressure(){
        if(pressure<standardpressure){
            System.out.println("Low Pressure in Wheels!");
        }else if(pressure>standardpressure){
            System.out.println("High Pressure in Wheels!");
        }else{
            System.out.println("Moderate Pressure in Wheels!");
        }
        }
    public void takeTurn(){
          System.out.println("Turn is applying.....");
    }
}
