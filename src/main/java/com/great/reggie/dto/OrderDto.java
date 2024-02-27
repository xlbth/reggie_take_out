package com.great.reggie.dto;

import com.great.reggie.entity.OrderDetail;
import com.great.reggie.entity.Orders;
import lombok.Data;

import java.util.List;

@Data
public class OrderDto extends Orders {
    private List<OrderDetail> orderDetails;
}
