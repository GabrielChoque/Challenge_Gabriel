package com.mc4.training.domain.model;

import lombok.Data;

import java.util.Date;

@Data
public class PricesModel {
    private Short id;
    private Short brandId;
    private Date startDate;
    private Date endDate;
    private Integer priceList;
    private Short productId;
    private Integer priority;
    private Double price;
    private String curr;
}
