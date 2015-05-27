package customersearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name;
        int sum;
        int opt = 0;
        HashMap<String,Integer> map = new HashMap<>();
        Set<Map.Entry<String,Integer>> set = map.entrySet();
        do {
            System.out.println("========Application options========");
            System.out.println("1.To add customer and cash sum");
            System.out.println("2.To view all customer's and their sum");
            System.out.println("3.To delete Customer");


            System.out.print("\nEnter your choice: ");
            opt = Integer.parseInt(br.readLine());
            System.out.println();

            switch (opt){
                case 1:
                    System.out.println("==============================");
                    System.out.println("Please enter name and your sum.");
                    System.out.println("Enter: ");
                    name = br.readLine();
                    sum = Integer.parseInt(br.readLine());
                    map.put(name,sum);
                    break;
                case 2:
                    System.out.println("===================================");
                    for(Map.Entry<String,Integer> me : set){
                        System.out.println("Customer name: " + me.getKey());
                        System.out.println("Sum: " + me.getValue() + " USD.");
                    }
                    break;
                case 3:
                    System.out.print("Enter name: ");
                    name = br.readLine();
                    for(Map.Entry<String,Integer> de : set){
                        if(de.getKey().equals(name)) map.remove(name);
                    }
            }
        }while (opt !=0);
    }
}
