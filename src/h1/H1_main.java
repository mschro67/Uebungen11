//by mschro67

package h1;

public class H1_main {
    public static void main(String[] args){
        Node e = new Node(null);
        Node d = new Node(e);
        Node c = new Node(d);
        Node b = new Node(c);
        Node a = new Node(b);

        System.out.println(distance(b,d));
    }

    public static int distance(Node x,Node y){
        if (x.getId()>y.getId()){
            return x.getId()-y.getId();
        }else {
            return y.getId()-x.getId();
        }
    }
}