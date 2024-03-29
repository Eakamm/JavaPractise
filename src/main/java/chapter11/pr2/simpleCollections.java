package chapter11.pr2;

import java.util.*;

public class simpleCollections {
    public static void main(String[] args) {
        Collection<Integer> c = new HashSet<Integer>();
        for(int i = 0; i < 10; i++)
            c.add(i); // Autoboxing
        for(Integer i : c)
            System.out.print(i + ", ");
    }
} /* Output:
0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
*///:~
