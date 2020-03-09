package Main;

import defination.Defination;

public class Main {
    public static void main(String[] args) {
        Defination<String> def = new Defination<>();
        def.enQueue("Hi");
        def.enQueue("yoyo");
        def.enQueue("vghbujnjnj");
        def.display();
        def.deQueue();
        def.peek();
        System.out.println("ELement from peek is " + def.peek());
    }
}
