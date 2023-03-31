import java.util.ArrayList;
import java.util.List;

public class TestObjectIO {
    public static void main(String[] args) {
        ObjectFile<Person> of = new ObjectFile<>();
//        List<Person> list = new ArrayList<>();
//        list.add(new Person(1,"hung 1",18,true));
//        list.add(new Person(2,"hung 2",19,true));
//        list.add(new Person(3,"hung 3",26,true));
//        list.add(new Person(4,"hung 4",23,true));
//        list.add(new Person(5,"hung 5",20,true));
//        list.add(new Person(6,"hung 6",30,true));
//        of.writeToFile("E:\\JAVACORE\\BinaryFile\\src\\document.txt",list);

        List<Person> listPersons = of.readFromFile("E:\\JAVACORE\\BinaryFile\\src\\document.txt");
        display(listPersons);

    }
    public static  void  display(List<Person> list){
        for (Person person : list) {
            System.out.println(person);
        }
    }
}
