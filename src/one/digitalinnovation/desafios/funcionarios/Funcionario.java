package one.digitalinnovation.desafios.funcionarios;

/**
 * Funcionários:
 * Considerando o diagrama abaixo, feito para uma empresa de vendas.
 * Nesse contexto, utilize o conceito de Herança para remodelá-lo e
 * implemente um programa que explore o domínio em questão:
 *
 * -------------------------	||----------------------------
 * | Vendedor			        ||  Consultor 	 		     |
 * |-----------------------	    ||------------------------   |
 * |+ Nome: String    		    ||+ Nome: String 		     |
 * |+ Cpf: long	  		        ||+ Cpf: String  		     |
 * |+ Comissao:double 		    ||+ ValorHora :double  		 |
 * |+ Numero Vendas: long 		||+ ValorTrabalhadas:long  	 |
 * | ------------------		    ||-------------	  		     |
 * |+ CalcularSalario():double 	|| + CalcularSalario():double|
 * | ---------------------------||---------------------------
 *
 *  Regras:
 * a) Crie uma classe mãe chamada Funcionario com os atributos nome,
 * cpf (passados pelo construtor), uma constante para armazenar o
 * valor do salário mínimo e um método abstrato “calcularSalario”;
 * b) Vendedores ganham 1 salário mínimo, mais uma comissão por vendas;
 * c) Consultores ganham somente pelas horas que trabalharam.
 *
 * Classe Mãe - não pode dar New, pois vamos dar new em vendedor e construtor
 * Criação de constante:
 *
 *
 *
 *
 */

public abstract class Funcionario {
    //atributos
    private String nome;
    private long cpf;

    //criação de constante para armazenar o valor do salário mínimo 2022
    protected final Double SALARIO_MINIMO = 1212.0;

   // construtor  alt+insert
    public Funcionario(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

   //Método abstrato “calcularSalario

    public abstract double calcularSalario();


    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public Double getSALARIO_MINIMO() {
        return SALARIO_MINIMO;
    }
}




