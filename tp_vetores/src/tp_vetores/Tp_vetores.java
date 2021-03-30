/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_vetores;


import javax.swing.JOptionPane;


/**
 *
 * @author fabi_fagundes
 */

public class Tp_vetores {
    
    public static final int SIZE = 10;
    /**
     * @param args the command line arguments
     */
    
    static public int getCheaper(double vet[]){
        int cheaperPosition = 0;
        double price = vet[0];
        for(int i=0; i< SIZE ; i++){
            if(vet[i] < price){
                cheaperPosition = i;
                price = vet[i];
            }
        }
        return cheaperPosition;
    }
    
    static double getStockValue(double prices[], int qtd[]){
        double stockValue = 0.0;
        for(int i=0; i < SIZE ; i++){
            stockValue += (prices[i] * qtd[i]);
        }
        return stockValue;
    }
    
    static double getAvarage(double prices[]){
        double sum = 0.0;
        for(int i=0; i < SIZE ; i++){
            sum += prices[i];
        }
        double average = sum/SIZE;
        return average;
    }
    
    static void printAboveAvarege(String name[], double costPrice[], double sellPrice[], int qtd[]){
        double avarege;
        avarege = getAvarage(sellPrice);
        for(int i = 0 ; i < SIZE ; i++){
            if(sellPrice[i] > avarege){
                JOptionPane.showMessageDialog(null, "Produto com preço de venda a cima da média: "+ "\n" +
                "Nome: " + name[i] + "\n" +
                "Preço de custo: R$" + costPrice[i] + "\n" +
                "Preço de venda: R$" + sellPrice[i] + "\n" +
                "Quantidade em estoque: " + qtd[i]
                );
            }
        }
        
    }
    
    
   
    public static void main(String[] args) {
        String name[] = new String[SIZE];
        double costPrice[] = new double[SIZE];
        double sellPrice[] = new double[SIZE];
        int  qtd[] = new int[SIZE];
        
        for(int i=0; i<SIZE; i++){
            name[i] = JOptionPane.showInputDialog("Digite o nome do produto: ");
            String cost = JOptionPane.showInputDialog("Digite o preço de custo do produto em R$: ");
            String sell = JOptionPane.showInputDialog("Digite o preço de venda do produto em R$: ");
            String quantity = JOptionPane.showInputDialog("Digite a quantidade em estoque do produto: ");
            
            costPrice[i] = Double.parseDouble(cost);
            sellPrice[i] = Double.parseDouble(sell);
            qtd[i] = Integer.parseInt(quantity);
        } 
        
        int cheaperPosition;
        cheaperPosition = getCheaper(sellPrice);
        JOptionPane.showMessageDialog(null, "Produto mais barato: \n" +
                "Nome: " + name[cheaperPosition] + "\n" +
                "Preço de custo: R$" + costPrice[cheaperPosition] + "\n" +
                "Preço de venda: R$" + sellPrice[cheaperPosition] + "\n" +
                "Quantidade em estoque: " + qtd[cheaperPosition]
                );
        
        double value;
        value = getStockValue(costPrice, qtd);
        JOptionPane.showMessageDialog(null, "Valor do estoque: R$" + value);
        printAboveAvarege(name, costPrice, sellPrice, qtd);
      
        }
        
        
        
}
    

