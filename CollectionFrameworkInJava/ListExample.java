package CollectionFrameworkInJava;
import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        //add element
        names.add("Sushant");
        names.add("Rahul");
        names.add("Amit");

        System.out.println(names);
        //add element with index
        names.add(1, "Pooja");
        System.out.println(names);
        //get elements of index
        String name2 = names.get(2);
        System.out.println(name2);
        //set element using index
        names.set(2, "Rohan");
        System.out.println(names);
        //remove element using index
        names.remove(3);
        System.out.println(names);
        //check element in list or not
        System.out.println( names.contains("Sushant"));
        //check size
        System.out.println( names.size());
        //check it is empty
        System.out.println( names.isEmpty());
        //used to clear
        names.clear();
        System.out.println( names);
        //add elements
        names.add("Rahul");
        names.add("Sushant");
        names.add("Parth");
        names.add("Yash");
        System.out.println( names);
        //check index of elements
        System.out.println(names.indexOf("Sushant"));
    }
}
