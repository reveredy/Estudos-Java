package entities;

public class PessoaJuridica extends Pessoa{
    private int numeroFuncionarios;

    public PessoaJuridica(){}

    public PessoaJuridica(String nome, Double rendaAnual, int numeroFuncionarios){
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(int numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public Double imposto() {
        double valorImposto = 0;

        if (numeroFuncionarios <= 10){
            valorImposto = super.getRendaAnual() * 0.16;
        }else {
            valorImposto = super.getRendaAnual() * 0.14;
        }

        return valorImposto;
    }
}
