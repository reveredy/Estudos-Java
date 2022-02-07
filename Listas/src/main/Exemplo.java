package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo {

    public static void main(String[] args) {
	    List<String> list = new ArrayList<>();

        //Adicionando alguns dados na lista
        list.add("Maria");
        list.add("Carlos");
        list.add("Zaida");
        list.add("Tai");
        //Adicionando em determinado index
        list.add(1, "Kate");
        //Removendo da lista
        list.remove("Maria");
        list.removeIf(x -> x.charAt(0) == 'M');
        //encontrando elementos na lista
        System.out.println(list.indexOf("Kate"));
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'C').collect(Collectors.toList());


        for (String nome : list){
            System.out.println(nome);
        }

        System.out.println("-------------------------------------------------------------");

        for (String nome : result){
            System.out.println(nome);
        }
        System.out.println("------------------------------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'C').findFirst().orElse(null);
    }
}
