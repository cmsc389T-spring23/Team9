package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;
import java.util.ArrayList;

public class TestPacManValidMoves extends TestCase {

  public void testPacManValidMoves() throws FileNotFoundException {
    NoFrame frame = new NoFrame();
    Ghost ghost = frame.addGhost(new Location(9,15), "binky", Color.red);	
		PacMan pacman = new PacMan("bob", new Location(9,11), new Map(5));
		ArrayList<Location> locations = pacman.get_valid_moves();

    ArrayList<Location> answers = new ArrayList<Location>();
    answers.add(new Location(9,12));
    answers.add(new Location(10,11));
    answers.add(new Location(10,12));
    assertEquals(locations, answers);
  }
}
