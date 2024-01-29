package Collectionsinjava;

public class Equals_hashcode {
    public static void main(String[] args) {
        String a  = "EffiGO";
        String b = "EffiGO";

        if(a.equals(b)){
            System.out.println("equals" + a.hashCode()+" & " +b.hashCode());
        }

        String c = "Piyush";
        String d = "Pratham";

        if(!c.equals(d)){
            System.out.println("notequals " + c.hashCode() + " & " + d.hashCode());
        }
    }
}
