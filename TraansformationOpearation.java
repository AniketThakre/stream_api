import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TraansformationOpearation {
    public static void main(String[] args) {

//        1. Convert a list of strings to uppercase using streams.
//        List<String> list = Arrays.asList("Aniket","Anmol","Sumita");
//        List<String> res = list.stream()
//                          .map(n->n.toUpperCase())
//                          .collect(Collectors.toList());
//        System.out.println(res);

//        2. Convert a list of strings to a single string with comma-separated values using streams.
//        List<String> list = Arrays.asList("Aniket","Anmol","Sumita");
//        String res = list.stream()
//                          .collect(Collectors.joining(","));
//        System.out.println(res);

//        3. Remove duplicates from a list of integers using streams.
//        List<Integer> list = Arrays.asList(2,6,3,6,9,3,2);
//        List<Integer> res = list.stream()
//                          .distinct()
//                          .collect(Collectors.toList());
//        System.out.println(res);

//        4. Sort a list of integers in ascending order using streams.
//        List<Integer> list = Arrays.asList(2, 6, 3, 9);
//        List<Integer> sortedList = list.stream()
//                          .sorted()
//                          .collect(Collectors.toList());
//        System.out.println(sortedList);

//        5. Sort a list of integers in descending order using streams.
//        List<Integer> list = Arrays.asList(7,3,8,9,2);
//        List<Integer> sortedList = list.stream()
//                          .sorted((a,b) -> b-a)
//                          .collect(Collectors.toList());
//        System.out.println(sortedList);

//        6. Create a list of the lengths of strings in a list of strings using streams.
//        List<String> list = Arrays.asList("Aniket","Anmol","Sumita");
//        List<Integer> res = list.stream()
//                          .map(n-> n.length())
//                          .collect(Collectors.toList());
//        System.out.println(res);


//        7. Capitalize the first letter of each string in a list of strings using streams.
//        List<String> list = Arrays.asList("aniket","anmol","sumita");
//        List<String> res =  list.stream()
//                          .map(n->n.substring(0,1).toUpperCase() + n.substring(1))
//                          .collect(Collectors.toList());
//        System.out.println(res);

//        8. Create a new list by concatenating strings from two lists using streams.
//        List<String> list1 = Arrays.asList("A1","A2","A3");
//        List<String> list2 = Arrays.asList("B1","B2","B3");
//        List<String> res =  list1.stream().flatMap( s1 -> list2.stream().map(s2 -> s1 + s2)).collect(Collectors.toList());
//        System.out.println(res);

//        9. Convert a list of integers to a set using streams.
//        List<Integer> list = Arrays.asList(3,5,2,7,2,7,1,9);
//        Set<Integer> set = list.stream().collect(Collectors.toSet());
//        System.out.println(set);

//        10. Group a list of strings by their length using streams.
//        List<String> list = Arrays.asList("Aniket","Anmol","Sumita","Raghav","Sonu");
//        Map<Integer, List<String>> map = list.stream()
//                .collect(Collectors.groupingBy(String::length));
//        System.out.println(map);

//        11. Merge two string into one by placcing the chacters of the string alternately (Asked in Apexon)
//        String str1 = "ABCD";
//        String str2 = "1234";
//
//        String res = IntStream.range(0,Math.max(str1.length(),str2.length()))
//                .mapToObj(value -> (value < str1.length() ? String.valueOf(str1.charAt(value)) : "") +
//                        (value < str2.length() ? String.valueOf(str2.charAt(value)) : ""))
//                .reduce("",(acc,str) -> acc+str);
//        System.out.println(res);
    }
}
