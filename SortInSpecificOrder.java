import java.util.*;

class SortInSpecificOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sortInSpecificOrder(arr);

        // Display the final sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void sortInSpecificOrder(int[] arr) {
        // Separate odds and evens
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 1) odd.add(num);
            else even.add(num);
        }

        // Sort odds descending, evens ascending
        Collections.sort(odd, Collections.reverseOrder());
        Collections.sort(even);

        // Merge results back into arr
        int index = 0;
        for (int num : odd) arr[index++] = num;
        for (int num : even) arr[index++] = num;
    }
}
