
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malij6756
 */
public class A2Q3 {
    private static Direction NORTH;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // creating a new city
        City kw = new City();
        
        // creating robot
        Robot karel = new Robot(kw, 20, -30, Direction.NORTH);
        
        // while karel is not on (0,0), then follow the loop
        while(!(karel.getAvenue() == 0 && karel.getStreet() == 0)) {
        
        // when karel is left of (0,0), he'll turn East and move towards 0
        while(karel.getAvenue() < 0) {
            while(karel.getDirection() != Direction.EAST) {
                karel.turnLeft();
            }
            // karel will move towards 0
            karel.move();
        }
        // while karel is right of (0,0), he'll turn West and move towards 0
            while(karel.getAvenue() > 0) {
                while(karel.getDirection() != Direction.WEST) {
                karel.turnLeft();
                
              }
                //karel will move towards 0
                karel.move(); 
         }
            // If karel is above (0,0), then he'll move SOUTH to the 0
            while(karel.getStreet() > 0) {
                while(karel.getDirection() != Direction.NORTH) {
                    karel.turnLeft();
                    
                }
                // karel will move towards 0
                karel.move();
                
            } 
            // if karel is below (0,0), he'll turn NORTH and head towards 0
                while(karel.getStreet() < 0) {
                    while(karel.getDirection() != Direction.SOUTH) {
                    karel.turnLeft();
                }
                    // karel will move towards 0
                    karel.move();
                }
        
            
            
        
        
        
    }

}
}
