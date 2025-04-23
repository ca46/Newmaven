package Arrayset;
import java.util.ArrayList;

public class CollectionExample {
    public static void main(String[] args) {

        
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");
        System.out.println("a) Colors list: " + colors);

        
        int indexToRetrieve = 2;
        if (indexToRetrieve < colors.size()) {
            System.out.println("b) Element at index " + indexToRetrieve + ": " + colors.get(indexToRetrieve));
        }

        
        System.out.println("c) Iterating through elements:");
        for (String color : colors) {
            System.out.println(color);
        }

       
        if (colors.size() >= 3) {
            colors.remove(2);
            System.out.println("d) After removing third element: " + colors);
        }

        
        String searchColor = "Green";
        if (colors.contains(searchColor)) {
            System.out.println("e) Found '" + searchColor + "' in the list.");
        } else {
            System.out.println("e) '" + searchColor + "' not found in the list.");
        }
    }
}
