package principal;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> var = new HashMap<>();

        var.put("nome", "Pedro");
        var.put("nome2", "Zaida");

        for(String key: var.keySet()){
            System.out.println("Chave: " + key + ", Valor: " + var.get(key));
        }
    }
}
