package exceptions;
public class Dog {
    int age;
    static void bark() throws Exception{
        System.out.println("Dog is barking");
        throw  new Exception();

    }
}
