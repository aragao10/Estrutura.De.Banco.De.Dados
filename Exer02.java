import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class Exer02 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System . in);
        Double[] notas = new Double[10];
        double valor;
        double media;
        double aprovados;

        aprovados = 0;
        media = 0;
        valor = 0;
        
        for( int i = 0; i < notas.length; i++){
            System.out.println("Digite a " + (i+1) + "° nota: ");
            notas [i] = entrada.nextDouble();
            valor += notas[i];
        }
        for( int i = 0; i < notas.length; i++){
            System.out.println(notas[i]);
            if(notas[i] >= 6){
                aprovados ++;
            }
        }
        media = valor/notas.length;
        System.out.println("A média da turma = " + media);
        System.out.println("Numeros de Alunos aprovados = " + aprovados);
        entrada.close();
    }
}
