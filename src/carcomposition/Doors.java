package carcomposition;
public class Doors {
    private int numberofDoors;
    private String doorType;
    private Boolean lockStatus;
 public void openDoor(){
           System.out.println("Door has been opened!");
     }
      public void closeDoor(){
              System.out.println("Door has been closed!");
     }
       public void lock(){
              System.out.println("Door has been locked!");
     }
        public void unlock(){
              System.out.println("Door has been unlocked!");
     }
}
