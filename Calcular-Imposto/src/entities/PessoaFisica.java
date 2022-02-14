package entities;

public class PessoaFisica extends Pessoa{
    private Double saude;

    public PessoaFisica(){}

    public PessoaFisica(String nome, Double rendaAnual, Double saude){
        super(nome, rendaAnual);
        this.saude = saude;
    }

    public Double getSaude() {
        return saude;
    }

    public void setSaude(Double saude) {
        this.saude = saude;
    }

    @Override
    public Double imposto() {
        double valorImposto = 0;

        if (super.getRendaAnual() < 20000.00){
            valorImposto = (super.getRendaAnual() * 0.15) - (saude * 0.50);
        }else{
            valorImposto = (super.getRendaAnual() * 0.25) - (saude * 0.50);
        }

        return valorImposto;
    }
}
