package customersearch;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main  {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name;
        int sum;
        int opt = 0;
        int changeSum;
        int telephone;
        String address;
        HashMap<String,Integer> info = new HashMap<>();
        Set<Map.Entry<String,Integer>> infoset =  info.entrySet();



        HashMap<String,Integer> map = new HashMap<>();
        Set<Map.Entry<String,Integer>> set = map.entrySet();
        do {
            System.out.println("========Application options========");
            System.out.println("1.To add customer and cash sum");
            System.out.println("2.To view all customer's and their sum");
            System.out.println("3.To delete Customer");
            System.out.println("4.To add sum on account client");
            System.out.println("5.View all customers");
            System.out.println("6.Enter customer data");
            System.out.println("7.View customer data");
            System.out.println("0.Exit");


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
                    break;
                case 4:
                    System.out.print("Enter name: " );
                    name = br.readLine();
                    for(Map.Entry<String,Integer> su: set){
                        if(su.getKey().equals(name)){
                            System.out.print("Enter sum: ");
                            sum = Integer.parseInt(br.readLine());
                            int s = su.getValue();
                            changeSum = s + sum;
                            map.put(name,changeSum);
                        }
                    }
                    break;

                case 5:
                    System.out.println("===================================");
                    for(Map.Entry<String,Integer> vi : set){
                        System.out.println("Customer: " + vi.getKey());
                    }
                    break;


                case 6:
                    System.out.println("Enter your name: ");
                    name = br.readLine();
                    for(Map.Entry<String,Integer> en : set){
                        if(en.getKey().equals(name)){
                            System.out.println("Enter address and mobile telephone:  ");
                            address = br.readLine();
                            telephone = Integer.parseInt(br.readLine());
                            info.put(address,telephone);
                        }
                    }
                    break;
                case 7:
                    System.out.println("Enter name: ");
                    name = br.readLine();
                    for(Map.Entry<String,Integer> view : set){
                        if(view.getKey().equals(name)){
                            for(Map.Entry<String,Integer> inf : infoset){
                                System.out.println("Adrres: " + inf.getKey());
                                System.out.println("Telephone: " + inf.getValue());
                            }
                        }
                    }
                    break;



                case 0:
                    System.out.println("Thank you!!\n****Good Bye****");
                    break;


                default:
                    System.out.println("Invalid Option!\n");
                    break;
            }
        }while (opt !=0);
    }
}
