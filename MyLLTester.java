public class MyLLTester
{
  public static void main(String [] args)
  {
     // Create an instance of MyLinkedList
     MyLinkedList myList = new MyLinkedList();
        
     // Add 10 Objects using different add methods
     myList.add("Hello");
     myList.addFirst("First Element");
     myList.add("World");
     myList.add("!");
     myList.addLast("Last Element");
     myList.add(123);
     myList.addFirst("New First");
     myList.add("Middle Element");
     myList.add(3.14);
     myList.addLast("Goodbye");

     // Display the list after initial creation
     System.out.println("List after initial creation:");
     System.out.println(myList.toString());

     // Use set to change value of at least 1 element
     System.out.println("Setting element at position 3 to 'Changed Element'.");
     myList.set(3, "Changed Element");
     
     // Display the list after using set
     System.out.println("List after setting a new value:");
     System.out.println(myList.toString());

     // Use get to retrieve value at a specific position
     System.out.println("Getting element at position 3:");
     System.out.println("Element at position 3: " + myList.get(3));

     // Remove elements using different remove methods
     System.out.println("Removing first element:");
     System.out.println("Removed: " + myList.removeFirst());
     System.out.println("List after removing the first element:");
     System.out.println(myList.toString());

     System.out.println("Removing last element:");
     System.out.println("Removed: " + myList.removeLast());
     System.out.println("List after removing the last element:");
     System.out.println(myList.toString());

     System.out.println("Removing element at position 2:");
     System.out.println("Removed: " + myList.remove(2));
     System.out.println("List after removing element at position 2:");
     System.out.println(myList.toString());

     // Calling miscellaneous methods and output results
     System.out.println("List size:");
     System.out.println("Size: " + myList.size());

     System.out.println("Is the list empty?");
     System.out.println("isEmpty: " + myList.isEmpty());

     // Testing all available methods
     System.out.println("Testing add methods:");
     myList.add("Added Element");
     System.out.println("List after adding 'Added Element' at the end:");
     System.out.println(myList.toString());

     myList.addFirst("Added First");
     System.out.println("List after adding 'Added First' at the beginning:");
     System.out.println(myList.toString());

     myList.addLast("Added Last");
     System.out.println("List after adding 'Added Last' at the end:");
     System.out.println(myList.toString());

     System.out.println("Setting element at position 1 to 'Set Element'.");
     myList.set(1, "Set Element");
     System.out.println("List after setting position 1:");
     System.out.println(myList.toString());

     System.out.println("Getting element at position 1:");
     System.out.println("Element at position 1: " + myList.get(1));

     System.out.println("Removing first element again:");
     System.out.println("Removed: " + myList.removeFirst());
     System.out.println("List after another first element removal:");
     System.out.println(myList.toString());

     System.out.println("Removing last element again:");
     System.out.println("Removed: " + myList.removeLast());
     System.out.println("List after another last element removal:");
     System.out.println(myList.toString());

     System.out.println("Removing element at position 0:");
     System.out.println("Removed: " + myList.remove(0));
     System.out.println("List after removing element at position 0:");
     System.out.println(myList.toString());

  } // end main
  
} // end class
