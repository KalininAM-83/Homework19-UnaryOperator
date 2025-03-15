import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(3, 8, 10, 12, 58, 96, -7, 0);
        System.out.println("\nУвеличиваем каждое число из списка в 2 раза с помощью UnaryOperator");
        list
                .stream()
                .map(new UnaryOperatorDemo())
                .forEach(System.out::println);

        System.out.println("\nУвеличиваем каждое число из списка на 2 с помощью анонимной функции");
        list
                .stream()
                .map(integer -> integer + 2)
                .forEach(System.out::println);
    }
}
