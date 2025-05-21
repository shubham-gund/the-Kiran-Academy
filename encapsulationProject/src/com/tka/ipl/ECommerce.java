package com.tka.ipl;

public class ECommerce {
    private String platformName;
    private int totalSellers;
    private int totalProducts;
    private double monthlyRevenue;

    public ECommerce() {
        // Default constructor
    }

    public ECommerce(String platformName, int totalSellers, int totalProducts, double monthlyRevenue) {
        this.platformName = platformName;
        this.totalSellers = totalSellers;
        this.totalProducts = totalProducts;
        this.monthlyRevenue = monthlyRevenue;
    }

    public String getPlatformName() {
        return platformName;
    }
    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }
    public int getTotalSellers() {
        return totalSellers;
    }
    public void setTotalSellers(int totalSellers) {
        this.totalSellers = totalSellers;
    }
    public int getTotalProducts() {
        return totalProducts;
    }
    public void setTotalProducts(int totalProducts) {
        this.totalProducts = totalProducts;
    }
    public double getMonthlyRevenue() {
        return monthlyRevenue;
    }
    public void setMonthlyRevenue(double monthlyRevenue) {
        this.monthlyRevenue = monthlyRevenue;
    }

    @Override
    public String toString() {
        return "ECommerce{platformName='" + platformName + "', totalSellers=" + totalSellers + ", totalProducts=" + totalProducts + ", monthlyRevenue=" + monthlyRevenue + "}";
    }
}

