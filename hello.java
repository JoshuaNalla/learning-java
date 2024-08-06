import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What number do you want: ");
        int n = scanner.nextInt();

        switch (n) {
            case 1:
                System.out.print("It's Monday!");
                break;
            case 2:
                System.out.print("It's Tuesday");
                break;
            default:
                System.out.print("Get your facts straight, cuh");
                break;
        }
    }
}
