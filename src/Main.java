import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Definir array de char
        char[] letras = new char[5];
        //Definir el Scanner
        Scanner teclado = new Scanner(System.in);
        //guardar los datos en el array desde la consola
        for(int i = 0; i < letras.length; i++){
            System.out.println("Escriba una letra -> ");
            letras[i]= teclado.next().charAt(0);
        }
        //Mostrar los datos almacenados del array
        for(int i = 0; i<letras.length;i++){
            System.out.println(letras[i]);
        }


    }
}