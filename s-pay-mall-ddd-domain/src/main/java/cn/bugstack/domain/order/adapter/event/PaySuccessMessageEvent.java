package cn.bugstack.domain.order.adapter.event;

import cn.bugstack.types.event.BaseEvent;
import com.alipay.api.domain.ParamExtInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;
import org.checkerframework.checker.units.qual.N;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class PaySuccessMessageEvent extends BaseEvent<PaySuccessMessageEvent.PaySuccessMessage> {

    @Override
    public EventMessage buildEventMessage(PaySuccessMessage data) {
        //需要添加泛型
        return EventMessage.<PaySuccessMessage>builder()
                .id(RandomStringUtils.randomNumeric(11))
                .timestamp(new Date())
                .data(data)
                .build();
    }

    @Override
    public String topic() {
        return "pay_success";
    }
    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class PaySuccessMessage{
        private String userId;
        private String tradeNo;
    }
}
