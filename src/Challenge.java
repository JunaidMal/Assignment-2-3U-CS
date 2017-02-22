
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malij6756
 */
public class Challenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new city called driveway
        City driveway = new City();
        // new robot named bob who will clear the driveways, represents karel
        Robot bob = new Robot(driveway, 0, 0, Direction.SOUTH);
        // new robot named jeb who will clear the sidewalk, represents tina
        Robot jeb = new Robot(driveway, 0, 0, Direction.SOUTH);

        // creating street
        new Wall(driveway, 0, -2, Direction.WEST);
        new Wall(driveway, 1, -2, Direction.WEST);
        new Wall(driveway, 2, -2, Direction.WEST);
        new Wall(driveway, 3, -2, Direction.WEST);
        new Wall(driveway, 4, -2, Direction.WEST);
        new Wall(driveway, 5, -2, Direction.WEST);
        new Wall(driveway, 6, -2, Direction.WEST);
        new Wall(driveway, 7, -2, Direction.WEST);
        new Wall(driveway, 8, -2, Direction.WEST);
        new Wall(driveway, 9, -2, Direction.WEST);

        new Wall(driveway, 0, -1, Direction.EAST);
        new Wall(driveway, 1, -1, Direction.EAST);
        new Wall(driveway, 2, -1, Direction.EAST);
        new Wall(driveway, 3, -1, Direction.EAST);
        new Wall(driveway, 4, -1, Direction.EAST);
        new Wall(driveway, 5, -1, Direction.EAST);
        new Wall(driveway, 6, -1, Direction.EAST);
        new Wall(driveway, 7, -1, Direction.EAST);
        new Wall(driveway, 8, -1, Direction.EAST);
        new Wall(driveway, 9, -1, Direction.EAST);

        // creating driveways
        new Wall(driveway, 0, 0, Direction.EAST);
        new Wall(driveway, 1, 1, Direction.NORTH);
        new Wall(driveway, 1, 2, Direction.NORTH);
        new Wall(driveway, 1, 3, Direction.NORTH);
        new Wall(driveway, 1, 4, Direction.NORTH);
        new Wall(driveway, 1, 4, Direction.EAST);
        new Wall(driveway, 2, 1, Direction.SOUTH);
        new Wall(driveway, 2, 2, Direction.SOUTH);
        new Wall(driveway, 2, 3, Direction.SOUTH);
        new Wall(driveway, 2, 4, Direction.SOUTH);
        new Wall(driveway, 2, 4, Direction.EAST);
        new Wall(driveway, 3, 0, Direction.EAST);
        new Wall(driveway, 4, 1, Direction.NORTH);
        new Wall(driveway, 4, 2, Direction.NORTH);
        new Wall(driveway, 4, 3, Direction.NORTH);
        new Wall(driveway, 4, 3, Direction.EAST);
        new Wall(driveway, 4, 1, Direction.SOUTH);
        new Wall(driveway, 4, 2, Direction.SOUTH);
        new Wall(driveway, 4, 3, Direction.SOUTH);
        new Wall(driveway, 5, 0, Direction.EAST);
        new Wall(driveway, 6, 0, Direction.EAST);
        new Wall(driveway, 7, 1, Direction.NORTH);
        new Wall(driveway, 7, 2, Direction.NORTH);
        new Wall(driveway, 7, 3, Direction.NORTH);
        new Wall(driveway, 7, 4, Direction.NORTH);
        new Wall(driveway, 7, 5, Direction.NORTH);
        new Wall(driveway, 7, 5, Direction.EAST);
        new Wall(driveway, 8, 1, Direction.SOUTH);
        new Wall(driveway, 8, 2, Direction.SOUTH);
        new Wall(driveway, 8, 3, Direction.SOUTH);
        new Wall(driveway, 8, 4, Direction.SOUTH);
        new Wall(driveway, 8, 5, Direction.SOUTH);
        new Wall(driveway, 8, 5, Direction.EAST);
        new Wall(driveway, 9, 0, Direction.EAST);
        new Wall(driveway, 9, 0, Direction.SOUTH);

        // creating snow
        new Thing(driveway, 1, 0);
        new Thing(driveway, 1, 1);
        new Thing(driveway, 1, 2);
        new Thing(driveway, 1, 3);

        new Thing(driveway, 2, 0);
        new Thing(driveway, 2, 2);
        new Thing(driveway, 2, 4);

        new Thing(driveway, 4, 0);
        new Thing(driveway, 4, 1);
        new Thing(driveway, 4, 2);

        new Thing(driveway, 7, 0);
        new Thing(driveway, 7, 1);
        new Thing(driveway, 7, 5);

        new Thing(driveway, 8, 1);
        new Thing(driveway, 8, 2);
        new Thing(driveway, 8, 4);
        
        // show amount of "snow" on ground
        driveway.showThingCounts(true);


        // check if front is clear
        while (bob.frontIsClear()) {
            bob.turnLeft();
            // if front is not clear   
            if (!bob.frontIsClear()) {
                bob.turnLeft();
                bob.turnLeft();
                bob.turnLeft();
                bob.move();
            } else {
                // if driveway is found
                while (bob.frontIsClear()) {
                    bob.move();
                    // if bob can pick up thing then he will pick it up
                    if (bob.canPickThing()) {
                        bob.pickThing();
                    }

                }
                // if bob is blocked by a wall then turn around
                if (!bob.frontIsClear()) {
                    bob.turnLeft();
                    bob.turnLeft();
                }
                // while driveway is clear, move back towards the street
                while (bob.frontIsClear()) {
                    bob.move();
                }
                // bob turns left and moves 1 space down the street
                bob.turnLeft();
                bob.move();

            }
            // bob will drop all the "snow" at the end of the sidewalk
        } while(bob.countThingsInBackpack() != 0) {
                bob.putThing();
        }
        // jeb will move down the sidewalk and if he can pick up snow, he will
        while (jeb.frontIsClear()) {
            jeb.move();
            while (jeb.canPickThing()) {
                jeb.pickThing();
            }
        }
        // when jeb reaches the end of the sidewalk, he will drop all the snow
        while (!jeb.frontIsClear()) {
            if(jeb.countThingsInBackpack() != 0) {
                jeb.putThing();
            }
        }
    }
}

