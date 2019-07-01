import java.util.ArrayList;

public class MyLists<E> extends ArrayList {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];


    @Override
    public int size() {
        return super.size();
    }

    public MyLists(int size) {
        this.size = size;
    }

    public MyLists() {

    }

    @Override
    public void add(int index, Object element) {
        super.add(index, element);
    }

    @Override
    public Object remove(int index) {
        return super.remove(index);
    }

    @Override
    public Object clone() {
        return super.clone();
    }

    @Override
    public boolean contains(Object o) {
        return super.contains(o);
    }

    @Override
    public int indexOf(Object o) {
        return super.indexOf(o);
    }

    @Override
    public boolean add(Object o) {
        return super.add(o);
    }

    @Override
    public void ensureCapacity(int minCapacity) {
        super.ensureCapacity(minCapacity);
    }

    @Override
    public Object get(int index) {
        return super.get(index);
    }

    @Override
    public void clear() {
        super.clear();
    }
}
