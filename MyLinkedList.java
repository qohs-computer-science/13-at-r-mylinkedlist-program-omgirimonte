public class MyLinkedList
{
    
    // field(s):
    private ListNode head;
    private int size;
        // optional - size field - you must update when size changes

    public MyLinkedList()
    {
        head = null;  // when head = null, the list is empty
        size = 0;
    } // end Constructor
    
    public int size() //– returns the current # of ListNode elements in the LinkedList
    {
        ListNode temp = head;
        while (temp != null)
        {
            temp = temp.getNext();
            size++;
        }// end while
        return size;

    }// end size

    public boolean isEmpty() //– returns true if there are no ListNode elements in the LinkedList
    {
        if (size==0||head==null){
            return true;
        }// end if 
        else{
            return false;
        }// end else
    }// end isEmpty()

    public boolean add(Object obj)// – adds a ListNode element to the end of the LinkedList, always returns true.
    {
       ListNode temp = head;
       if (head!=null){
            while(temp.getNext()!=null){
                    temp = temp.getNext();
            }
        }// end if statement 
        temp.setNext(new ListNode(obj,null));
        return true;
        
    }// end add

    public boolean addFirst(Object obj) //– adds a ListNode element to the beginning of the LinkedList
    {
        head = new ListNode(obj,head);
    }// end addFirst;

    public boolean addLast(Object obj) //– adds a ListNode element to the end of the LinkedList
    {
        ListNode temp = head;
        while(temp.getNext()!=null){
            temp = temp.getNext();
        }
        temp.setNext(new ListNode(obj,null));
        return true;
    }// end addlast

    public Object set(int i, Object obj) //– changes the information stored as the value of the ListNode element at the given position 
    {

    }

    public Object get(int i) //– returns the information stored as the value of the ListNode element at a given position 
    {

    }

    public Object remove(int i) //– removes the ListNode element at the given position leaving the rest of the LinkedList intact
    {

    }

    public Object removeFirst() //– removes the ListNode element at the beginning of the LinkedList and returns the value of the node
    {

    }

    public Object removeLast()//– removes the ListNode element at the end of the LinkedList and returns the value of the node
    {

    }

    public String toString() //– returns a String representation of the LinkedList in the following format:
    {

    }

}
