// package CipherSchoolWeeklyAssignment.Week3;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
public class Test4 {
    public static void main(String[] args) {
        // -ve integer
        List<Integer> numbers = Arrays.asList(12,-44,19,21,-55,77);

        List<Integer> result = numbers.stream().filter(e-> e<0).collect(Collectors.toList());
        System.out.println(result);

        // only integer
        
        List<Object> myList = Arrays.asList(true,100,"hello",200,false,"welcome",300,true,false);
        List<Object> result1 = myList.stream().filter(e->e.getClass().getSimpleName().equals("Integer")).collect(Collectors.toList());
        System.out.println(result1);

        // object type
        myList.forEach(m->{
            System.out.println(m+" -> "+ m.getClass().getSimpleName());
        });
        //total integer
        int totalInteger = (int) myList.stream().filter(e->e.getClass().getSimpleName().equals("Integer")).count();
        System.out.println("Total Integer: " + totalInteger );

        List<String> colors = Arrays.asList("red","green", "red","Orange","green","red");
        List<String> result2 = colors.stream().map(e->e.toUpperCase()).distinct().collect(Collectors.toList());
        System.out.println(result2);
    }
}
