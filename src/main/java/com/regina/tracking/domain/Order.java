package com.regina.tracking.domain;

public class Order {
    private Long id;                 // internal order id
    private Integer displayNumber;   // number of orders
    private String trackingCode;     // tracking number
    private String imageUrl;         // screenshot or photo of the order
    private OrderStatus status;      // current order status
    private Box box;                 // box where the order is placed (can be null)

    public Order(String imageUrl) {
        this.imageUrl = imageUrl;
        this.status = OrderStatus.CREATED;
    }

    public Integer getDisplayNumber() {
        return displayNumber;
    }

    public String getTrackingCode() {
        return trackingCode;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public Box getBox() {
        return box;
    }

    public void moveToWarehouse() {
        this.status = OrderStatus.AT_WAREHOUSE;
    }

    public void putInBox(Box box) {
        this.box = box;
        this.status = OrderStatus.IN_BOX;
    }

    public void archive() {
        this.status = OrderStatus.ARCHIVED;
    }

    public void assignTrackingCode(String trackingCode) {
        this.trackingCode = trackingCode;
    }

}
