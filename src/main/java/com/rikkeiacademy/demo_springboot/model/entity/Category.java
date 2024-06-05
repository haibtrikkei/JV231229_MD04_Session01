package com.rikkeiacademy.demo_springboot.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "categories")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cateId;
    @Column(nullable = false,unique = true,length = 100)
    private String cateName;
    private Boolean status;

    @OneToMany(mappedBy = "cate" )
    private List<Product> products;
}
