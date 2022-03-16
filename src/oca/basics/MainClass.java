package oca.basics;

public class MainClass {
    /**
     * This is the main method
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Args-size:" + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
}
