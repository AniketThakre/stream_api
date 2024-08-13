import javax.swing.plaf.ToolBarUI;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AdvanceOperation {
    public static void main(String[] args) {

//        1. Use `flatMap` to flatten a list of lists of integers into a single list.
//        List<List<Integer>> listOfLists = Arrays.asList(
//                Arrays.asList(1,2,3),
//                Arrays.asList(4,5,6),
//                Arrays.asList(7,8,9)
//        );
//        List<Integer> resList = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
//        System.out.println(resList);


//        2. Partition a list of integers into even and odd numbers using streams.
//        List<Integer> list = Arrays.asList(1,5,2,4,8,3,0);
//        Map<Boolean,List<Integer>> partitionMap = list.stream().collect(Collectors.partitioningBy(s-> s %2 == 0));
//        List<Integer> evenList = partitionMap.get(true);
//        List<Integer> oddList = partitionMap.get(false);
//        System.out.println(evenList);
//        System.out.println(oddList);

//        3. Create a list of objects that match a specific predicate using streams.(I did it with array of objects. we can even try with list of object.)
//        People[] object = {
//                new People(1, "Aniket", 27),
//                new People(2, "Anmol", 29),
//                new People(3,"Sumita",59)
//        };
//        List<People> list = Arrays.stream(object).filter(s -> s.getAge()<30).collect(Collectors.toList());
//        System.out.println(list);

//        4. Implement a custom collector that collects elements into a list.
//        The solution is in CustomListCollector file.

//        5. Implement a custom collector that collects elements into a map with specific keys and values.




    }
}
