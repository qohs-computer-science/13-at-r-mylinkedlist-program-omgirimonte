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
    
    public int size(){ //– returns the current # of ListNode elements in the LinkedList

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
       if (size==0){
            head = new ListNode(obj,null);
        }// end if statement
        else{
            while(temp.getNext()!=null){
                temp = temp.getNext();
            }
            temp.setNext(new ListNode(obj,null));
        }// end else
        size++;
        return true;
        
    }// end add

    public boolean addFirst(Object obj) //– adds a ListNode element to the beginning of the LinkedList
    {
        head = new ListNode(obj,head);
        size++;
        return true;
    }// end addFirst;

    public boolean addLast(Object obj) //– adds a ListNode element to the end of the LinkedList
    {
        add(obj);
        return true;
    }// end addlast

    public Object set(int i, Object obj) //– changes the information stored as the value of the ListNode element at the given position 
    {
        ListNode temp = head;
        if (i<0 || size>size()){
            throw new IndexOutOfBoundsException();
        }
        for (int x = 0; x<i; x++){
            temp= temp.getNext();
        }
        Object retVal = temp.getValue();
        temp.setValue(obj);
        return retVal;
    }

    public Object get(int i) //– returns the information stored as the value of the ListNode element at a given position 
    {
        if (i<0 || i>=size()){
            throw new IndexOutOfBoundsException();
        }
        ListNode temp = head;
        int number = 0;
        Object back = null;
        while (temp != null)
        {
            if (number==i){
                back = temp.getValue();
                break;
            }// end if
            number++;
            temp = temp.getNext();
        }// end while
        return back;
    }

    public Object remove(int i) //– removes the ListNode element at the given position leaving the rest of the LinkedList intact
    {
        if (i<0 || i>=size()){
            throw new IndexOutOfBoundsException();
        }// end if 
        else{
            ListNode temp = head;
            for (int x = 0; x<i-1;x++){
                temp=temp.getNext();
            }
            ListNode altTemp = temp.getNext();
            Object ret = altTemp.getValue();
            altTemp.setNext(null);
            size--;
            return ret;
        }
    }

    public Object removeFirst() //– removes the ListNode element at the beginning of the LinkedList and returns the value of the node
    {
        ListNode temp = head;
        Object val = new Object();
        val = head.getValue();
        temp = temp.getNext();
        size--;
        return val;
        
    }

    public Object removeLast()//– removes the ListNode element at the end of the LinkedList and returns the value of the node
    {
        if(size==0){
            return null;
        }
        ListNode temp = head;
        while (temp.getNext().getNext() != null){
            temp = temp.getNext();
        }// end loop
        Object out = temp.getNext().getValue();
        temp.setNext(null);
        size--;
        return out;
        

    }

    public String toString() //– returns a String representation of the LinkedList in the following format:
    {
        ListNode temp = head;
        int tempCount = 1;
        String out = "";
        while (temp != null)
        {
            
            out = out+tempCount+": "+temp.getValue()+"\n";
            temp = temp.getNext();
            tempCount++;
        }// end loop
        return out;
    }// end toString

}
