package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestGhostAttack extends TestCase {

  public void testGhostAttack() throws FileNotFoundException {
    Map newMap = new Map(9);
    Ghost ghost = new Ghost("ghost", new Location(1,2), newMap);
    newMap.add("pacman",new Location(1,1),new PacManComponent(1,1,1),Map.Type.PACMAN);
    newMap.add("ghost",new Location(1,2),new CookieComponent(1,1,1),Map.Type.GHOST);
    assertTrue(ghost.attack());
    
  }
}
