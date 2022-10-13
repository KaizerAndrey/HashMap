import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit," +
                " sed do eiusmod tempor incididunt ut labore et dolore magna aliqua." +
                " Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris " +
                "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit" +
                " in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint " +
                "occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        char[] chars = text.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : chars) {
            if (map.containsKey(ch)) {
                int value = map.get(ch) + 1;
                map.replace(ch, value);
            } else {
                map.put(ch, 1);
            }
        }
        // вывод всей map
        System.out.println(map);
        // max_VALUE
        int maxValue = -1;
        for (int value : map.values()) {
            if (value > maxValue) {
                maxValue = value;

            }
        }

        System.out.println("Максимальное значение " + maxValue);
        // min_VALUE
        int minValue = Integer.MAX_VALUE;
        for (int value : map.values()) {
            if (value < minValue) {
                minValue = value;

            }
        }
        System.out.println("Минимальное значение " + " " + minValue);

    }
}
