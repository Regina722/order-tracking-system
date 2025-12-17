package com.regina.tracking.domain;

import java.util.ArrayList;
import java.util.List;

public class Box {

    private Long id;                // internal box id
    private Integer displayNumber;  // numbers of boxes
    private String trackingCode;    // box tracking number
    private BoxStatus status;       // current box status
    private List<Order> orders;     // orders inside this box

    public Box(String trackingCode) {
        this.trackingCode = trackingCode;
        this.status = BoxStatus.CREATED;
        this.orders = new ArrayList<>();
    }

    public BoxStatus getStatus() {
        return status;
    }

    public Integer getDisplayNumber() {
        return displayNumber;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void ship() {
        this.status = BoxStatus.SHIPPED;
    }

    public void deliver() {
        this.status = BoxStatus.DELIVERED;
    }



}
