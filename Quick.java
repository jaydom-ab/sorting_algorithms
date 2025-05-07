import java.util.ArrayList;

public class Quick {
    
    /*
     * Quick Sort:
     * 1. Get the index of the pivot
     * 2. quickSort the list at the left of the pivot element
     * 3. quickSort the list at the right of the pivot element
     */
    
     public void quickSort(ArrayList<Integer> list, int start, int end){
        if (start < end){

            int par = partition(list, start, end);

            quickSort(list, start, par - 1);
            quickSort(list, par + 1, end);
        }
    }
    
    /*
     * Partition Algorithm
     * 1. Assign a pivot element
     * 2. All elements that are less than the pivot are assigned to the right of the pivot index  
     *      a. Iterate through the list and compare numbers less than pivot
     *      b. Swap if less than, then increase pivot index
     * 3. Swap the next index after the lower partition with the pivot.
     */

    public int partition(ArrayList<Integer> list, int start, int end){
        // Step 1
        int pivot = list.get(end);              
        
        // Step 2
        int pivotIndex = start - 1;
        for (int j = start; j <= end - 1; j++){     // Step 2a
            if (list.get(j) < pivot){
                pivotIndex++;
                swap(list, pivotIndex, j);           // Step 2b
            }
        }

        swap(list, pivotIndex + 1, end);             

        return pivotIndex + 1;
    }
    
    
    public void swap(ArrayList<Integer> list, int i, int j){
        int dummy = list.get(i);
        list.set(i, list.get(j));
        list.set(j, dummy);
    }

    

    public void quickSort(ArrayList<Integer> list){
        this.quickSort(list, 0, list.size() - 1);
    }
}
