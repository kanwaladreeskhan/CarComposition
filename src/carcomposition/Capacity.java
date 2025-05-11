package carcomposition;
public class Capacity {
     private int passengerCapacity;
     private float fuelCapacity;
     private float stdfuelCapacity=25.4f;
    Capacity(int passengerCapacity, float fuelCapacity){
         this.passengerCapacity=passengerCapacity;
         this.fuelCapacity=fuelCapacity;
     }
        public void passengerLimit(){
            if(passengerCapacity<5||passengerCapacity==5){
                System.out.println("Passengers are in Limit!");
            }else{
                 System.out.println("Passengers exceed the Limit!");
            }
        }
          public void fuelLimit(){
            if(fuelCapacity<stdfuelCapacity){
                System.out.println("Fuel can be filled!");
            }else if(fuelCapacity>stdfuelCapacity){
                 System.out.println("Fuel exceeds the Limit,you should drain it!");
            }else{
                 System.out.println("Fuel is in limit!");
            }
        }
}
