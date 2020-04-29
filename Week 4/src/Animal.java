public class Animal {
    private String name = "Animal";
    public String favFood = "Food";

    protected final void changeName(String newName){
        this.name = name;

    }
    protected final String getName () {
        return this.name;
    }
    public void eatStuff () {
        System.out.println("Yum" + "walks around");
    }
    public void walkAround () {
        System.out.println(this.name + "Walks around");
    }
    public Animal(){

    }
    public Animal(String name, String favFood) {
        this.favFood = favFood;
        this.changeName(name);
    }
}
