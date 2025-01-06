package com.mc4.training.infraestructure.persistence.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
public class Prices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id;
    @Column
    private Short brandId;
    @Column
    private Date startDate;
    @Column
    private Date endDate;
    @Column
    private Integer priceList;
    @Column
    private Short productId;
    @Column
    private Integer priority;
    @Column
    private Double price;
    @Column
    private String curr;

}
