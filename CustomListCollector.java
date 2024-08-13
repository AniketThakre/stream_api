import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;

public class CustomListCollector<T> implements Collector<T, List<T>, List<T>> {

    @Override
    public Supplier<List<T>> supplier() {
        return ArrayList::new;
    }

    @Override
    public BiConsumer<List<T>, T> accumulator() {
        return List::add;
    }

    @Override
    public BinaryOperator<List<T>> combiner() {
        return (list1, list2) -> {
            list1.addAll(list2);
            return list1;
        };
    }

    @Override
    public Function<List<T>, List<T>> finisher() {
        return Function.identity(); // No transformation needed
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Collections.unmodifiableSet(EnumSet.of(Collector.Characteristics.IDENTITY_FINISH));
    }

    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "orange", "apple");

        List<String> result = items.stream().collect(new CustomListCollector<>());

        System.out.println(result);
    }
}
