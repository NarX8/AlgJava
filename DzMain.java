package lesson6;

import java.util.Random;

public class DzMain {
    public static void main(String[] args) {
        Random rnd = new Random();
        int rndVal = rnd.nextInt(201) - 100;

        final int trees = 20;
        int balanced = 0;
        for (int i = 0; i < trees; i++) {
            Tree t = new Tree(rndVal);
            balanced += (t.isBalanced(false)) ? 1 : 0;
        }
        System.out.println(balanced * 100f / trees + "%");
    }
}