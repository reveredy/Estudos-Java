package principal.exercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContagemDeVotosMap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> votacao = new HashMap<>();
        Integer count = 0;

        System.out.println("Enter file full path: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(", ");

                String name = fields[0];
                Integer votes = Integer.parseInt(fields[1]);

                if (votacao.containsKey(name)){
                    count = votacao.get(name) + votes;
                    votacao.put(name, count);
                }else {
                    votacao.put(name, votes);
                }

                line = br.readLine();
            }

            for(String key : votacao.keySet()){
                System.out.println(key + ": " + votacao.get(key));
            }
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
