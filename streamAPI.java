import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamAPI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 3, 2, 9, 7, 6);

        // list.forEach(n -> System.out.println(n));


        // -- Stream --
        Stream<Integer> s1 = list.stream();
        Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
        Stream<Integer> s3 = s2.map(n -> n * 2);

        // s3.forEach(n -> System.out.println(n));

        // int result = s3.reduce(0, (c, e) -> c+e);
        // System.out.println(result);

        int result = list.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, (c, e) -> c+e);

        System.out.println(result);
    }
}
