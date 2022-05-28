package one.digitalinnovation.desafios.funcionarios;

/**
 *  Consultor é classe filha de Funcionário
 *
 */

public class Consultor extends Funcionario{
    //Atributos
    private double valorHora;
    private long horasTrabalhadas;


    // Add Constructor Parameters
    public Consultor(String nome, long cpf, double valorHora, long horasTrabalhadas) {
        super(nome, cpf);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    //Cálculo para o Salário do Consultor
    @Override
    public double calcularSalario() {
        return valorHora * horasTrabalhadas;
    }

    //Getters and Setters
    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public long getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(long horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
