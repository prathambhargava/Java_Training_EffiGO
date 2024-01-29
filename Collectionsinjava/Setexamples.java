package Collectionsinjava;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Setexamples {
    public static void main(String[] args) {
        Integer[] A = {10,20,30,40,50,60};
        Integer[] B = {20,33,40,13,20,42};
        Set<Integer> Set1 = new HashSet<Integer>();
        Set1.addAll(Arrays.asList(A));

        Set<Integer> Set2 = new HashSet<Integer>();
        Set2.addAll(Arrays.asList(B));

        Set<Integer> Uniondata = new HashSet<Integer>(Set1);
        Uniondata.addAll(Set2);
        System.out.println(Uniondata);

        Set<String> data = new LinkedHashSet<String>();
        data.add("Amazon");
        data.add("Myntra");
        data.add("Flipkart");
        data.add("Google");
        data.add("MSOffice");

        System.out.println(data);
    }
    
}
