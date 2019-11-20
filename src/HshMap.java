import java.util.*;

public class HshMap {

    public static Collection noDuplicates(Collection <Object> collection) {

        HashSet<Object> noDup = new HashSet<Object>();
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            noDup.add(iterator.next());
        }
        iterator = noDup.iterator();
        collection.clear();
        while (iterator.hasNext()) {
            collection.add(iterator.next());
        }
        return collection;
    }

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        noDuplicates(arrayList);
        iterator = arrayList.iterator();
        System.out.println();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
