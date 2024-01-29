package Collectionsinjava;

import java.util.Scanner;

public class HashCode {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        Integer i = readInput.nextInt();
        readInput.close();

        int hashValue = Integer.hashCode(i);
        System.out.println("Hash Code Value for object is : " + hashValue);
    }
    
}
