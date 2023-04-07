package com.example.inheritance.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name ="book")
public class Book extends Product{
    private String bookName;
}
