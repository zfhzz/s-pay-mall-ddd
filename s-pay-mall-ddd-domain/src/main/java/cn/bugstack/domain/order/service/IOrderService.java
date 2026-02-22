package cn.bugstack.domain.order.service;

import cn.bugstack.domain.order.model.entity.PayOrderEntity;
import cn.bugstack.domain.order.model.entity.ShopCarEntity;

public interface IOrderService {
    PayOrderEntity createOrder(ShopCarEntity shopCarEntity);
}
