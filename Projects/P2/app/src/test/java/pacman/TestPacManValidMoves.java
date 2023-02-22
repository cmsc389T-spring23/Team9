package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;
import java.util.ArrayList;

public class TestPacManValidMoves extends TestCase {

  public void testPacManValidMoves() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    Ghost ghost = frame.addGhost(new Location(9,11), "binky", Color.red);	
		//PacMan pacman = new PacMan("bob", new Location(9,12), new Map(1));
    PacMan pacman = frame.addPacMan(new Location(9,12));
		ArrayList<Location> loc = new ArrayList<Location>();
    //pacman.get_valid_moves();
    return;
  }
}
