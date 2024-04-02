import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Que pasa mi niño!!!!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número");
        int input = scanner.nextInt();
        System.out.println("El numero es: "+input);

        scanner.close();
    }
}
