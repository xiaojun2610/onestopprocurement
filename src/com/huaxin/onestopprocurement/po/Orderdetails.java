package com.huaxin.onestopprocurement.po;

public class Orderdetails {
    private Long orderId;

    private Integer itemId;

    private Integer itemNumble;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getItemNumble() {
        return itemNumble;
    }

    public void setItemNumble(Integer itemNumble) {
        this.itemNumble = itemNumble;
    }
}