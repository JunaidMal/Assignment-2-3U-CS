
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malij6756
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a new city
        City kw = new City();

        // creating robot
        Robot bob = new Robot(kw, 1, 1, Direction.EAST);

        // creating "things"
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 1, 8);
        new Thing(kw, 1, 9);
        new Thing(kw, 1, 10);
        new Thing(kw, 1, 11);

        // step on to the first part of the path
        bob.move();

        // if the robot does not have 5 in it's backpack, move forward
        while (bob.countThingsInBackpack() != 7) {
            bob.pickThing();
            bob.move();


        }
        // if robot can pick up "thing", move forward
        if (bob.canPickThing() == true) {
            bob.move();
            bob.move();
            bob.move();
        }



    }
}
