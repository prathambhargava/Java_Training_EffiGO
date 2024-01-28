package OOPS;

public class oops {

    public static void main(String[] args) {
         cons nissan = new cons("nissan",1000,2020,"green");
         cons maruti = new cons("Maruti",1200,1920,"black");

         System.out.println("this " + nissan.getMake() +" is worth $ " + nissan.getPrice() +" build in " + nissan.getYear() + ". It is " + nissan.getColor() +".\n");
    }
    
}
