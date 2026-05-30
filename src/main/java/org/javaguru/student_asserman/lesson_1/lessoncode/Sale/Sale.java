package org.javaguru.student_asserman.lesson_1.lessoncode.Sale;

public class Sale {
    private String product;
    private double pricePerUnit;
    private int untiCount;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public int getUntiCount() {
        return untiCount;
    }

    public void setUntiCount(int untiCount) {
        this.untiCount = untiCount;
    }

    public Sale(String product, float pricePerUnit, int untiCount) {
        this.product = product;
        this.pricePerUnit = pricePerUnit;
        this.untiCount = untiCount;
    }
}
