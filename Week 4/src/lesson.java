public class lesson {
    public static void main(String[] args) {

        Animal genericAnimal = new Animal();
        System.out.println(genericAnimal.getName());
        System.out.println(genericAnimal.favFood);

        Cats morris = new Cats("Morris", "Tuna", "Rubber Mouse");

        System.out.println();

        System.out.println(morris.getName());
        System.out.println(morris.favToy);
        System.out.println(morris.favFood);


        Animal tabby = new Cats("Tabby", "Salamon", "Ball");
        acceptAnimal(tabby);

    }

    public static void acceptAnimal(Animal randAnimal) {
        System.out.println();
         System.out.println(randAnimal.getName());
        System.out.println(randAnimal.favFood);
        System.out.println();

        randAnimal.walkAround();

        Cats tempCat = (Cats) randAnimal;
        System.out.println(tempCat.favToy);

        System.out.println(((Cats)randAnimal).favToy);

        if (randAnimal instanceof Cats) {
            System.out.println(randAnimal.getName() + " " + "is a cat");
        }
    }
}
