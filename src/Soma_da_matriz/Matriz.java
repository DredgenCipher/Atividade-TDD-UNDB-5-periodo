package Soma_da_matriz;
import java.util.Random;
public class Matriz {

    // Definir as variaveis

    Random rand = new Random();
    private int[] nova_matriz;
    private int sum;

    //Metodos construtor
    public Matriz() {
        nova_matriz = new int[rand.nextInt(1000)+1];
        sum = 0;
    }

    public int check_size(){
        int size = nova_matriz.length;
        return size;
    }

    // Metodo para inserir elementos na matriz e soma-los
    public void gerar_matriz() {
        for (int i = 0; i < nova_matriz.length; i++) {
            this.nova_matriz[i] = rand.nextInt(10);
            System.out.print("["+nova_matriz[i]+"]");
            sum += nova_matriz[i];

        }

        System.out.println();
        System.out.println("A soma dos elementos da matriz de tamanho " + check_size() + " e igual a: " + sum);
        System.out.println();
    }}