package Homework_4;

import java.util.Random;

public class Task_1_2 {

    public enum Numbers {

        A (1),
        B (2),
        C (3),
        D (4),
        E (5),
        F (6),
        G (7),
        H (8),
        I (9),
        J (10),
        K (11),
        L (12),
        M (13),
        N (14),
        O (15),
        AA (1),
        BB (2),
        CC (3),
        DD (4),
        EE (5),
        FF (6),
        GG (7),
        HH (8),
        II (9),
        JJ (10),
        KK (11),
        LL (12),
        MM (13),
        NN (14),
        OO (15);

        private final int index;

        Numbers (int index) {
            this.index = index;
        }

        public int index() {
            return index;
        }
    }

    public static void main (String [] args) {

        int t = new Random().nextInt(Numbers.values().length);
        System.out.println(t);

    }
}
