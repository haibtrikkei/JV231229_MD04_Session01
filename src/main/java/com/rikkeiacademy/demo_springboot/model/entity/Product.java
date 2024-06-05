package com.rikkeiacademy.demo_springboot.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer proId;
    private String proName;
    private String producer;
    private Integer yearMaking;
    private Double price;
    private String imgUrl;

    @ManyToOne
    @JoinColumn(name = "cateId",referencedColumnName = "cateId")
    private Category cate;
}
