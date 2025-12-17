package com.regina.tracking.domain;

public enum OrderStatus {
    CREATED,        // order created
    AT_WAREHOUSE,  // arrived at warehouse
    IN_BOX,        // packed into a box
    ARCHIVED       // archived after delivery
}
