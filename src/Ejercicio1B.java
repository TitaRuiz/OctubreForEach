import java.util.Scanner;

public class Ejercicio1B {
    public static void main(String[] args) {
        //Leer por consola una frase y contar cuantas vocales hay
        String frase= "";
        Scanner teclado = new Scanner(System.in);
        int contadorVocales = 0;
        System.out.println("Escriba la frase -> ");
        frase = teclado.nextLine();
        //Bucle
        for (int i=0; i<frase.length(); i++){
            switch (frase.charAt(i)){
                case 'a':
                case 'A':
                case 'e','E','i','I','o','O','u','U':
                    contadorVocales++; //contadorVocales = contadorVocales + 1;
                    break;
            }
        }
        System.out.println("La frase tiene " + contadorVocales + " vocales ");

    }
}
