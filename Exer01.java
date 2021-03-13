import java.util.Scanner;

public class Exer01 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System . in);
        String [] names = new String [7];
        
        for( int i = 0; i < names.length; i++){
            System.out.println("Digite o " + (i+1) + "° nome: ");
            names [i] = entrada.nextLine();
        }
        for( int i = names.length-1; i >= 0 ; i--){
            System.out.println(names[i]);
        }

        entrada.close();
    }
}    
