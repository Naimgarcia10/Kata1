package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Jose", new Date (102, 9, 24));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
    }

}
