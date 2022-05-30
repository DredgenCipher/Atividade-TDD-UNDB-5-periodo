package Diferença_das_diagonais;

import java.util.Random;

public class Matriz {

    Random rand = new Random();

    private int[][] nova_matriz;
    private int sum_diag_principal;
    private int sum_diag_secundaria;
    private int dif_diag;
    private int absoluto;

    // Criando uma função para definir o numero de colunas e linhas.
    public int tamanho(){
        int size = rand.nextInt(1000)+2;
        return size;
    }
    //Metodo construtor

    public Matriz() {
        nova_matriz = new int[tamanho()][tamanho()];
        sum_diag_principal = 0;
        sum_diag_secundaria = 0;
        dif_diag = 0;
    }
    //Metodo para checar o tamanho da Array

    public int check_size() {
        int c_size = nova_matriz.length;
        return c_size;
    }

    public void gerar_matriz() {
        for (int i = 0; i < nova_matriz.length; i++) {
            for (int j = 0; j < nova_matriz.length; j++) {
                this.nova_matriz[i][j] = rand.nextInt(-100 , 100);
            }

        }
        for (int i = 0; i < nova_matriz.length; i++){
            for(int j = 0; j < nova_matriz.length; j++){
               System.out.print("["+nova_matriz[i][j]+"]");
            }
            System.out.println();
        }
        // Somar as diagonais
        for (int i = 0; i < nova_matriz.length; i++){
            for (int j = 0; j < nova_matriz.length; j++){
                if (i == j){
                sum_diag_principal += nova_matriz[i][j];}
            }
        }
        for (int i = 0; i < nova_matriz.length ; i++){
            sum_diag_secundaria += nova_matriz[nova_matriz.length-1-i][i];

        }
        dif_diag = sum_diag_principal - sum_diag_secundaria;
        absoluto = Math.abs(dif_diag);

        System.out.println();
        System.out.println("A soma da diagonal principal equivale a: " + sum_diag_principal);
        System.out.println();
        System.out.println("A soma da diagonal secundaria equivale a: " + sum_diag_secundaria);
        System.out.println();
        System.out.println("O valor absoluto da diferenca entre as diagonais e: " + absoluto);
    }
}