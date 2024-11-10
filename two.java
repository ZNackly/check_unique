import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int size = in.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(20);
        }
        Map<Integer, Integer> elem = new HashMap<>();
        for (int i : array) {
            if (elem.containsKey(i)) {
                elem.replace(i, elem.get(i) + 1);
            } else {
                elem.put(i, 1);
            }
        }
        System.out.println(Arrays.toString(array));
        for (Map.Entry<Integer, Integer> i : elem.entrySet()) {
            if (i.getValue() == 1) {
                System.out.printf("Число %s встретилось 1 раз \n", i.getKey());
            } else {
                System.out.printf("Количество повторений числа %s равно %s \n", i.getKey(), i.getValue());
            }
        }
    }
}
