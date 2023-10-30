public class Main {
    public static void main(String[] args) {

        // 0 to 30 by 1
        for (int i = 0; i < 31; i++) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        // 30 to 0 by 1
        for (int j = 30; j > 0; j--) {
            System.out.print(j + " ");
        }
        System.out.println(" ");

        // 0 to 18 by 3
        for (int k = 0; k < 19; k +=3) {
            System.out.print(k + " ");
        }
        System.out.println(" ");

        // 10 to 0 by 2
        for (int l = 10; l > -1; l-= 2) {
            System.out.print(l + " ");
        }
    }
}