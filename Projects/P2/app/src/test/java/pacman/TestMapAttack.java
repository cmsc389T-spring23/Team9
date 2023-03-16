package pacman;
import junit.framework.*;
import java.io.*;
import java.awt.Color;

public class TestMapAttack extends TestCase {

  public void testMapAttack() throws FileNotFoundException {
    // set up the game
    NoFrame frame = new NoFrame();
    PacMan pacman = frame.addPacMan(new Location(1, 1));
    Ghost ghost = frame.addGhost(new Location(9,11), "binky", Color.red);
    Map map = frame.getMap();
    
    // ghost attack will end up calling the attack in map
    map.attack("binky");

    // unsuccessful attack should make sure the game is over
    assertTrue(frame.getMap().isGameOver() == true);

  }
}
