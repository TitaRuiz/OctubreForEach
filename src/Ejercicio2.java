import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Crear un bloque de código que lea las componentes de un array de enteros
        // y me pinte cuales son pares, cuales impares y cuales son múltiplos de tres.
        // Para este ejercicio utilizar un bucle que recorra el array y utilizar el operador %.
        int[] numeros = new int[5];
        Scanner teclado = new Scanner(System.in);
        for(int i = 0 ; i< numeros.length;i++){
            System.out.println("Escriba el numero de la posicion " + i + " -> ");
            numeros[i] = teclado.nextInt();
        }
        for(int i=0; i<numeros.length; i++){
            if(numeros[i]%2==0){
                System.out.println("El numero " + numeros[i] + " es par");
            }else {
                System.out.println("El número " + numeros[i] + " es impar");
            }
            if (numeros[i] % 3 == 0) {
                System.out.println("El numero " + numeros[i] + " es multiplo de 3");
            }else{
                System.out.println("El numero " + numeros[i] + " NO es multiplo de 3");
            }
        }
    }
}
