public class Main {
    public static void main(String[] args) {
            fibShow(10);
            // КУДА ПРОЩЕ СДЕЛАТЬ ЭТО ЧЕРЕЗ ЦИКЛ WHILE, LOL!
    }
    private static void fibShow(int max) {
        int atem1 = 1;
        int atem2 = 1;
        for (int a = 0; a < max; a++) {
            if (a == 0 || a == 1) {
                System.out.println(1);
            } else {
                System.out.println(atem1 + atem2);
                int atem3 = atem1;
                atem2 = atem1 + atem2;
                atem1 = atem3;
            }
        }
    }
}