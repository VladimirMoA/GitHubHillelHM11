import java.util.NoSuchElementException;

public class ArrayIterator {

    Object[] array;
    int count;
    int index = -1;

    public boolean hasNext() {
        index++;
        return index < count;
    }

    public Object next() {
        if (index < count) {
            return array[index];
        } else {
            return null;
        }
    }

    public ArrayIterator(Object[] array) {
        this.array = array;
        count = array.length;
    }

    public static void main(String[] args) {
        Object[] array = new Object[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        ArrayIterator arrayIterator = new ArrayIterator(array);
        while (arrayIterator.hasNext() == true) {
            System.out.print(arrayIterator.next() + " ");
        }
    }

}
