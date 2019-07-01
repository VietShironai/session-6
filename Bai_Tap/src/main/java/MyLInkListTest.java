public class MyLInkListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkList ll = new MyLinkList();
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.addFirst(15);

        ll.add(4, 9);
        System.out.println(ll.getLast());
        System.out.println(ll.remove(2));
        System.out.println(ll);
        }

    
}
