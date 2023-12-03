public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("Hello \nHello");
        // task 2
        for (int i = 0; i < 10; i++) {
            String stars = "";
            for (int j = 0; j <= i; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
    }
}