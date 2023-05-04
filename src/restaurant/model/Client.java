package restaurant.model;

import restaurant.service.Menu;

public class Client {
    private Menu[] menu;
    private double tips;


    public Client(Menu[] menu, double tips) {
        this.menu = menu;
        this.tips = tips;
    }

    public Client() {
    }


    public Menu[] getMenu() {
        return menu;
    }

    public void setMenu(Menu[] menu) {
        this.menu = menu;
    }

    public double getTips() {
        return tips;
    }

    public void setTips(double tips) {
        this.tips = tips;
    }

    public double fullPrice() {
        double allPrice = 0;
        for (Menu i : menu) {
            allPrice += i.getPrice();
        }
        allPrice += tips;
        return allPrice;
    }


}
