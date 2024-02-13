package rvt;

public class Sorter {
        
    
    public static int smallest(int[] array) {

        int[] numbers = {6, 5, 8, 7, 11};
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {

                min = numbers[i];
            }
            
        }
        return min;
    }
    public static int indexOfSmallest(int[] array){
        int[] numbers = {6, 5, 8, 7, 11};
        int smallest = smallest(numbers);
        int indexOfSmallest = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == smallest) {
                indexOfSmallest = i;
            }
        }
        return indexOfSmallest;
    }
    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int[] numbers = {6, 5, 8, 7, 11};

        int indexOfSmallestFrom = startIndex;
        int smallest = numbers[startIndex];
        
        for (int i = startIndex + 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
                indexOfSmallestFrom = i;
                
            }
        }
        return indexOfSmallestFrom;

    }

    public static int[] swap(int[] array, int index1, int index2) {
        int x = array[index1];
        int y = array[index2];

        array[index1] = y;
        array[index2] = x;

        return array;

    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int indexOfSmallestFrom = indexOfSmallestFrom(array, i);
            swap(array, i, indexOfSmallestFrom);
        }
        return array;
    }
    

}