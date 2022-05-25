package one.digitalinnovation;

import one.digitalinnovation.desafios.Macaco;
import one.digitalinnovation.desafios.NumeroReverso;

public class Main {

    public static void main(String[] args) {
	 // Chamando a classe NumeroReverso
        NumeroReverso.numeroReverso();

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

    }
}
