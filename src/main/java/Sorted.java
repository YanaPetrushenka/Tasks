import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorted {
    public static void main(String[] args) {
        List<Integer> sortedList = Arrays.asList(1, 1, 2, 3, 4, 4, 5, 6);
        List<Integer> newList = new ArrayList<>(sortedList);

        for (int i = 1; i < newList.size(); i++) {
            if (newList.get(i).equals(newList.get(i - 1))) {
                newList.remove(i);
                i--;
            }
        }
        System.out.println("Исходный список: " + sortedList);
        System.out.println("Список без дубликатов: " + newList);
    }
}
