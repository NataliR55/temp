package algoritm;

public class Practicum {
    public static void main(String[] args) {
        int[] array = {1, 2, 65, 3, 5, 7, 54, 12, 46, 4, 2};
        System.out.println("Индекс искомого элемента: " + find(array, 3));
    }

    public static int find(int[] array, int elem) {
        int index = -1;
        int lengthArrey = array.length;
        int midleArrey = array.length / 2;
        for (int i = 0; i < midleArrey; i++) {
            if (array[i] == elem) return i;
            if (array[lengthArrey - 1 - i] == elem) return (lengthArrey - 1 - i);
            index = array[i] == elem ? i : index;
            index = array[lengthArrey - 1 - i] == elem ? i : index;
        }
        return index;
    }

}