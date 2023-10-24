public class Ejercicio1 {
    public static void main(String[] args) {
        //Crear un bloque de código que pinte las vocales
        // y solo las vocales que existen en un array de caracteres.
        // El programa debe de ir comprobando, con un bucle,
        // para determinar si cada carácter del array es o no una vocal.
        char[] letras = {'a','b','d','e','g'};
        for (int i=0; i<letras.length; i++){
            switch (letras[i]){
                case 'a':
                case 'A':
                case 'e','E','i','I','o','O','u','U':
                    System.out.println("Es vocal -> " + letras[i] + " está en la posición " + i);
                    break;
            }
        }
    }
}
