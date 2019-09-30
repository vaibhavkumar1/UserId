import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        int c = scanner.nextInt();
        user user = new user(a, b, c);
        System.out.println(user.s());
    }
}
