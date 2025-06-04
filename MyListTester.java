//Yahia Abouelnasr 40297607

package comp352_A2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;

public class MyListTester {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("testrun.txt");
        int[] testSizes = {10, 100, 1000, 10000, 100000, 1000000};
        Random r = new Random();

        for (int N : testSizes) {
            MyArrayList<Integer> myArrayList = new MyArrayList<>();
            MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
            ArrayList<Integer> arrayList = new ArrayList<>();
            LinkedList<Integer> linkedList = new LinkedList<>();
            
            
    


            // Insert at Start
            fw.write("INSERT At START Timings: \n");
            fw.write("============================================= \n");
            long start = System.nanoTime();
            for (int i = 0; i < N; i++) myArrayList.add(0, r.nextInt(2 * N));
            long end = System.nanoTime();
            fw.write("N= " + N + " MyArrayList: " + (end - start) + " ns\n");

            start = System.nanoTime();
            for (int i = 0; i < N; i++) myLinkedList.add(0, r.nextInt(2 * N));
            end = System.nanoTime();
            fw.write("N= " + N + " MyLinkedList: "+ (end - start) + " ns\n");

            start = System.nanoTime();
            for (int i = 0; i < N; i++) arrayList.add(0, r.nextInt(2 * N));
            end = System.nanoTime();
            fw.write("N= " + N + " ArrayList: " + (end - start) + " ns\n");

            start = System.nanoTime();
            for (int i = 0; i < N; i++) linkedList.add(0, r.nextInt(2 * N));
            end = System.nanoTime();
            fw.write("N= " + N + " LinkedList: " + (end - start) + " ns\n");
            fw.write("============================================= \n");


            // Insert at End
            fw.write("INSERT At END Timings: \n");
            fw.write("============================================= \n");
            start = System.nanoTime();
            for (int i = 0; i < N; i++) myArrayList.add(r.nextInt(2 * N));
            end = System.nanoTime();
            fw.write("N= " + N + " MyArrayList: " + (end - start) + " ns\n");

            start = System.nanoTime();
            for (int i = 0; i < N; i++) myLinkedList.add(r.nextInt(2 * N));
            end = System.nanoTime();
            fw.write("N= " + N + " MyLinkedList: " + (end - start) + " ns\n");

            start = System.nanoTime();
            for (int i = 0; i < N; i++) arrayList.add(r.nextInt(2 * N));
            end = System.nanoTime();
            fw.write("N= " + N + " ArrayList: " + (end - start) + " ns\n");

            start = System.nanoTime();
            for (int i = 0; i < N; i++) linkedList.add(r.nextInt(2 * N));
            end = System.nanoTime();
            fw.write("N= " + N + " LinkedList: " + (end - start) + " ns\n");
            fw.write("============================================= \n");

            
            // Insert at Random
            fw.write("INSERT At RANDOM Timings: \n");
            fw.write("============================================= \n");
            start = System.nanoTime();
            for (int i = 0; i < N; i++) myArrayList.add(r.nextInt(myArrayList.size() + 1), r.nextInt(2 * N));
            end = System.nanoTime();
            fw.write("N= " + N + " MyArrayList: " + (end - start) + " ns\n");

            start = System.nanoTime();
            for (int i = 0; i < N; i++) myLinkedList.add(r.nextInt(myLinkedList.size() + 1), r.nextInt(2 * N));
            end = System.nanoTime();
            fw.write("N= " + N + " MyLinkedList: " + (end - start) + " ns\n");

            start = System.nanoTime();
            for (int i = 0; i < N; i++) arrayList.add(r.nextInt(arrayList.size() + 1), r.nextInt(2 * N));
            end = System.nanoTime();
            fw.write("N= " + N + " ArrayList: " + (end - start) + " ns\n");

            start = System.nanoTime();
            for (int i = 0; i < N; i++) linkedList.add(r.nextInt(linkedList.size() + 1), r.nextInt(2 * N));
            end = System.nanoTime();
            fw.write("N= " + N + " LinkedList: " + (end - start) + " ns\n");
            fw.write("============================================= \n");
            

            // Remove from Start
            fw.write("REMOVE At START Timings: \n");
            fw.write("============================================= \n");
            start = System.nanoTime();
            for (int i = 0; i < N; i++) myArrayList.remove(0);
            end = System.nanoTime();
            fw.write("N= " + N + " MyArrayList: " + (end - start) + " ns\n");

            start = System.nanoTime();
            for (int i = 0; i < N; i++) myLinkedList.remove(0);
            end = System.nanoTime();
            fw.write("N= " + N + " MyLinkedList: " + (end - start) + " ns\n");

            start = System.nanoTime();
            for (int i = 0; i < N; i++) arrayList.remove(0);
            end = System.nanoTime();
            fw.write("N= " + N + " ArrayList: " + (end - start) + " ns\n");

            start = System.nanoTime();
            for (int i = 0; i < N; i++) linkedList.remove(0);
            end = System.nanoTime();
            fw.write("N= " + N + " LinkedList: " + (end - start) + " ns\n");
            fw.write("============================================= \n");


            // Remove from End
            fw.write("REMOVE At END Timings: \n");
            fw.write("============================================= \n");
            start = System.nanoTime();
            for (int i = 0; i < N; i++) myArrayList.remove(myArrayList.size() - 1);
            end = System.nanoTime();
            fw.write("N= " + N + " MyArrayList: " + (end - start) + " ns\n");

            start = System.nanoTime();
            for (int i = 0; i < N; i++) myLinkedList.remove(myLinkedList.size() - 1);
            end = System.nanoTime();
            fw.write("N= " + N + " MyLinkedList: " + (end - start) + " ns\n");

            start = System.nanoTime();
            for (int i = 0; i < N; i++) arrayList.remove(arrayList.size() - 1);
            end = System.nanoTime();
            fw.write("N= " + N + " ArrayList: " + (end - start) + " ns\n");

            start = System.nanoTime();
            for (int i = 0; i < N; i++) linkedList.remove(linkedList.size() - 1);
            end = System.nanoTime();
            fw.write("N= " + N + " LinkedList: " + (end - start) + " ns\n");
            fw.write("============================================= \n");


            // Remove by Value
            fw.write("REMOVE by VALUE Timings: \n");
            fw.write("============================================= \n");
            start = System.nanoTime();
            for (int i = 0; i < N; i++) myArrayList.remove((Integer) r.nextInt(2 * N));
            end = System.nanoTime();
            fw.write("N= " + N + " MyArrayList: " + (end - start) + " ns\n");

            start = System.nanoTime();
            for (int i = 0; i < N; i++) myLinkedList.remove((Integer) r.nextInt(2 * N));
            end = System.nanoTime();
            fw.write("N= " + N + " MyLinkedList: " + (end - start) + " ns\n");

            start = System.nanoTime();
            for (int i = 0; i < N; i++) arrayList.remove((Integer) r.nextInt(2 * N));
            end = System.nanoTime();
            fw.write("N= " + N + " ArrayList: " + (end - start) + " ns\n");

            start = System.nanoTime();
            for (int i = 0; i < N; i++) linkedList.remove((Integer) r.nextInt(2 * N));
            end = System.nanoTime();
            fw.write("N= " + N + " LinkedList: " + (end - start) + " ns\n");
            fw.write("============================================= \n");

            
            // Remove at Random
         // Remove at Random
            fw.write("REMOVE At RANDOM Timings:\n");
            fw.write("=============================================\n");

            if (myArrayList.size() > 0) {
                start = System.nanoTime();
                for (int i = 0; i < N; i++) {
                    if (myArrayList.size() > 0) myArrayList.remove(r.nextInt(myArrayList.size()));
                }
                end = System.nanoTime();
                fw.write("N= " + N + " MyArrayList: " + (end - start) + " ns\n");
            }

            if (myLinkedList.size() > 0) {
                start = System.nanoTime();
                for (int i = 0; i < N; i++) {
                    if (myLinkedList.size() > 0) myLinkedList.remove(r.nextInt(myLinkedList.size()));
                }
                end = System.nanoTime();
                fw.write("N= " + N + " MyLinkedList: " + (end - start) + " ns\n");
            }

            if (arrayList.size() > 0) {
                start = System.nanoTime();
                for (int i = 0; i < N; i++) {
                    if (arrayList.size() > 0) arrayList.remove(r.nextInt(arrayList.size()));
                }
                end = System.nanoTime();
                fw.write("N= " + N + " ArrayList: " + (end - start) + " ns\n");
            }

            if (linkedList.size() > 0) {
                start = System.nanoTime();
                for (int i = 0; i < N; i++) {
                    if (linkedList.size() > 0) linkedList.remove(r.nextInt(linkedList.size()));
                }
                end = System.nanoTime();
                fw.write("N= " + N + " LinkedList: " + (end - start) + " ns\n");
            }

            fw.write("=============================================\n");
        }

        fw.close();

        File file = new File("testrun.txt");
        if (file.exists()) {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } else {
            System.out.println("Error finding file");
        }
        
    }
}
