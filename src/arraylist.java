import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        //Arraylist = a resizeable array
        // Elements can be added, remove, etc.. after compilation phase
        //store reference data types
        //syntax
        ArrayList<String>food=new ArrayList<String>();
      //ArrayList<>variablename = new ArrayList<>();
        food.add("briyani");
        food.add("milkshake");
        food.add("pizza");
        food.add("sambarbhuva");
        food.add("rasambhava");

        food.set(1,"chocolate milkshake");
        food.remove(4);
        //food.clear();

        for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }

    }

}
