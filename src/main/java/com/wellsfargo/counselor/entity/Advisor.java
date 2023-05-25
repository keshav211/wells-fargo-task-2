package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Advisor {

    @Id
    @GeneratedValue()
    private long advisorId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String email;

    @column(nullable= false)
    private String Adetails;

    protected Advisor() {

    }

    public Advisor(String firstName, String lastName, String email, String Adetails) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Adetails = Adetails;
        this.email = email;
    }

    public Long getAdvisorId() {
        return advisorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getdetail() {
        return Adetails;
    }

    public void setAdetails(String Adetails) {
        this.Adetails = Adetails;
    }
}

@Entity
public class Client{

    @Id
    @GeneratedValue()
    private Long client_id;

    @Column(nullable=false)
    private String Cdetail;

    @Column(nullable=false)
    private String name;

    @Column(nullable=false)
    private String email_id;

    @Column(nullable=false)
    private Long advisorId;

    @Id
    @GeneratedValue()
    private Long portfolioId;

    protected Client( Long client_id,String contact_information,String name,String email_id,Long advisorId,Long PortfolioId){
        this.client_id = client_id;
        this.contact_information = contact_information;
        this.name = name;
        this.email_id = email_id;
    }

    public Long getclientId(){
        return client_id;
    }

    public void setcontactinfo(String Cdetail){
        this.Cdetail=Cdetail;
    }

    public String getcontactinfo(){
        return Cdetail;
    }

    public void setname(String name){
        this.name = name;
    }

    public String getname(){
        return name;
    }

    public void setemail(String email_id){
        this.email_id = email_id;
    }

    public String getemail(){
        return email_id;
    }
}

@Entity
public class Portfolio{

    @Id
    @GeneratedValue()
    private Long PortfolioId;

    @Column(nullable=false)
    private Long advisorId;

    @Column(nullable=false)
    private Long Client_id;

    public Long getPortfolioId(){
        return PortfolioId;
    }

}

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
