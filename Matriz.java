package matriz;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int linha, coluna, l, c = 0;
        
        //Receber os valores da linha e coluna//
        System.out.println("Montando sua Matriz: \n");
        System.out.println("Digite a Linha da sua Matriz: ");
        linha = p.nextInt();
        System.out.println("Digite a Coluna da sua Matriz: ");
        coluna = p.nextInt();
        
        System.out.print("\n");
        
        //Mapia a Matriz//
        for(l=0;l<linha;l++) {
            for(c=0;c<coluna;c++){
                System.out.print("[" + l + c + "]\t");
            }
            System.out.print("\n");
        }
        
        System.out.print("\n");
        System.out.print("Digite os valores da sua Matriz: \n");
        System.out.print("\n");
        
        //Recebendo os valores da linha e coluna numa Matriz//
        int[][] matriz = new int[l][c];
        
        //Receber os valores da Matriz//
        for(l=linha-1;l>=0;l--) {
            for(c=coluna-1;c>=0;c--) {
                System.out.print("M[" + l + "][" + c + "]= ");
                matriz[l][c] = p.nextInt();
                
            }
        }
        
        System.out.print("\n");
        System.out.print("Diagonal Principal: \n");
        System.out.print("\n");
        
        //Mostrando a Diagonal Principal da Matriz//
        for(l=0;l<linha;l++) {
            for(c=0;c<coluna;c++) {
                if(l==c) {
                   System.out.print("M[" + l + "][" + c + "]= " + matriz[l][c]);
                }
                System.out.print("\t");
            }
            System.out.print("\n");
        }
        
        System.out.print("Diagonal Secundaria: \n");
        System.out.print("\n");
        
        //Mostrando a Diagonal Secundaria da Matriz//
        for(l=0;l<linha;l++) {
            for(c=0;c<coluna;c++) {
                if(l==coluna - 1 - c) {
                   System.out.print("M[" + l + "][" + c + "]= " + matriz[l][c]);
                }
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }
    
}
