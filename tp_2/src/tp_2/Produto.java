/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_2;

/**
 *
 * @author bnmac
 */
public class Produto {
    protected String name;
    protected double costPrice;
    protected double sellPrice;
    protected int stock;
    
    public Produto(){
        this.name = "";
        this.costPrice = 0;
        this.sellPrice = 0;
        this.stock = 0;
    }
    
    public Produto(String name, double costPrice, double sellPrice, int stock){
        this.name = name;
        this.costPrice = costPrice;
        this.sellPrice = sellPrice;
        this.stock = stock;
    }
    
    public String getName(){
        return this.name;
    }

    public double getCostPrice(){
        return this.costPrice;
    }
    
    
    public double getSellPrice(){
        return this.sellPrice;
    }
    
    public int getStock(){
        return this.stock;
    }
    
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setCostPrice(double price){
        this.costPrice = price;
    }
    
    public void setSellPrice(double price){
        this.sellPrice = price;
    }
    
    public void setStock(int stock){
        this.stock = stock;
    }
    
    
    public void printThis(){
        System.out.println("Nome: " + this.name + "\n" +
                           "Preço de custo: "  + this.costPrice + "\n" +
                           "Preço de venda: " + this.sellPrice + "\n" +
                           "Estoque: " + this.stock);
    }
}
