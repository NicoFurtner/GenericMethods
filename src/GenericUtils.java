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
    public double sum(List<? extends Number>[] array) {

        return 0.0;
    }
}