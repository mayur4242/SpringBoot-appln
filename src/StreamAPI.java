import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StreamAPI {
    public static void main(String[] args) {

        List<Integer> listnum = new ArrayList<>();
        listnum.add(1);
        listnum.add(2);
        listnum.add(5);
        listnum.add(96);
        listnum.add(5);
        listnum.add(1);
        listnum.add(10);


        //sort in Ascending Order
      /* List<Integer> sortNum = listnum.stream().sorted().toList();
       System.out.println(sortNum);*/

        //Sort in Descending Order
        /*List<Integer> sortDescNum = listnum.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortDescNum);*/

        //      Filter Even Numbers
      /* List<Integer> evenNum = listnum.stream().filter(n -> n%2==0).collect(Collectors.toList());
       System.out.println(evenNum);*/

        //Square Each Number
         /*List<Integer> squreNum = listnum.stream().map(num -> num*num).collect(Collectors.toList());
        System.out.println(squreNum);*/

        // Remove Duplicates
       List<Integer> uniqueNumbers = listnum.stream().distinct().collect(Collectors.toList());
       System.out.println(uniqueNumbers);

    }
}
