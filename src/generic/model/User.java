package generic.model;

public class User<T, R> {
    private T id;
    private R username;
    private T age;


    public User(T id, R username, T age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }


    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public R getUsername() {
        return username;
    }

    public void setUsername(R username) {
        this.username = username;
    }

    public T getAge() {
        return age;
    }

    public void setAge(T age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
