package one.digitalinnovation.desafios.funcionarios;

/**
 * Uso do extends --vendedor é filho de Funcionário
 * lâmpada vermelha
 * Class 'Vendedor" must be either be declared abstract or implement abstract method 'calcularSalario()
 * in "Funcionario"
 * Implement methods alt+shif+enter
 *
 */


public class Vendedor extends Funcionario {
    //atributos
    private double comissao;
    private long numeroVendas;

    //construtor para receber o número de vendas e comissão alt + enter  parameter
    public Vendedor(String nome, long cpf, double comissao, long numeroVendas) {
        super(nome, cpf);
        this.comissao = comissao;
        this.numeroVendas = numeroVendas;
    }

    //Cálculo do salário do vendedor pegando a Super Classe Funcionário
    @Override
    public double calcularSalario() {
       // return super.getSALARIO_MINIMO() + (this.comissao * this.numeroVendas);
        return super.SALARIO_MINIMO + (this.comissao * this.numeroVendas);
    }

    //Getters and Setters  alt + insert
    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public long getNumeroVendas() {
        return numeroVendas;
    }

    public void setNumeroVendas(long numeroVendas) {
        this.numeroVendas = numeroVendas;
    }
}

