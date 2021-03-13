public class Ex01 {
    public static void main (String[] args) {
        int [] numeros = new int [20];

        final int TAMANHO = 10; //Uma constate

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = (i+1);
        }
        for(int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }


    }
}
