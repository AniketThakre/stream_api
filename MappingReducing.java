import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingReducing {
    public static void main(String[] args) {

//        1. Map a list of integers to their string representations using streams.
//        List<Integer> list = Arrays.asList(1,5,2,4,7,2,0);
//        List<String> res = list.stream().map(s -> "" + s).collect(Collectors.toList());
//        System.out.println(res);
//        System.out.println(res.get(0).getClass().getName());


//        2. Find the product of a list of integers using streams.
//        List<Integer> list = Arrays.asList(2,5,3,4);
//        int res = list.stream().reduce(1,(prod,s) ->prod*s);
//        System.out.println(res);


//        3. Concatenate a list of strings into a single string using streams.
//        List<String> list = Arrays.asList("Aniket","Anmol","Sumita");
//        String res = list.stream().collect(Collectors.joining(""));
//        System.out.println(res);

//        4. Create a list of objects from a list of primitive integers using streams.
//        List<Integer> list = Arrays.asList(2,6,4,8,5);
//        List<MyObject> res = list.stream().map(MyObject::new).collect(Collectors.toList());
//        System.out.println(res);
//        System.out.println(res.get(0).getClass().getName());

//        5. Compute the sum of the lengths of all strings in a list using streams.
//        List<String> list = Arrays.asList("Aniket","Anmol","Sumita");
//        int res = list.stream().map(s -> s.length()).reduce(0,(acc,s) -> acc+s);
//        System.out.println(res);
//        OR
//        int res = list.stream().mapToInt(String::length).sum();
//        System.out.println(res);


    }
}
