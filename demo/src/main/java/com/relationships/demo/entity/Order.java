package com.relationships.demo.entity;

import java.time.LocalDate;

public class Order {

    private Long id;
    private String number;
    private LocalDate createdAt;
    private LocalDate gotAt;
    private Double total;

    //Constructor

    public Order() {
    }

    public Order(Long id, String number, LocalDate createdAt, LocalDate gotAt, Double total) {
        this.id = id;
        this.number = number;
        this.createdAt = createdAt;
        this.gotAt = gotAt;
        this.total = total;
    }
//Getters ans Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getGotAt() {
        return gotAt;
    }

    public void setGotAt(LocalDate gotAt) {
        this.gotAt = gotAt;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    //To String


    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", createdAt=" + createdAt +
                ", gotAt=" + gotAt +
                ", total=" + total +
                '}';
    }
}
