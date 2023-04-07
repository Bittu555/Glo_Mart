package com.example.inheritance.entity;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "Product")
@Inheritance(strategy= InheritanceType.JOINED)
public class Product {
    @Id
    @GeneratedValue
    private Integer productId;
    private String productName;
    private Double productCost;


}
