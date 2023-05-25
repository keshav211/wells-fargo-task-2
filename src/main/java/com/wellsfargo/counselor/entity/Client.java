package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

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