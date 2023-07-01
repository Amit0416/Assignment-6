import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class twice {
    public int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 != 0)
            return new int[0];

        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : changed)
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);

        List<Integer> originalList = new ArrayList<>();

        for (int num : changed) {
            if (frequency.getOrDefault(num, 0) == 0)
                continue;

            if (frequency.getOrDefault(num * 2, 0) == 0)
                return new int[0];

            originalList.add(num);
            frequency.put(num, frequency.get(num) - 1);
            frequency.put(num * 2, frequency.get(num * 2) - 1);
        }

        int[] original = new int[originalList.size()];
        for (int i = 0; i < originalList.size(); i++)
            original[i] = originalList.get(i);

        return original;
    }
}

