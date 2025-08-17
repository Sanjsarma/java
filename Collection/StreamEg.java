package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEg {

    public static void main(String[] args) {    
       List <Integer> salaryList = new ArrayList<>();
       salaryList.add(3000);
       salaryList.add(5000);
       salaryList.add(1000);
       salaryList.add(2000);
       salaryList.add(4000);

       // filtering
       long count = salaryList.stream().filter((Integer sal) -> sal > 2000).count();
       System.out.println("no of employees after calc: "+count);

       // map
       List <String> listEg = Arrays.asList("A", "B", "C", "D", "E");
       listEg.stream().map((String val) -> val.toLowerCase());

       // flatMap
       List<List<String>> sentenceList = Arrays.asList(
        Arrays.asList("I", "LOVE", "JAVA"),
        Arrays.asList("CONCEPTS", "ARE", "CLEAR")
       );

       Stream <String> wordsStream = sentenceList.stream().flatMap((List<String> list) -> list.stream());
       wordsStream.forEach((String word) -> System.out.println(word));

       // distinct
       Integer[] arr = {1,2,3,3,4,5,5,6};
       Stream <Integer> arrStream = Arrays.stream(arr).distinct();

       // sorting
       Stream <Integer> arrSorted = Arrays.stream(arr).sorted();
       Stream <Integer> arrSortedDesc = Arrays.stream(arr).sorted((Integer a, Integer b) -> b - a);

    
       // sequence of operations
       List <Integer> numbers = Arrays.asList(2,1,4,9,10);
       List <Integer> numbersStream = numbers.stream()
         .filter((Integer num) -> num >=3)
         .peek((Integer val) -> System.out.println(val))
         .map((Integer val) -> val*-1)
         .peek((Integer val) -> System.out.println(val))
         .sorted()
         .peek((Integer val) -> System.out.println(val))
         .collect(Collectors.toList());

    }  
}
