package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Security{

    @Id
    @GeneratedValue()
    private Long Id;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private String category;

    @Column(nullable=false)
    private String purchaseDate;

    @Column(nullable=false)
    private double purchasePrice;

    @Column(nullable = false)
    private Long Quantity;

    private Security(Long Id,String name,String category,String purchaseDate,double purchasePrice, Long Quantity){
        this.Id = Id;
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.Quantity=Quantity;
    }

    public Long Id(){
        return Id;
    }

    public void setname(String name){
        this.name=name;
    }

    public String getname(){
        return name;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getCategory(){
        return category;
    }

    public void purchaseDate(String purchaseDate){
        this.purchaseDate = purchaseDate;
    }

    public String getPurchasedate(){
        return purchaseDate;
    }

    public void setPurchasePrice(double purchasePrice){
        this.purchasePrice = purchasePrice;
    }

    public double getPurchasePrice(){
        return purchasePrice;
    }

    public void setQuantity(String Quantity){
        this.Quantity=Quantity;
    }

    public Long getQuantity(){
        return Quantity;
    }
    public Long getQuantity(){
        return Quantity;
    }

}
