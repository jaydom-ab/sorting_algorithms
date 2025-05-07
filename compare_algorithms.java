import java.util.ArrayList;

public class compare_algorithms{
    public static void main(String[] args){
        ListGenerator listGen = new ListGenerator(500);
        
        long begin = 0;
        long end = 0;
        long time = 0;

        System.out.println("List Size: " + listGen.getList().size());
        System.out.println("=======Elapsed Time======="); 

        // Bubble Sort
        ArrayList<Integer> bubbleList = listGen.generate();
        Bubble bubble_ex = new Bubble();
        begin = System.nanoTime();
        bubble_ex.sort(bubbleList);
        end = System.nanoTime();
        time = (end - begin) / 1000;
        printout("Bubble Sort", time);

        // Insertion Sort
        ArrayList<Integer> insertionList = listGen.generate();
        Insertion insertion_ex = new Insertion();
        begin = System.nanoTime();
        insertion_ex.sort(insertionList);
        end = System.nanoTime();
        time = (end - begin) / 1000;
        printout("Insertion Sort", time);

        // Selection Sort
        ArrayList<Integer> selectionList = listGen.generate();
        Selection selection_ex = new Selection();
        begin = System.nanoTime();
        selection_ex.sort(selectionList);
        end = System.nanoTime();
        time = (end - begin) / 1000;
        printout("Selection Sort", time);
        
        // Merge Sort
        ArrayList<Integer> mergeList = listGen.generate();
        Merge merge_ex = new Merge();
        begin = System.nanoTime();
        merge_ex.mergeSort(mergeList);
        end = System.nanoTime();
        time = (end - begin) / 1000;
        printout("Merge Sort", time);

        // Quick Sort
        ArrayList<Integer> quickList = listGen.generate();
        Quick quick_ex = new Quick();
        begin = System.nanoTime();
        quick_ex.quickSort(quickList);
        end = System.nanoTime();
        time = (end - begin) / 1000;
        printout("Quick Sort", time);

    }


    public static void printout(String content, long time){
        int additional = 17 - content.length();
        String add = "";
        for (int i = 0; i < additional; i++){
            add += " ";
        }
        System.out.println(content + ":" + add + time + " us");
    }
}