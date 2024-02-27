import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] integer = {1,2,3,4};
        System.out.println("Array bevor dem reverse: " + Arrays.toString(integer));
        GenericUtils.reverse(integer);
        System.out.println("Array nach dem reverse: " + Arrays.toString(integer));

        Double[] sum = {1.6,3.5,8.5,4.0,5.3};
        System.out.println("Summe Array: " + GenericUtils.sum(sum));

    }
}
