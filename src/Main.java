import restaurant.Client;
import restaurant.Desserts;
import restaurant.Drink;
import restaurant.Menu;

public class Main {
    public static void main(String[] args) {
        Menu[] arr = {Desserts.CHEESECAKE, Drink.COLA, Drink.APPLE_JUICE};
        Client client = new Client(arr, 12.4);
        System.out.println(client.fullPrice());
    }



}