package exam2;

import java.util.Arrays;
import java.util.List;

class Person {
    String name;
    int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Example4 {
    
    public static void main(String[] args) {
        Object[] a = new Object[3];
        List<Object> list = Arrays.asList(a);
        list = (List<Object>) new Person("¿”≤©¡§",22);
    }

}

