package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

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