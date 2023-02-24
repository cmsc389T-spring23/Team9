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
      return false;
    }

    // choose random location
    Random rand = new Random();
    int randomLoc = rand.nextInt(validMoves.size());
    Location chosenLoc = validMoves.get(randomLoc);
    this.myLoc = chosenLoc;
    return true;
  }

  public boolean is_pacman_in_range() {
    return false;
  }

  public boolean attack() {
    return false;
  }
}
