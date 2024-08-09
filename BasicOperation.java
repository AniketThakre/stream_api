import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class BasicOperation {
    public static void main(String[] args) {
//        1. Create a stream from a list of integers and print each integer.
//        List<Integer> list = Arrays.asList(2,1,5,2,4,9);
//        list.stream().forEach(System.out::println);


//        2. Filter out even numbers from a list of integers using streams.
//        List<Integer> list = Arrays.asList(2,1,5,2,4,9);
//        List<Integer> res = list.stream().filter(n -> n%2==0).collect(Collectors.toList());
//        System.out.println(res);

//        3. Find the maximum value in a list of integers using streams.
//        List<Integer> list = Arrays.asList(2,1,5,2,4,9);
//        int max = list.stream().max(Integer::compareTo).orElse(0);
//        System.out.println(max);

//        4. Find the minimum value in a list of integers using streams.
//        List<Integer> list = Arrays.asList(2,1,5,2,4,9);
//        int min = list.stream().min(Integer::compareTo).orElse(0);
//        System.out.println(min);


//        5. Count the number of elements in a list of strings using streams.
//        List<String> list = Arrays.asList("Aniket","Anmol","Sumita");
//        long count = list.stream().count();
//        System.out.println(count);


//        6. Check if all elements in a list of integers are positive using streams.
//        List<Integer> list = Arrays.asList(1,7,3,5,-3,-6);
//        boolean res =   list.stream().allMatch(n -> n>0);
//        System.out.println("The list "+  (res ? "" : "does not" )+" contains all positive values.");

//        7. Check if any element in a list of strings contains a certain substring using streams.
//        List<String> list = Arrays.asList("Aniket","Anmol","Sumita");
//        boolean res = list.stream().filter(s-> s.contains("An")).collect(Collectors.toList()).isEmpty();
//        System.out.println(res);

//        8. Find the sum of a list of integers using streams.
//        List<Integer> list = Arrays.asList(1,4,6,2,7,3);
//        int sum = list.stream().mapToInt(Integer::intValue).sum();
//        System.out.println(sum);

//        9. Find the average of a list of integers using streams.
//        List<Integer> list = Arrays.asList(1,6,3,5,8,3);
//        double avg = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
//        System.out.println(avg);

//        10. Create a new list with the squared values of a list of integers using streams.
//        List<Integer> list = Arrays.asList(1,4,6,3,7,2,8);
//        List<Integer> squareList = list.stream().map(n->n*n).collect(Collectors.toList());
//        System.out.println(squareList);
    }
}
