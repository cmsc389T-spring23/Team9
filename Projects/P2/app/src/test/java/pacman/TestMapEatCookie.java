package pacman;
import java.io.*;
import junit.framework.*;
import java.awt.Color;

public class TestMapEatCookie extends TestCase {

  public void testMapEatCookie() throws FileNotFoundException {
    Map newMap = new Map(9);
    newMap.add("pacman",new Location(1,1),new PacManComponent(1,1,1),Map.Type.PACMAN);
    newMap.add("cookie",new Location(1,1),new CookieComponent(1,1,1),Map.Type.COOKIE);
    System.out.println(newMap.getCookies());
    newMap.eatCookie("pacman");
    assertTrue(newMap.getCookies() == 0);
  }
}
