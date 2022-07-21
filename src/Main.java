import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String nombre;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        nombre = leer.nextLine();

        System.out.println("Bienvenido a Progra 2 2022 " +  nombre);
    }
}
