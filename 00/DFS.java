
public class DFS {

    class Node {

        public String val;
        public Node left;
        public Node right;

        public Node(String val) {

            this.val = val;
        }
    }

    Node root;

    public Node prepare() {
 //                  A
//            B          G
//      C        D          H
//   E     F                  I 

       Node a = new Node("A");
       Node b = new Node("B");
       Node c = new Node("C");
       Node d = new Node("D");
       Node e = new Node("E");
       Node f = new Node("F");
       Node g = new Node("G");
       Node h = new Node("H");
       Node i = new Node("I");

       a.left = b;
       a.right = g;

       b.left = c;
       b.right = d;

       c.left = e;
       c.right = f;

       g.right = h;
       h.right = i;

       return a;
    }

    public void walkPreOrder(Node n) {

        if (n == null )
            return;

        System.out.print(n.val + " ");
        walkPreOrder(n.left);
        walkPreOrder(n.right);

    }

    public void walkInOrder(Node n) {

        if (n == null )
            return;

        walkPreOrder(n.left);
        System.out.print(n.val + " ");
        walkPreOrder(n.right);

    }


    public static void main(String[] args) {


        DFS app = new DFS();
        Node root = app.prepare();

        app.walkPreOrder(root);      
        System.out.println();
        app.walkInOrder(root);      
        System.out.println();

    }


}