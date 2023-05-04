package restaurant;

import restaurant.model.Client;
import restaurant.model.Desserts;
import restaurant.model.Drink;
import restaurant.service.Menu;

public class Main {
    public static void main(String[] args) {
        Menu[] arr = {Desserts.CHEESECAKE, Drink.COLA, Drink.APPLE_JUICE};
        Client client = new Client(arr, 12.4);
        System.out.println(client.fullPrice());
    }
}
