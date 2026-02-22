package cn.bugstack.domain.order.service;

import cn.bugstack.domain.order.model.entity.PayOrderEntity;
import cn.bugstack.domain.order.model.entity.ShopCarEntity;
import com.alipay.api.AlipayApiException;

import java.util.List;

public interface IOrderService {
    PayOrderEntity createOrder(ShopCarEntity shopCarEntity) throws AlipayApiException;

    void changeOrderPaySuccess(String orderId);

    List<String> queryNoPayNotifyOrder();

    List<String> queryTimeoutCloseOrderList();

    boolean changeOrderClose(String orderId);
}
