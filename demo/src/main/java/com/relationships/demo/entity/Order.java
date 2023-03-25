package com.relationships.demo.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "orders")

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(nullable = false)

    private String number;

    private LocalDate createdAt;
    private LocalDate gotAt;
    private Double total;


    /*
    nos crea un campo user_id en esta tabla
    de manera automatica
     */
    @ManyToOne
    private User user;

    /*
   lo mapeamos al campo order de la tabla OrderDetail
   en donde está definida la relación
   con esta tabla
   nos crea un campo detail_id en esta tabla
    de manera automatica
    */
  @OneToMany(mappedBy = "order")
  private List<OrderDetail> details;

    //Constructor

    public Order() {
    }

    public Order(Long id, String number, LocalDate createdAt, LocalDate gotAt, Double total, User user, List<OrderDetail> details) {
        this.id = id;
        this.number = number;
        this.createdAt = createdAt;
        this.gotAt = gotAt;
        this.total = total;
        this.user = user;
        this.details = details;
    }

    //Getters ans Setters

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<OrderDetail> getDetails() {
        return details;
    }

    public void setDetails(List<OrderDetail> details) {
        this.details = details;
    }

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
