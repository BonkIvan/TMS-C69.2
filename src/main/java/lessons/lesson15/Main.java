package lessons.lesson15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Collection<String> collection =
                Arrays.asList("fasd","fsd", "fdasf", "poifd", "isjcjr", "jfdhue");

        Stream<String> stream =collection.stream();
        System.out.println();
       stream.sorted().collect(Collectors.toList()).forEach(System.out::println);

        String str;
        //stream.filter("f"::equals).findFirst().orElse("undefined");
        //System.out.println(str);
    }
}
