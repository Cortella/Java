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
public final class ProdutoPerecivel extends Produto{
    
    private String expirationDate;
    private String coolingTemperature;
    
    public ProdutoPerecivel(){
        this.expirationDate = "";
        this.coolingTemperature = "";
    }
    
    public ProdutoPerecivel(String name, double costPrice, double SellPrice, int qtd, 
                            String expirationDate, String coolingTemperature) {
        super(name, costPrice, SellPrice, qtd);
        this.expirationDate = expirationDate;
        this.coolingTemperature = coolingTemperature;
    }

    public String getExpirationDate() {
        return expirationDate;
    }
    
    public String getCoolingTemperature() {
        return coolingTemperature;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }    

    public void setCoolingTemperature(String coolingTemperature) {
        this.coolingTemperature = coolingTemperature;
    }
    
    @Override
    public void printThis(){
        System.out.println("Nome: " + this.name + "\n" +
                           "Preço de custo: "  + this.costPrice + "\n" +
                           "Preço de venda: " + this.sellPrice + "\n" +
                           "Estoque: " + this.stock + "\n" +
                           "Validade: " + this.expirationDate + "\n" +
                           "Temperatura de congelamento: " + this.coolingTemperature + "\n");
    }
    
}

