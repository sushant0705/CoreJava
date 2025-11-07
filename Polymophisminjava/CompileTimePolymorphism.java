package Polymophisminjava;

public class CompileTimePolymorphism {
    void developer(int a) {
        System.out.println("Frontend Developer");
    }
    void developer(int a, int b) {
        System.out.println("Backend Developer");
    }
    void developer(int a, int b, int c) {
        System.out.println("Database Developer");
    }
    void developer(int a, int b, int c, int d) {
        System.out.println("Full Stack Developer");
    }

    public static void main(String[] args) {
        CompileTimePolymorphism c = new CompileTimePolymorphism();
        c.developer(10);
        c.developer(10, 20);
        c.developer(10, 20, 30);
        c.developer(10, 20, 30, 40);
    }
}

