package Week2;

import edu.princeton.cs.algs4.*;

public class UFClient2 {
    public static void main(String[] args) {
        In in = new In(args[0]);
        int a[] = in.readAllInts();
        int l = a.length-1;
        UF uf = new UF(a[0]);

        for(int i = 1; i <= l ; i+=2){
            uf.union(a[i],a[i+1]);
            if(uf.count() == 1){
                StdOut.println((i + 1)/2);
                break;
            }
        }
        if(uf.count() != 1)
            StdOut.println("FAILED");
    }
}