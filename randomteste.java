/*Crie um programa em Python que implementa uma função que retorna uma lista preenchida com valores inteiros aleatórios.
 A função deve receber como parâmetro o tamanho da lista. O tamanho deve ser informado pelo usuário via input.
Para cada número da lista, imprima:
1- Se o número é múltiplo de 3
2- Se o número é par
3- Se o número é ímpar*/

import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class randomteste {

    public void listarandom(int tamanholista, int tamanhorandom) {
        ArrayList lista = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < tamanholista; i++) {
            lista.add(random.nextInt(tamanhorandom + 1));
        }
        System.out.println(lista);
    }

    public void condicional(List<Integer> lista){
        for (Integer num : lista) {
            System.out.println(num);
            if (num % 2 == 0){
                System.out.println(" é Par");
            }else if (num % 2 != 0) {
                System.out.println(" é Impar");
            }else if (num % 3 == 0) {
                System.out.println(" é Multiplo de 3");
            }   
            System.out.println();
        } 
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho da lista: ");
        int tamanholista = scanner.nextInt();
        System.out.println("Digite o intervalo randomico: ");
        int tamanhorandom = scanner.nextInt();

        randomteste exemplo = new randomteste();
        exemplo.listarandom(tamanholista, tamanhorandom);

        List<Integer> lista = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < tamanholista; i++) {
            lista.add(random.nextInt(tamanhorandom + 1));
        }

        exemplo.condicional(lista);

    }
}
