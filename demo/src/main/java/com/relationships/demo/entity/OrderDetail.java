package com.relationships.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "order_details")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(nullable = false)

    private String name;
    @Column(nullable = false)

    private Double quantity;

    private Double price;
    private Double total;

    /*
    nos crea un campo product_id en esta tabla
    de manera automatica
     */
    @ManyToOne
    private Product product;

    /*
    lo mapeamos al campo order de la tabla OrderDetail
   en donde está definida la relación
   con esta tabla
    nos crea un campo order_id en esta tabla
    de manera automatica
     */
    @ManyToOne
    private Order order;
    //Constructors

    public OrderDetail() {
    }

    public OrderDetail(Long id, String name, Double quantity, Double price, Double total, Product product, Order order) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
        this.product = product;
        this.order = order;
    }
//Getters and Setters

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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
        return "OrderDetail{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", total=" + total +
                '}';
    }
}
