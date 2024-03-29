package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestGhostInRange extends TestCase {

  public void testGhostInRange() throws FileNotFoundException {
    Map newMap = new Map(9);
    PacMan pacman = new PacMan("pacman",new Location(1,1), newMap);
    newMap.add("pacman",new Location(1,1),new PacManComponent(1,1,1),Map.Type.PACMAN);
    newMap.add("ghost",new Location(1,2),new GhostComponent(1,2,1),Map.Type.GHOST);
    assertTrue(pacman.is_ghost_in_range());
  }
}
