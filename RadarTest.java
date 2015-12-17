import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class RadarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadarTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;
    @Test
    public void testRadarOne()
    {
        //Makes radar Object
        Radar radar = new Radar(100,100);
        //Puts the monster in the location
        radar.setMonsterLocation(50,50);
        //Runs .scan 1000 times
        for (int loop = 0; loop<1000; loop++)
        {
            radar.scan();
        }
        //creates variable to keep track of the biggest accumulator the monsters row and column
        int biggest_accumulator = 0;
        int monsters_row = 0;
        int monster_column = 0;
        //Finds the monsters position by going through each row and col
        for ( int row = 0; row < 100; row++)
        {
            for ( int col = 0; col < 100; col++)
            {
                if (radar.getAccumulatedDetection(row , col) > biggest_accumulator)
                {
                    biggest_accumulator = radar.getAccumulatedDetection(row , col);
                    monsters_row = row;
                    monster_column = col;
                }
            }
        }
        //Looks to see if the monsters location matches the real monsters location
        assertEquals(50,monsters_row);
        assertEquals(50,monster_column);
    }

    @Test
    public void testRadarTwo()
    {
        //Makes radar Object
        Radar radar = new Radar(100,100);
        //Puts the monster in the location
        radar.setMonsterLocation(25,75);
        //Runs .scan 1000 times
        for (int loop = 0; loop<1000; loop++)
        {
            radar.scan();
        }
        //creates variable to keep track of the biggest accumulator the monsters row and column
        int biggest_accumulator = 0;
        int monsters_row = 0;
        int monster_column = 0;
        //Finds the monsters position by going through each row and col
        for ( int row = 0; row < 100; row++)
        {
            for ( int col = 0; col < 100; col++)
            {
                if (radar.getAccumulatedDetection(row , col) > biggest_accumulator)
                {
                    biggest_accumulator = radar.getAccumulatedDetection(row , col);
                    monsters_row = row;
                    monster_column = col;
                }
            }
        }
        //Looks to see if the monsters location matches the real monsters location
        assertEquals(25,monsters_row);
        assertEquals(75,monster_column);
    }
}