/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Antonio
 */
public class ImportedProduct extends Product{
    Double customsFee;
    public ImportedProduct(){
        super();
    }

    public ImportedProduct(Double customsFee) {
        this.customsFee = customsFee;
    }

    public ImportedProduct(String name, Double price,Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }
    @Override
    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append(name+" $ ");
        sb.append(price+customsFee);
        sb.append(" (Customs fee: $ "+customsFee+")");
        return sb.toString();
    }
    
}
