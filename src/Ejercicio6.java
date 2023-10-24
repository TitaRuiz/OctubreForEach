public class Ejercicio6 {
    public static void main(String[] args) {
        int[] numeros = new int[]{1,2,7,3,4,65,23,78,98,34,342,45,57};
        int sumaPares=0, sumaImpares=0;

        for(int i=0; i<numeros.length;i++){
            if(numeros[i]%2==0){
                sumaPares=sumaPares + numeros[i];
            }else{
                sumaImpares+=numeros[i];
            }
        }
        System.out.println("Suma de Pares "+sumaPares);
        System.out.println("Suma de Impares "+sumaImpares);
    }
}
