import java.util.ArrayList;

public class Merge{

    /*
     * Merge Sort:
     * 1. Divide the array into two until the base case ()
     * 2. 
     */

    public void sort(ArrayList<Integer> list){
        mergeSort(list, 0, list.size() - 1); 
        // System.out.println(list);
    }

    public void mergeSort(ArrayList<Integer> list, int start, int end){
        if (start >= end){
            return;
        }

        int middle = (end + start) / 2;
        mergeSort(list, start, middle);
        mergeSort(list, middle + 1, end);
        
        merge(list, start, middle, end);
    }

    public void merge(ArrayList<Integer> list, int start, int middle, int end){
        int lengthOne = middle - start + 1;
        int lengthTwo = end - middle; 

        int[] listOne = new int[lengthOne];
        int[] listTwo = new int[lengthTwo];

        for (int i  = 0; i < lengthOne; i++){
            listOne[i]= list.get(start + i);
        }

        for (int j = 0; j < lengthTwo; j++){
            listTwo[j] = list.get(middle + 1 + j);
        }

        int i = 0, j = 0, k = start;
        
        while(i < lengthOne && j < lengthTwo){
            if (listOne[i] < listTwo[j]){
                list.set(k, listOne[i]);
                i++;
                k++;
            } else {
                list.set(k, listTwo[j]);
                j++;
                k++;
            }
        } 

        while(i < lengthOne){
            list.set(k, listOne[i]);
            i++;
            k++;
        }

        while(j < lengthTwo){
            list.set(k, listTwo[j]);
            j++;
            k++;
        }
    }

}