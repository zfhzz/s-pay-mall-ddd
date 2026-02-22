package cn.bugstack.domain.order.adapter.repository;

import cn.bugstack.domain.order.model.aggregate.CreateOrderAggregate;
import cn.bugstack.domain.order.model.entity.OrderEntity;
import cn.bugstack.domain.order.model.entity.ShopCarEntity;

public interface IOrderRepository {

    OrderEntity queryUnPayOrder(ShopCarEntity shopCartEntity);

    void doSaveOrder(CreateOrderAggregate orderAggregate);
}
