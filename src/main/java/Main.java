import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст");

        Function(sc.nextLine());

        sc.close();
    }

    public static void Function(String text) {
        Stream.of(text)
                .map(value -> Arrays.stream(value.split(" "))
                        .sorted()
                        .collect(Collectors.toList()))
                .forEach(x ->
                        System.out.println("Sorted: " + x));
    }
}
