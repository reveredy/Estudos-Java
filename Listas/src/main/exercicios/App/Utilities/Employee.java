package main.exercicios.App.Utilities;

public class Employee {
    private int id;
    private String nome;
    private double salario;

    public Employee(Integer id, String nome, Double salario){
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId(){

        return id;
    }

    public String getNome(){
        return nome;
    }

    public double getSalario(){

        return salario;
    }

    public void aumentarSalario(int percent){
        salario = (salario * (100 + percent))/100;
    }
}
