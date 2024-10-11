import java.util.Scanner;

public class EjercicioTwo {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        //Declarar variables
        String cadena;
        int totalWords = 0;

        System.out.println("Ingresa un mensaje.");
        //Tomar datos por consola
        cadena = scanner.nextLine();

        //Utilizar la funcion trim para quitar espacios en blanco indeseados
        cadena = cadena.trim();
    
        //Se utiliza la funcion isEmpty para asegurar si la cadena no tiene caracteres
        if (cadena.isEmpty()) {
            System.out.println("La cadena está vacía");
        } else {
            //Dividir la cadena por espacios
            String [] words = cadena.split(" ");
            //asignar la longitud de la cadena a una varible tipo entero
            totalWords = words.length;
        }
        System.out.println("La cadena contiene " + totalWords + " palabras.");
        //Cerrar scanner
        scanner.close();
    }

}