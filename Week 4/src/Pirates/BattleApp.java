package Pirates;

public class BattleApp {
    public static void main(String[] args) {
        Pirate pirate1 = new Pirate("BigBeard");
        Pirate pirate2 = new Pirate("Lil Rat");

        Ship ship1 = new Ship();

        ship1.fillShip();

       // System.out.println("ship size" + " " + ship1.listOfCrew.size());
        ship1.shipStatus();


    }
}
