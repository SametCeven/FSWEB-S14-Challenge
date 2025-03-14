package org.example.models;

public class Hamburger {
    private String name;
    private String meat;
    private double price = 19.10;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
    }
    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
    }
    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
    }
    public void addHamburgerAddition4(String addition4Name, double addition4Price){
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }
    public double itemizeHamburger(){
        System.out.println("Name: " + name);
        System.out.println("Meat: " + meat);
        System.out.println("BreadRollType: " + breadRollType);
        System.out.println("Addition1:" + addition1Name);
        System.out.println("Addition2:" + addition2Name);
        System.out.println("Addition3:" + addition3Name);
        System.out.println("Addition4:" + addition4Name);
        setPrice(price + addition1Price + addition2Price + addition3Price + addition4Price);
        System.out.println("Price: " + price);
        return price;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setMeat(String meat){
        this.meat = meat;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setBreadRollType(String breadRollType){
        this.breadRollType = breadRollType;
    }

    public String getName(){
        return this.name;
    }
    public String getMeat(){
        return this.meat;
    }
    public double getPrice(){
        return this.price;
    }
    public String getBreadRollType(){
        return this.breadRollType;
    }
    public double getAddition1Price(){
        return this.addition1Price;
    }
    public double getAddition2Price(){
        return this.addition2Price;
    }
    public double getAddition3Price(){
        return this.addition3Price;
    }
    public double getAddition4Price(){
        return this.addition4Price;
    }

    public Hamburger(){

    }
    public Hamburger(String name,double price,String breadRollType){
        this.name = name;
        this.price = price;
        this.breadRollType = breadRollType;
    }
    public Hamburger(String name,String meat,double price,String breadRollType){
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

}
