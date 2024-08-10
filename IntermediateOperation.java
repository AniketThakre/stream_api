import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntermediateOperation {

    public static void main(String[] args) {

//        1. Create a stream of the first 10 prime numbers.
//        Stream<Integer> prime = Stream.iterate(2, IntermediateOperation::nextPrime).limit(10);
//        prime.forEach(System.out::println);

//        2. Skip the first 5 elements and print the remaining elements of a stream.
//        Stream.iterate(1,s->s+1).limit(10).skip(5).forEach(System.out::println);

//        3. Limit the stream to the first 5 elements and print them.
//        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
//        list.stream().limit(5).forEach(System.out::println);

//        4. Create a stream from an array and convert it to a list.
//        String[] arr = {"Aniket","Anmol","Sumita"};
//        List<String> list = Arrays.stream(arr).collect(Collectors.toList());
//        System.out.println(list);

//        5. Convert a stream of objects to a map with a custom key and value.
//        People[] object = {
//                new People(1, "Aniket", 27),
//                new People(2, "Anmol", 29)
//        };
//        Map<String,Double> people = Arrays.stream(object).collect(Collectors.toMap(
//                People::getName,
//                People::getAge
//        ));
//        System.out.println(people);




    }
    
    public static int nextPrime(int num){
        num++;
        while(!isPrime(num)){
            num++;
        }
        return num;
    }
    public static boolean isPrime(int num){
        if(num == 1)
            return false;
        if(num == 2 || num == 3)
            return true;
        if(num % 2 == 0 || num % 3 == 0)
            return false;
        for(int i=5; i*i <=num ; num+=6 ){
            if(num % i == 0 || num % (i+2) == 0)
                return false;
        }
        return true;
    }
}
