import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Scanner s = new Scanner(System.in);
        System.out.println("Osídlování planety Quadient započalo. \nZvolte počet astroantů v jedné kolonii. \n(max. 13)");
        int count = s.nextInt();
        if (count > 13 || count <= 0) {
            System.out.println("Špatný počet astroantů!");
        } else {
            Enviroment enviroment = new Enviroment(count, Color.YELLOW, Color.RED);
            enviroment.run();
        }

    }
}
