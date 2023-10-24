public class Ejercicio3 {
    public static void main(String[] args) {
        //Crear un bucle que pinte por consola todas
        // las componentes de un array en orden inverso a como están
        // guardadas en el array

        //1. Definir el array con los datos 5,4,7,9,8
        int[] numeros = {5,4,7,9,8,10,12};

        //2. En un bucle recorrerlo (cambiar valor inicial, condicion, modificacion de la i)
        for(int i=numeros.length-1; i >= 0 ; i--){
            System.out.println("numero de la posicion " + i + " con valor -> "+numeros[i]);
        }
    }
}
