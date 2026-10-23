import java.util.List;

public class RemoveElement
{

    public static int removeElementInplace(List<Integer> arr, int val) {
        int k = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) != val) {
                arr.set(k, arr.get(i));
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        List<Integer> list = new java.util.ArrayList<>(List.of(0, 2, 6, 6, 1, 0, 4, 6));
        int n = removeElementInplace(list, 6);
        System.out.println("n = " + n);
        System.out.println(list);
    }
}