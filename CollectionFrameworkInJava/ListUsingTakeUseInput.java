package CollectionFrameworkInJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListUsingTakeUseInput {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names to add: ");
        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter name " + (i + 1) );
            names.add(sc.nextLine());
        }

        System.out.println(names);

        System.out.print("Enter a name to insert: ");
        String insertName = sc.nextLine();
        System.out.print("Enter index to insert at: ");
        int insertIndex = sc.nextInt();
        sc.nextLine();
        if (insertIndex >= 0 && insertIndex <= names.size()) {
            names.add(insertIndex, insertName);
        }

        System.out.println(names);

        System.out.print("Enter index to get element: ");
        int getIndex = sc.nextInt();
        sc.nextLine();
        if (getIndex >= 0 && getIndex < names.size()) {
            String name2 = names.get(getIndex);
            System.out.println(name2);
        }

        System.out.print("Enter index to set new name: ");
        int setIndex = sc.nextInt();
        sc.nextLine();
        if (setIndex >= 0 && setIndex < names.size()) {
            System.out.print("Enter new name: ");
            String newName = sc.nextLine();
            names.set(setIndex, newName);
        }

        System.out.println(names);

        System.out.print("Enter index to remove: ");
        int removeIndex = sc.nextInt();
        sc.nextLine();
        if (removeIndex >= 0 && removeIndex < names.size()) {
            names.remove(removeIndex);
        }

        System.out.println(names);

        System.out.print("Enter name to check: ");
        String checkName = sc.nextLine();
        System.out.println(names.contains(checkName));

        System.out.println(names.size());
        System.out.println(names.isEmpty());

        names.clear();
        System.out.println(names);

        names.add("Rahul");
        names.add("Sushant");
        names.add("Parth");
        names.add("Yash");
        System.out.println(names);
        System.out.println(names.indexOf("Sushant"));

        sc.close();
    }
}
