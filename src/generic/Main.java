package generic;

import generic.model.User;

public class Main {
    public static void main(String[] args) {
        User<Long, String> user = new User<Long, String>(34L, "Miki", 19L);
        System.out.println(user.toString());







    }
}
