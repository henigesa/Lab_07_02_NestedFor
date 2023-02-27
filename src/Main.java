public class Main {
    public static void main(String[] args) {
        // complete for nested loop for part 1
        for (int i = 0; i < 6; i++) {
            for (int c = 1; c <= i; c++ ) {
                System.out.print("*");
            }
        System.out.println("");
        }
        //write for nested loop for part 2
        for (int i = 0; i < 6; i++) {
            for (int c = 5; c > i; c-- ) {
                System.out.print("*");
            }
            System.out.println("");
        }
        //write for nested loop for part 3
        for (int i = 0; i < 5; i++) {
            for (int c = 0; c < 6; c++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}