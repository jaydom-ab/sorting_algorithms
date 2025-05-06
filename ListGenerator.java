import java.util.ArrayList;
import java.util.Random;

public class ListGenerator{
    private ArrayList<Integer> list; 
    
    public ListGenerator(int i){
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int x = 0; x < i; x++){
            list.add(r.nextInt(101));
        }
        this.list = list;
    }

    public ArrayList<Integer> generate(){
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < this.list.size(); i++){
            newList.add(this.list.get(i));
        }
        return newList;
    }

    public ArrayList<Integer> getList(){
        return this.list;
    }
}


