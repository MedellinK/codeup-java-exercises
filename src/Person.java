public class Person {

    public static void main(String[] args) {
        Person person1 = new Person("John");
        person1.sayHello();
        Person person2 = new Person("Jane");
        person2.sayHello();
        Person person3 = new Person("Joe");
        person3.sayHello();

    }

    private String name;

    public String getName() {
        return name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, " + name + "!");
    }


}


