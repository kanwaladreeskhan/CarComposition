package carcomposition;
public class Engine {
    private String enginetype;
    private String fuelType;
    private float oilLevel;
    private float standardoilLevel=25.4f;
    Engine(String enginetype){
         this.enginetype=enginetype;
     }
     public void startEngine(){
        System.out.println("Engine is Starting.....");
     }
      public void stopEngine(){
        System.out.println("Engine is Stoping....."); 
     }
      public void checkoilLevel(){
          if(oilLevel<standardoilLevel){
            System.out.println("Low Oil Level!");
        }else if(oilLevel>standardoilLevel){
            System.out.println("High Oil level!");
        }else{
            System.out.println("Moderate oil level!");
        }
     }
}
