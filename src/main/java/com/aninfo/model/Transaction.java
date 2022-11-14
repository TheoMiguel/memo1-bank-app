package com.aninfo.model;

import javax.persistence.*;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long transactionID;

    private Long cbu;

    private String tipo;

    private Double sum;

    public Transaction(){
    }

    public Transaction(Long ID, Long cbu, String tipo, Double monto) {
        this.transactionID = ID;
        this.cbu = cbu;
        this.tipo = tipo;
        this.sum = monto;
    }

    public Long getID(){
        return transactionID;
    }

    public Long getCbu() {
        return cbu;
    }

    public Double getSum() {
        return sum;
    }

    public String getTipo() {
        return tipo;
    }

//    public void setCbu(Long cbu) {
//        this.cbu = cbu;
//    }
//
//    public Double getBalance() {
//        return balance;
//    }
//
//    public void setBalance(Double balance) {
//        this.balance = balance;
//    }

}
