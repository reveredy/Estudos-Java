package entities;

public abstract class Pessoa {
    private String nome;
    private Double rendaAnual;

    public Pessoa(){}

    public Pessoa(String nome, Double rendaAnual){
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setRendaAnual(Double rendaAnual){
        this.rendaAnual = rendaAnual;
    }

    public Double getRendaAnual(){
        return rendaAnual;
    }

    public abstract Double imposto();
}
