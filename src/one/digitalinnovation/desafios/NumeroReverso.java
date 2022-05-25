package one.digitalinnovation.desafios;

import java.util.Scanner;

/**
 * Número Reverso:
 * Faça um programa que leia um valor inteiro (este número deverá conter 4 dígitos).
 * A saída deverá ser o reverso de um número inteiro informado.
 * Exemplo: Digamos que a entrada foi 3257. A resposta será 7523.
 *
 * Regras:
 *  A entrada deverá estar entre 1000 e 9999;
 *  Se o usuário digitar 3 dígitos ou menos, o Programa avisa que tem que conter 4 dígitos e continuar
 *  a programação até a resposta final.
 *
 */


public class NumeroReverso {

    //Método estático que irá realizar o cálculo referente a classe NumeroReverso
    public static void numeroReverso(){
        // Leitura da entrada dos números pelo teclado através do objeto do tipo scanner
        Scanner teclado = new Scanner(System.in);
        // Laço de Repetição
        do {
            System.out.println("Por gentileza, digite entre 1000 e 9999 e veja o reverso: ");
        //Armazenar o valor informado
            int numeroInformado = teclado.nextInt();
        // Não se pode reverter números inteiros, portanto, deve-se utilizar o método estático String.valueOf para
        // armazenar o número informado em string.
            String  numeroInformadoString = String.valueOf(numeroInformado);

        //Regra 1 - A entrada deverá estar entre 1000 e 9999
        if(numeroInformado >= 1000 && numeroInformado <= 9999) {

        //  Utilização da classe String Builder que contém o método Reverse
            StringBuilder stringBuilder = new StringBuilder(numeroInformadoString);
               System.out.println("O reverso do número informado é: " + stringBuilder.reverse());
         break; //utilizado para parar o laço de repetição e lenght para ler o tamanho da string
           }else if(numeroInformadoString.length() < 4) {
            System.out.println("Número imformado não está intervalo de 4 dígitos, tente novamente.");
        }
        } while(true);
    }
}
