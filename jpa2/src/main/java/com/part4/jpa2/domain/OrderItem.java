package com.part4.jpa2.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter @Setter
public class OrderItem {
    @Id @GeneratedValue
    private Long id;

    private int price;
    private int quantity;

    private String orderId;
    private Long itemId;
}