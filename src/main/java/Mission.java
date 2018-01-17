import java.util.ArrayList;

public class Mission {

     private Mars myPlanet;
     private Robot robot1;
     private Robot robot2;
     private Robot robot3;
     private String instructions1;
     private String instructions2;
     private String instructions3;
     private ArrayList<String> lostCoords;

    public void Mission(){
        myPlanet = new Mars(5, 3);
        robot1 = new Robot(1, 1, "E");
        robot2 = new Robot(3, 2, "N");
        robot3 = new Robot(0, 3, "W");
        instructions1 = "RFRFRFRF";
        instructions2 = "FRRFLLFFRRFLL";
        instructions3 = "LLFFFLFLFL";
        lostCoords = new ArrayList<>();
    }

    //public String or Boolean lostRobot(Robot robot){
        // if (x || y for Robot) is bigger than (x || y for planet)
        // add coordinates as a sting to the lostCoords ArrayList
        // Return String of coodrs + " LOST"
    //}

    // public String



}