package features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class JavaForEachExample {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        for (int i=1; i<10; i++) myList.add(i);

        Iterator<Integer> it = myList.iterator();
        while(it.hasNext()) {
            Integer i = it.next();
            System.out.println(i);

        }

        myList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("forEach anonymous class Value: " +integer);
            }
        });

        MyConsumer myconsumer = new MyConsumer();
        myList.forEach(myconsumer);
    }
}
