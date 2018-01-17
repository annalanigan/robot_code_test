import java.util.ArrayList;

public class Mission {

     private Mars myPlanet;
     private ArrayList<String> lostCoords;

    public Mission(int x, int y){
        myPlanet = new Mars(x, y);
        lostCoords = new ArrayList<String>();
    }

    public Mars getMyPlanet() {
        return myPlanet;
    }

    public void setMyPlanet(Mars myPlanet) {
        this.myPlanet = myPlanet;
    }

    public ArrayList<String> getLostCoords() {
        return lostCoords;
    }

    public void setLostCoords(ArrayList<String> lostCoords) {
        this.lostCoords = lostCoords;
    }

    public void addToLostCoords(String data){
        lostCoords.add(data);
    }

    //public String or Boolean lostRobot(Robot robot){
    // if (x || y for Robot) is bigger than (x || y for planet)
    // add coordinates as a sting to the lostCoords ArrayList
    // Return String of coodrs + " LOST"
    //}

     public boolean checkForScent(String currentCoords) {
        if(lostCoords.size() > 0){
            for(String single : lostCoords){
                if (single.equals(currentCoords)){
                  return true;
                }
            }
        }
        return false;
    }

    public boolean hasFallenOffEdge ( int xCoord, int yCoord){
        if (xCoord > myPlanet.getSizeOfInner()) {
            return true;
        } else if (yCoord > myPlanet.getSizeOfOuter()) {
            return true;
        } else {
            return false;
        }
    }

}