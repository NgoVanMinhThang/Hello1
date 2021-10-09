package Week2;

import edu.princeton.cs.algs4.*;


public class TwoSum {
    public static void checkTwo(int[] a) {
        for (int i = 0; i < a.length-1; i++)
            for (int j = i+1; j < a.length; j++)
                if (a[i] + a[j] == 0) {
                    StdOut.println(a[i] + " " + a[j]);
                }
    }

    public static void main(String []args) {
        In in = new In("C:\\DSA_20020155\\lib\\algs4-data\\1Kints.txt");
        int[] a = in.readAllInts();

        checkTwo(a);
    }
}