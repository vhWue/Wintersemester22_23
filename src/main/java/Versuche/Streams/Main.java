package Versuche.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        String[] arr = {"Car","Haus","Wohnmobil", "Parkplatz"};
        Arrays.stream(arr)
                .filter(value->value.contains("a"))
                .forEach(System.out::println);


        List<String> bBrothers = Arrays.asList("Burt","Bronski","Peter");
        Function<String,String> toUpperCase = String::toUpperCase;
        Optional<String> longest = bBrothers.stream()
                .map(toUpperCase)
                .max((o1,o2)->Integer.compare(o1.length(),o2.length()));

        System.out.println(longest);

    }
}
