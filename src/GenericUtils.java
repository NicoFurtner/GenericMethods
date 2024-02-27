import java.util.List;

/**
 * Class GenericUtils
 * @author Nico Furtner
 * @version 2024-27-02
 */
public class GenericUtils {
    public static <T> void reverse(T[] array) {
        int j = array.length - 1;
        for(int i = 0; i < j; i++) {
            T arr = array[i];
            array[i] = array[j];
            array[j] = arr;
            j--;
        }
    }
    public static <T extends Number> double sum(T[] array) {
        double sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i].doubleValue();
        }
        return sum;
    }
}