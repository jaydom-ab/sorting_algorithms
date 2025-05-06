import java.util.ArrayList;

public class compare_algorithms{
    public static void main(String[] args){
        ListGenerator listGen = new ListGenerator();
        ArrayList<Integer> list = listGen.generate(50);

        
        long begin = 0;
        long end = 0;
        long time = 0;

        Bubble bubble_ex = new Bubble();
        begin = System.nanoTime();
        bubble_ex.sort(list);
        end = System.nanoTime();
        time = end - begin;
        System.out.println("Elapsed Time: " + time + " ns");


        Selection selection_ex = new Selection();
        begin = System.nanoTime();
        selection_ex.sort(list);
        end = System.nanoTime();
        time = end - begin;
        System.out.println("Elapsed Time: " + time + " ns");


        Insertion insertion_ex = new Insertion();
        begin = System.nanoTime();
        insertion_ex.sort(list);
        end = System.nanoTime();
        time = end - begin;
        System.out.println("Elapsed Time: " + time + " ns");
        
        
    }
}