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
    for(int i = 0; i < 2; i++){
      for(int j = 0; j < 2; j++){
        if(myMap.getLoc(new Location(i,j)).contains(Map.Type.WALL) == false){
          validMovesList.add(new Location(i,j));
        }
      }
    }

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
