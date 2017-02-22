
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malij6756
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a city named castle
        City castle = new City();

        // creating a robot named bob
        Robot karel = new Robot(castle, 0, 0, Direction.EAST);

        // creating the castle walls
        new Wall(castle, 3, 2, Direction.SOUTH);
        new Wall(castle, 3, 3, Direction.SOUTH);
        new Wall(castle, 3, 2, Direction.WEST);
        new Wall(castle, 3, 3, Direction.EAST);
        new Wall(castle, 2, 2, Direction.NORTH);
        new Wall(castle, 2, 2, Direction.WEST);
        new Wall(castle, 2, 3, Direction.NORTH);
        new Wall(castle, 2, 3, Direction.EAST);

        new Wall(castle, 4, 1, Direction.EAST);
        new Wall(castle, 4, 1, Direction.NORTH);
        new Wall(castle, 4, 1, Direction.WEST);
        new Wall(castle, 4, 1, Direction.SOUTH);

        new Wall(castle, 1, 1, Direction.EAST);
        new Wall(castle, 1, 1, Direction.NORTH);
        new Wall(castle, 1, 1, Direction.WEST);
        new Wall(castle, 1, 1, Direction.SOUTH);

        new Wall(castle, 1, 4, Direction.EAST);
        new Wall(castle, 1, 4, Direction.NORTH);
        new Wall(castle, 1, 4, Direction.WEST);
        new Wall(castle, 1, 4, Direction.SOUTH);

        new Wall(castle, 4, 4, Direction.EAST);
        new Wall(castle, 4, 4, Direction.NORTH);
        new Wall(castle, 4, 4, Direction.WEST);
        new Wall(castle, 4, 4, Direction.SOUTH);

        // Karel will follow this loop to patrol around the castle by following the same pattern on each side
        while (true) {
            // move forward 2 spaces
            karel.move();
            karel.move();

            // turn right
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();

            // move forward 1 space
            karel.move();

            // turn left
            karel.turnLeft();

            // move forward 1 space
            karel.move();

            // turn left
            karel.turnLeft();

            // move forward 1 space
            karel.move();

            // turn right
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();

            // move forward 1 space
            karel.move();
            karel.move();

            // turn right
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();



        }
    }
}
