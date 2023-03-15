package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestGhostMove extends TestCase {

  public void testGhostMove() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    Ghost ghost = frame.addGhost(new Location(9,11), "binky", Color.red);	
		PacMan pacman = frame.addPacMan(new Location(9,12));
		assertTrue(ghost.move() == false);
  }
}
