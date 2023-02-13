import java.util.List;
import java.util.Arrays;
class Program{
    static void Converter(int arg){
        System.out.println(Math.abs(arg));
    }
    void doAction(){
        List<Integer> numbers = Arrays.asList(5,-3,6,7,8,-9,2);
        numbers.forEach(Program::Converter);
    }
}
public class Test1 {
    public static void main(String[] args) {
        Program obj = new Program();
        obj.doAction();
    }
}