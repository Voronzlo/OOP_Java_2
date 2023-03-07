package OOP_2;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Денис", "owener");
        Person person2 = new Person("Влад", "no owener");
        Cat cat = new Cat("Муська");
        Call call = new Call(person, cat);
        call.call();

        System.out.print("\n");
        Call call2 = new Call(person2, cat);
        call2.call();
    }
}