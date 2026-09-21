package csc400mod1;

import java.util.ArrayList;

/**
 * Bag class represents a bag that can contain
 * duplicate items and doesn't enforce an order
 *
 * param <T> the type of element stored in the bag
 */
public class Bag<T> {

    // ArrayList is used to store the items
    private ArrayList<T> items;


    //Constructor creates an empty bag

    public Bag() {
        items = new ArrayList<>();
    }

    /**
     * Adds an item to the bag
     *
     * param item the item to add
     */
    public void add(T item) {
        items.add(item);
    }

    /**
     * Removes one occurrence of an item from the bag
     * If the item doesn't exist, do nothing
     *
     * param item the item to remove
     */
    public void remove(T item) {
        items.remove(item);
    }

    /**
     * Checks whether an item exists in the bag
     *
     * param item the item to search for
     * return true if the item exists; false otherwise
     */
    public boolean contains(T item) {
        return items.contains(item);
    }

    /**
     * Counts the number of occurrences of an item in the bag
     *
     * param item the item to count
     * return the number of times the item occurs
     */
    public int count(T item) {
        int count = 0;

        // Check every item in the bag.
        for (T currentItem : items) {
            if (currentItem.equals(item)) {
                count++;
            }
        }

        return count;
    }

    
     // Returns a string that's the contents of the bag
    
    @Override
    public String toString() {
        return items.toString();
    }

    
    // Main
     
    public static void main(String[] args) {

        // Create an instance of the Bag class
        Bag<String> bag = new Bag<>();

        // Add several elements, including duplicates
        bag.add("Apple");
        bag.add("Banana");
        bag.add("Apple");
        bag.add("Orange");
        bag.add("Banana");
        bag.add("Apple");

        // Print the original contents
        System.out.println("Bag contents: " + bag);

        // Test contains method
        System.out.println("Contains Apple? " + bag.contains("Apple"));
        System.out.println("Contains Grape? " + bag.contains("Grape"));

        // Test count method
        System.out.println("Number of Apples: " + bag.count("Apple"));
        System.out.println("Number of Bananas: " + bag.count("Banana"));
        System.out.println("Number of Grapes: " + bag.count("Grape"));

        // Remove one Apple
        bag.remove("Apple");

        // Print bag after removing Apple
        System.out.println("\nAfter removing one Apple:");
        System.out.println("Bag contents: " + bag);

        // Test contains after removal
        System.out.println("Contains Apple? " + bag.contains("Apple"));

        // Test count after removal
        System.out.println("Number of Apples: " + bag.count("Apple"));
    }
}
