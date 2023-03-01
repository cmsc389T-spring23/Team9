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
    ArrayList<Location> validMovesList = new ArrayList<Location>();
    int iMax = this.myLoc.x + 2;
    int jMax = this.myLoc.y + 2;

    for(int i = this.myLoc.x; i < iMax; i++){
      for(int j = this.myLoc.y; j < jMax; j++){
        
        // first check is because we need getLoc to get implemented (otherwise gradle gives null pointer exception)
        if(myMap.getLoc(new Location(i,j)) == null || myMap.getLoc(new Location(i,j)).contains(Map.Type.WALL)){
          validMovesList.add(new Location(i,j));
          System.out.println(i);
          System.out.println(j);
        }  
      }
    }
    // remove the position pacman is already at
    validMovesList.remove(0);
    return validMovesList;
  }

  public boolean move() {
    return false;
  }

  public boolean is_ghost_in_range() {
    return false;
  }

  public JComponent consume() {
    return null;
  }
}
