import java.util.Scanner;

public class Coder {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("input your message :");
        String message = scan.nextLine();

        System.out.println("input your code :");
        int code = scan.nextInt();

        System.out.println("coding: " +  code(message, code));

    }


    static String code(String message, int code) {

        StringBuilder result = new StringBuilder(message.length());
        message.chars().forEach(c -> result.append((char) (c ^ code)));
        return result.toString();

    }

}