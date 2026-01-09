//by mschro67

package h1;

public class Node{
    private Node next;
    private int id;

    public Node(Node next){
        this.next=next;
        if (next==null){
            this.id=0;
        }else{
            this.id=next.id+1;
        }
    }

    public int getId(){
        return this.id;
    }
    public Node getNext(){
        return this.next;
    }
}