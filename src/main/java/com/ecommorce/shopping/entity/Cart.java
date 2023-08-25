package com.ecommorce.shopping.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Where;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CartId;
    @Column(name="image")
    private String image;
    @Column(name="tittle")
    private String tittle;
    @Column(name="description")
    private String description;
    @Column(name="price")
    private float price;
}
