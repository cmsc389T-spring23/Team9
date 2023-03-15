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
    
    // ghost attack will end up calling the attack in map
    ghost.attack();

    // unsuccessful attack should make sure the game is not over
    assertTrue(frame.getMap().isGameOver() == false);

  }
}
