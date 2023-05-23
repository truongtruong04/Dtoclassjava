package Sinhvien;

public class MainClass {
   public static void main(String[] args) {
Sinhvien md = new Sinhvien( 31,1,2022);
        System.out.println("Day ="+md.getDay());
        md.setDay(3);
        System.out.println("Day ="+md.getDay());
        md.setDay(30);
       System.out.println("Day ="+md.getDay());
       md.setDay(30);
       System.out.println("Month ="+md.getMonth());
       md.setMoth(1);
       System.out.println("Month ="+md.getMonth());
       md.setMoth(2);
       System.out.println("Month ="+md.getMonth());

       System.out.println("Year ="+md.getYear());
       md.setYear(1);

   }
}