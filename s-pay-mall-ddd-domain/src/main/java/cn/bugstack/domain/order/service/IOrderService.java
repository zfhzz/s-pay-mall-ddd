package cn.bugstack.domain.order.service;

import cn.bugstack.domain.order.model.entity.PayOrderEntity;
import cn.bugstack.domain.order.model.entity.ShopCarEntity;
import com.alipay.api.AlipayApiException;

public interface IOrderService {
    PayOrderEntity createOrder(ShopCarEntity shopCarEntity) throws AlipayApiException;
}
