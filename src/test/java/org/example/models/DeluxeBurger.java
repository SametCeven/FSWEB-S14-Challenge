package org.example.models;

public class DeluxeBurger extends Hamburger{
    private String cips;
    private String drink;

    public String getCips(){
        return cips;
    }
    public String getDrink(){
        return  drink;
    }

    public DeluxeBurger(){
        this.cips = "CURVY";
        this.drink = "COKE";
    }
    public DeluxeBurger(String name,String meat,double price,String breadRollType){
        super(name,meat,price,breadRollType);
        this.cips = "CURVY";
        this.drink = "COKE";
    }

    @Override
    public void addHamburgerAddition1(String additiona1Name, double addition1Price){
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez");
    }
    @Override
    public void addHamburgerAddition2(String additiona2Name, double addition2Price){
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez");
    }
    @Override
    public void addHamburgerAddition3(String additiona3Name, double addition3Price){
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez");
    }
    @Override
    public void addHamburgerAddition4(String additiona4Name, double addition4Price){
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez");
    }


}
