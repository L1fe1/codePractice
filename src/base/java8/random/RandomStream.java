package base.java8.random;

import com.google.common.collect.Range;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RandomStream {
    public static void main(String[] args) {
        Random random = new Random();
        DoubleStream doubleStream = random.doubles(-1.0, 1.0);

        IntStream intStream = random.ints(0, 100);
        intStream.limit(10).forEach(System.out::println);

        IntStream listIntStream = random.ints();
        List<Integer> randomBetween0And99 = listIntStream
                .limit(100)
                .boxed()
                .collect(Collectors.toList());

        randomBetween0And99.stream().forEach(System.out::println);

    }
}
