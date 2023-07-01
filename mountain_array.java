public class mountain_array {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3)
            return false;

        int i = 0;

        // Increasing phase
        while (i < arr.length - 1 && arr[i] < arr[i + 1])
            i++;

        // Peak should not be the first or last element
        if (i == 0 || i == arr.length - 1)
            return false;

        // Decreasing phase
        while (i < arr.length - 1 && arr[i] > arr[i + 1])
            i++;

        return i == arr.length - 1;
    }
}

