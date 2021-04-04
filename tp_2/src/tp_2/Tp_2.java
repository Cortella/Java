/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author bnmac
 */
public class Tp_2 {

    /**
     * @param args the command line arguments
     */
    public static final int SIZE = 5;
    
    public static void printVet(Produto vet[]){
        for(int i= 0; i< SIZE ; i++){
            vet[i].printThis();
        }
    }
    
    static public int getCheaper(ArrayList<Produto> p){
        int cheaperPosition = 0;
        double price = p.get(0).getSellPrice();
        for(int i=0; i< SIZE ; i++){
            if(p.get(i).getSellPrice() < price){
                cheaperPosition = i;
                price = p.get(i).getSellPrice();
            }
        }
        return cheaperPosition;
    }
    
    static double getStockValue(ArrayList<Produto> p){
        double stockValue = 0.0;
        for(int i=0; i < SIZE ; i++){
            stockValue += (p.get(i).getCostPrice() * p.get(i).getStock());
        }
        return stockValue;
    }
    
    static double getAvarage(ArrayList<Produto> p){
        double sum = 0.0;
        for(int i=0; i < SIZE ; i++){
            sum += p.get(i).getSellPrice();
        }
        double average = sum/SIZE;
        return average;
    }
    
    static void printAboveAvarege(ArrayList<Produto> p){
        double avarege;
        avarege = getAvarage(p);
        for(int i = 0 ; i < SIZE ; i++){
            if(p.get(i).getSellPrice() > avarege){
                System.out.println("Produto com preço de venda a cima da média: \n");
                p.get(i).printThis();
            }
        }    
    }
    
    static void printArray(ArrayList<Produto> p){
        for(int i = 0 ; i< SIZE; i++){
            System.out.println("--------------------------------------------------\n");
            System.out.println("Produto " + i + " :\n");
            p.get(i).printThis();
            System.out.println("--------------------------------------------------\n");
        }
    }
    public static void main(String[] args) {
        
       Scanner str = new Scanner(System.in);
       Scanner d = new Scanner(System.in);
       Scanner in = new Scanner(System.in);
       ArrayList<Produto> list = new ArrayList<Produto>();
        
        for(int i = 0; i< SIZE ; i++){
            ProdutoPerecivel aux = new ProdutoPerecivel();
            System.out.println("Nome:");
            aux.setName(str.nextLine());
            System.out.println("Preço de custo:");
            aux.setCostPrice(d.nextDouble());
            System.out.println("Preço de Venda:");
            aux.setSellPrice(d.nextDouble());
            System.out.println("Quantidade:");
            aux.setStock(in.nextInt());
            System.out.println("Validade:");
            aux.setExpirationDate(str.nextLine());
            System.out.println("Temperatura de resfriamento:");
            aux.setCoolingTemperature(str.nextLine());
            list.add(aux);
            }
        
        printArray(list);
        
        int cheaperPosition = getCheaper(list);
        
        System.out.println("Produto mais Barato: \n");
        list.get(cheaperPosition).printThis();
        
        double stockValue = getStockValue(list);
        System.out.println(" \nValor do Estoque: R$" + stockValue);
        
        printAboveAvarege(list);
        

        
        
    }
    

}