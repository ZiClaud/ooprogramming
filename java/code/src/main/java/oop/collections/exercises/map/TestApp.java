package oop.collections.exercises.map;

/**
 * Provide an implementation of the MyMap interface and test it with the
 * main() functions reported below
 */
public class TestApp {
    public static void main(String[] args) {
        MyMap m = new MyHashMap();
        m.put(11, "Nicola");
        m.put(21, "Marzia");
        m.put(33, "Agata");
        System.out.println(m);
    }
}
