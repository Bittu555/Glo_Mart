package com.example.inheritance.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.HashMap;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "Cart")
public class Cart {
    @Id
    @GeneratedValue
    private Integer cartId;
    @OneToMany
    private List<Product> products;
    @JsonIgnore
    private HashMap<Integer, Integer> quantityProduct;
    private int totalCost;
}
