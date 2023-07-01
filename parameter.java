import java.util.ArrayList;
import java.util.List;

class parameter{
    public int[] findPermutation(String s) {
        int n = s.length();
        int low = 0, high = n;
        List<Integer> perm = new ArrayList<>();

        for (char c : s.toCharArray()) {
            if (c == 'I') {
                perm.add(low);
                low++;
            } else if (c == 'D') {
                perm.add(high);
                high--;
            }
        }

        // Append the remaining element
        perm.add(low);

        // Convert the list to an array
        int[] result = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            result[i] = perm.get(i);
        }

        return result;
    }
}
