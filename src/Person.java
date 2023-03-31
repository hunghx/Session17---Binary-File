import java.io.Serializable;

public class Person implements Serializable {
    private int id;
    private String name;
    private int age;
    private boolean sex;

    public Person(int id, String name, int age, boolean sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ']';
    }
}
