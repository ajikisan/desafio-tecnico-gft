package one.digitalinnovation.desafios;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Macaco:
 * Faça um programa e teste interativamente uma classe que modele um macaco:
 * atributos: nome e bucho (estômago).
 * métodos: comer, verBucho e digerir.
 *
 * Regras:
 * a) Crie 2 macacos;
 * b) Considere que a quantidade máxima de alimentos é 3. Com isso, lembre-se de
 * verificar o conteúdo do estômago a cada refeição (método “comer”).
 *
 *    Por fim, o método “digerir” deve esvaziar o bucho do Macaco;
 * c) Alimentos “digeríveis” devem ser do tipo String, garanta isso em seu
 * código para que não haja nenhum Macaco canibal.
 *
 *
 */

public class Macaco {
    //atributos
    private String nome;
    //utilização de lista para armazenagem dos dados referente aos alimentos comidos pelos macacos
    private List<String> bucho = new ArrayList<>();


    //Método público não retorna valores e ao verificar o conteúdo do bucho através do size
    public void comer(String comida) {
        //Ao comer acima de 3 alimentos imprime mensagem
        if(bucho.size() == 3) {
            System.out.println("Bucho cheio - Thank you!");
        } else{
            bucho.add(comida);
                }
        System.out.println(bucho);
        System.out.println("-------------");
            }

            public void  digerir () {
        // Método is Empty verifica se a lista está vazia.
                if (bucho.isEmpty()){
                    System.out.println(("Bucho vazio - Quero comer!"));
                } else {
        // Método remove da lista conforme posicionamento 0
                    bucho.remove(bucho.get(0));
                }
                System.out.println(bucho);
            }
}
