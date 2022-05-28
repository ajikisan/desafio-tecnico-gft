package one.digitalinnovation;

import one.digitalinnovation.desafios.Macaco;
import one.digitalinnovation.desafios.NumeroReverso;
import one.digitalinnovation.desafios.funcionarios.Consultor;
import one.digitalinnovation.desafios.funcionarios.Vendedor;

public class Main {

    public static void main(String[] args) {

    // Número Reverso
    // Chamando a classe NumeroReverso
        NumeroReverso.numeroReverso();


    // Macaco
    // Chamando a classe Macaco

        Macaco macaco1 = new Macaco();
        Macaco macaco2 = new Macaco();

    // Método Alimentar
        macaco1.comer("banana da terra");
        macaco1.comer("banana maça");
        macaco1.comer("banana nanica");

        //control + y deleta a linha
       // macaco1.comer("banana verde");

        macaco2.comer("morango");
        macaco2.comer("melancia");
        macaco2.comer("manga");
      //  macaco2.comer("mexerica");

      //Método digerir
        macaco1.digerir();
        macaco1.digerir();

        macaco2.digerir();
        macaco2.digerir();
        macaco2.digerir();
        macaco2.digerir();
        System.out.println("===================");


     //Pacote Funcionários - Criação de objetos para ver se a lógica está correta

        Vendedor vendedor = new Vendedor("Olaf", 1345465464L, 10, 5);
        System.out.println("Salário do Vendedor(a): " + vendedor.getNome() + " " +  vendedor.calcularSalario());
        System.out.println("---------------------------------------");

        Consultor consultor = new Consultor("Mirian", 1215564465L, 100.5d,140 );
        System.out.println("Salário do Consultor (a): " +  consultor.getNome() + " " + consultor.calcularSalario());
     }
}
