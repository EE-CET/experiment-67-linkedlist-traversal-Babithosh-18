import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // TODO: Read the integer N
        
        // TODO: Create a LinkedList of Integers
        
        // TODO: Read N integers and add them to the LinkedList
        
        // TODO: Create a ListIterator for the LinkedList
        
        // TODO: Traverse the list in the forward direction and print the elements
        
        // TODO: Traverse the list in the backward direction and print the elements


	int n = scanner.nextInt();
        
        LinkedList<Integer> list = new LinkedList<>();
        
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        
        ListIterator<Integer> iterator = list.listIterator();
        
                        System.out.print("Forward: ");
        if (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        while (iterator.hasNext()) {
            System.out.print(" " + iterator.next());
        }
        System.out.println();
        
        System.out.print("Backward: ");
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous());
            if (iterator.hasPrevious()) {
                System.out.print(" ");
            }
        }
        System.out.println();
        
        scanner.close();

        
    }
}
