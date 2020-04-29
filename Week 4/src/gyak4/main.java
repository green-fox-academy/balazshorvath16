package gyak4;

public class main {
    public static void main(String[] args) {
        sharpie createdsharpie = new sharpie("Blue", 2,30);
        createdsharpie.use();

        System.out.println("After use:" +createdsharpie.inkAmount);

    }
}
