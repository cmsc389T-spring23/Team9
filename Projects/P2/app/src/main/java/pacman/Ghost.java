package pacman;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Ghost {
  String myName;
  Location myLoc;
  Map myMap;

  public Ghost(String name, Location loc, Map map) {
    this.myLoc = loc;
    this.myName = name;
    this.myMap = map;
  }

  public ArrayList<Location> get_valid_moves() {
    return null;
  }

  public boolean move() {
    // get valid moves
    ArrayList<Location> validMoves = get_valid_moves();


    // legality check
    if(validMoves == null || validMoves.size() == 0){
      return true;
    }

    // choose random location
    Random rand = new Random();
    int randomLoc = rand.nextInt(validMoves.size());
    Location chosenLoc = validMoves.get(randomLoc);
    this.myLoc = chosenLoc;
    return true;
  }

  public boolean is_pacman_in_range() {
     for (int dx = -1; dx <= 1; dx++) {
      for (int dy = -1; dy <= 1; dy++) {
        Location newLocation = myLoc.shift(dx, dy);

        if (myMap.getLoc(newLocation).contains(Map.Type.PACMAN))
          return true;
      }
    }

    return false;
  }

  public boolean attack() {
    for(int i = -1; i <= 1; i++){
      if(myMap.getLoc(new Location(myLoc.x + i, myLoc.y)).contains(Map.Type.PACMAN) || 
      myMap.getLoc(new Location(myLoc.x, myLoc.y + i)).contains(Map.Type.PACMAN)){
        return true;
      }
    }
    return false;

  }
}
