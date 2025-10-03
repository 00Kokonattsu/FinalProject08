import java.util.Scanner;
class retest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println(x);
        x += input.nextInt();
        System.out.println(x);
        input.close();
    }
}
