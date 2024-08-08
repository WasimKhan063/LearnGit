class MyClass {
    // Constructor
    MyClass() {
        System.out.println("Object created!");
    }

    // Overriding the finalize() method
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize() method called!");
    }
}

public class FinalizeExample {
    public static void main(String[] args) {
        MyClass obj = new MyClass();  // Creating an object

        // Making the object eligible for garbage collection
        obj = null;

        // Requesting JVM to run Garbage Collector
        System.gc();  // This might or might not invoke finalize(), depending on JVM behavior

        // Adding a delay to ensure that GC has time to run (not guaranteed)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of main method.");
    }
}
