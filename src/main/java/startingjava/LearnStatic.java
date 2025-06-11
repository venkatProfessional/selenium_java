package startingjava;

public class LearnStatic {

    // Static variable (shared across all objects)
    static int staticCounter = 0;

    // Instance variable (unique to each object)
    int instanceCounter = 0;

    // Constructor
    public LearnStatic() {
        staticCounter++;      // shared among all objects
        instanceCounter++;    // separate for each object
    }

    // Method to show non-static behavior
    public void nonStaticExample() {
        System.out.println("Instance Counter: " + instanceCounter);
    }

    // Method to show static behavior
    public void staticExample() {
        System.out.println("Static Counter: " + staticCounter);
    }

    public static void main(String[] args) {

        System.out.println("Initial Static Counter: " + staticCounter);
        System.out.println("------------------------------------");

        LearnStatic l1 = new LearnStatic();
        l1.nonStaticExample();     // instanceCounter = 1
        l1.staticExample();        // staticCounter = 1

        LearnStatic l2 = new LearnStatic();
        l2.nonStaticExample();     // instanceCounter = 1
        l2.staticExample();        // staticCounter = 2

        LearnStatic l3 = new LearnStatic();
        l3.nonStaticExample();     // instanceCounter = 1
        l3.staticExample();        // staticCounter = 3

        LearnStatic l4 = new LearnStatic();
        l4.nonStaticExample();     // instanceCounter = 1
        l4.staticExample();        // staticCounter = 4
    }
}
