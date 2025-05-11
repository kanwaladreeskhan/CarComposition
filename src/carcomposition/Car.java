package carcomposition;
public class Car {
    Engine engine;
    Capacity capacity;
    Doors door;
    Wheel wheel;
   Car(int passengerCapacity, float fuelCapacity,String enginetype,float pressure){
       engine=new Engine(enginetype); 
       wheel=new Wheel(pressure);
       capacity=new Capacity(passengerCapacity,fuelCapacity);
       door=new Doors();
    } 
    public void startCar(){
        engine.startEngine();
    }
       public void stopCar(){
        engine.stopEngine();
    }
       public void oilLevel(){
           engine.checkoilLevel();
       }
       public void opendoor(){
           door.openDoor();
       }
        public void closedoor(){
           door.closeDoor();
       }
         public void lockdoor(){
           door.lock();
       }
          public void unlockdoor(){
           door.unlock();
       }
          public void takingturn(){
              wheel.takeTurn();
          }
          public void pressureinwheel(){
              wheel.checkPressure();
          }
          public void checkPasseger(){
              capacity.passengerLimit();
          }
          public void checkfuel(){
              capacity.fuelLimit();
          }
  }
