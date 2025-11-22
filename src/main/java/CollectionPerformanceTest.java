import java.util.*;

public class CollectionPerformanceTest {

    public static void main(String[] args) {

        int operations = 100000;
        System.out.println("Number of operations: " + operations + "\n");

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long start = System.nanoTime();
        for (int i = 0; i < operations; i++) arrayList.add(i);
        long end = System.nanoTime();
        long arrayAddTime = end - start;

        start = System.nanoTime();
        for (int i = 0; i < operations; i++) linkedList.add(i);
        end = System.nanoTime();
        long linkedAddTime = end - start;

        start = System.nanoTime();
        for (int i = 0; i < operations; i++) arrayList.get(i);
        end = System.nanoTime();
        long arrayGetTime = end - start;

        start = System.nanoTime();
        for (int i = 0; i < operations; i++) linkedList.get(i);
        end = System.nanoTime();
        long linkedGetTime = end - start;

        start = System.nanoTime();
        for (int i = operations - 1; i >= 0; i--) arrayList.remove(i);
        end = System.nanoTime();
        long arrayRemoveTime = end - start;

        start = System.nanoTime();
        for (int i = operations - 1; i >= 0; i--) linkedList.remove(i);
        end = System.nanoTime();
        long linkedRemoveTime = end - start;

        System.out.printf("%-10s %-12s %-12s %-12s%n", "Method", "ArrayList(ns)", "LinkedList(ns)", "Operations");
        System.out.printf("%-10s %-12d %-12d %-12d%n", "add", arrayAddTime, linkedAddTime, operations);
        System.out.printf("%-10s %-12d %-12d %-12d%n", "get", arrayGetTime, linkedGetTime, operations);
        System.out.printf("%-10s %-12d %-12d %-12d%n", "remove", arrayRemoveTime, linkedRemoveTime, operations);
    }
}