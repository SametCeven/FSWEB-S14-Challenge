package org.example.models;

public class HealthyBurger extends Hamburger{
    private String healtyExtra1Name;
    private double healtyExtra1Price;
    private String healtyExtra2Name;
    private double healtyExtra2Price;

    public HealthyBurger(String name,double price,String breadRollType){
        super(name,price,breadRollType);
        setMeat("Tofu");
    }

    public void addHealthyAddition1(String healtyExtra1Name, double healtyExtra1Price){
        this.healtyExtra1Name = healtyExtra1Name;
        this.healtyExtra1Price = healtyExtra1Price;
    }

    public void addHealthyAddition2(String healtyExtra2Name, double healtyExtra2Price){
        this.healtyExtra2Name = healtyExtra2Name;
        this.healtyExtra2Price = healtyExtra2Price;
    }

    @Override
    public double itemizeHamburger(){
        System.out.println("Name: " + getName());
        System.out.println("Meat: " + getMeat());
        System.out.println("BreadRollType: " + getBreadRollType());
        System.out.println("Addition1: " + healtyExtra1Name);
        System.out.println("Addition2: " + healtyExtra2Name);
        setPrice(getPrice()+healtyExtra1Price+healtyExtra2Price);
        System.out.println("Price: " + getPrice());
        return getPrice();

    }

}
