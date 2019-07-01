import java.lang.reflect.Type;
import java.util.Iterator;

public class MyListTest {
    public static void main(String[] args) {
        MyLists<Integer> listInteger = new MyLists<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.remove(2);
        listInteger.size();
        System.out.println(listInteger);
        for (int i=0;i<listInteger.size();i++){
            System.out.println(listInteger.get(i));
        }

    }
}
