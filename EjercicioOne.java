import java.util.Scanner;

public class EjercicioOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Declarar variables
        String num;
        int cantidadDigitos;

        System.out.println("Ingresa un número.");
        //Tomar datos por consola
        num = scanner.nextLine();  

        // Llamar a la función contarCaracteres
        cantidadDigitos = contarCaracteres(num);

        System.out.println("La cantidad de dígitos del número es: " + cantidadDigitos);
        scanner.close();
    }
    // Función para contar caracteres de una cadena
    public static int contarCaracteres(String cadena) {
        // Retorna la longitud de la cadena
        return cadena.length();  
    }
}