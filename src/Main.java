import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
       public static void main(String[] args) throws IOException {
        Map<String, Client> clientMap = new HashMap<String, Client>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while (!line.equalsIgnoreCase("exit")){
            String clientName = "";
            int discount = 0;
            Client client = null;
            line = bufferedReader.readLine();
            if (line.equalsIgnoreCase("addclient")) {
                System.out.println("Please, input client name:");
                clientName = bufferedReader.readLine();
                System.out.println("Please, input client's discount:");
                discount = Integer.valueOf(bufferedReader.readLine());
                client = new Client(clientName,discount);
                clientMap.put(client.getFio(), client);
                System.out.println("Client " + client.getFio() + " with discount " + client.getDiscount() + " was successfully added.");


            }
        }

    }
}
