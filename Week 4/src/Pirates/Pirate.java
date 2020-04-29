package Pirates;

import java.util.Random;
/*
Create a Pirate class. While you can add other fields and methods, you must have these methods:-
And... if you get that far...
 */
public class Pirate {
    private int rumLvl;
    private int state;
    private boolean hasParrot;
    private boolean consumedRum;
    private String name;
    //state 2: alive   state 1: passed out    state 0: dead
    public Pirate(String name) {
        this.rumLvl = 0;
        this.state = 2;
        this.hasParrot = false;
        this.consumedRum = false;
        this.name = name;
    }

    public Pirate() {

    }

    //drinkSomeRum() - intoxicates the Pirate some
    public void drinkSomeRum() {
        if (this.state == 2) {
            this.rumLvl++;
        } else if (this.state == 1) {
            System.out.println("Sorry that pirate is passed out");
        } else {
            System.out.println("Im dead");
        }
    }
    //howsItGoingMate() - when called, the Pirate replies, if drinkSomeRun was called:-
//0 to 4 times, "Pour me anudder!"
//else, "Arghh, I'ma Pirate. How d'ya d'ink its goin?", the pirate passes out and sleeps it off.
//If you manage to get this far, then you can try to do the following.
    public void howsItGoingMate() {
        if (this.state == 2) {
            if (this.rumLvl < 5) {
                System.out.println("Pour me anudder!");
            } else if (this.state == 1) {
                System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            } else if (this.state == 0) {
                System.out.println("Pirate is dead");
            }
        }
    }
    //die() - this kills off the pirate, in which case, drinkSomeRum, etc.
// just result in he's dead.
    public void die() {
        this.state = 0;
    }
    //    brawl(x) - where pirate fights another pirate (if that other pirate is alive)
//    and there's a 1/3 chance, 1 dies, the other dies or they both pass out.
    public void brawl(Pirate pirate1) {
        Random random = new Random();
        int chance = random.nextInt(3);
        int chane1 = random.nextInt(3);
        if (chance < chane1){
            this.die();
            System.out.println( this.name + " is dead");
        }else if (chance == chane1){
            this.state = 1;
            pirate1.setState(1);
            System.out.println(this.name + " are pass out");
        }else {
            pirate1.die();
            System.out.println(pirate1.name + " is dead");
        }
    }
    //Add a parrot.
    public void addParrot() {
        this.hasParrot = true;
    }
    public void setState(int state) {
        this.state = state;
    }
    public void getStatus(){
        if (state==2){
            System.out.println("The captain is alive");
        } else if (state == 1){
            System.out.println("The captain is knocket out");
        } else {
            System.out.println("The captain is dead");
        }
    }
}
