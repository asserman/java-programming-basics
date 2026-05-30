package org.javaguru.student_asserman.lesson_1.lessoncode.Sale;

public class SaleApp   {
    public static void main(String[] args) {
        Sale socks = new Sale("Socks",120, 500);
        Sale shirts= new Sale("Shirts",300, 200);
        Sale boots = new Sale("Boots",500, 250);
        Sale waist = new Sale("Waist",500, 700);

        Sale[] arraySale = {socks,shirts,boots,waist};
        int maxSaleCount = arraySale[0].getUntiCount();
        double maxSaleMoney = arraySale[0].getUntiCount() * arraySale[0].getPricePerUnit();
        String nameSaleCount = arraySale[0].getProduct();
        String nameSaleMoney = arraySale[0].getProduct();


    }
}
