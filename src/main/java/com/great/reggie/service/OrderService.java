package com.great.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.great.reggie.entity.OrderDetail;
import com.great.reggie.entity.Orders;

import java.util.List;

public interface OrderService extends IService<Orders> {

    /**
     * 用户下单
     * @param orders
     */
    public void submit(Orders orders);
    public List<OrderDetail> getOrderDetailListByOrderId(Long orderId);

}
