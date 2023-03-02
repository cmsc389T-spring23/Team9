package pacman;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JComponent;

public class PacMan {
  String myName;
  Location myLoc;
  Map myMap;
  Location shift;

  public PacMan(String name, Location loc, Map map) {
    this.myLoc = loc;
    this.myName = name;
    this.myMap = map;
  }

  public ArrayList<Location> get_valid_moves() {
    return null;
  }

  public boolean move() {
    return false;
  }

  public boolean is_ghost_in_range() {
    //Check surroundings of current location using for loop
    for(int i = -1; i <= 1; i++){
      if(myMap.getLoc(new Location(myLoc.x + i, myLoc.y)).contains(Map.Type.GHOST) || 
      myMap.getLoc(new Location(myLoc.x, myLoc.y + i)).contains(Map.Type.GHOST)){
        return true;
      }
    }
    return false;
  }

  public JComponent consume() {
     if (myMap.getLoc(myLoc).contains(Map.Type.COOKIE))
      return myMap.eatCookie(myName);

    return null;
  }
}
