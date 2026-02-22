package cn.bugstack.domain.auth.service;

import cn.bugstack.domain.auth.adapter.port.ILoginPort;
import com.google.common.cache.Cache;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;

@Service
@Slf4j
public class WeixinLoginService implements IloginService{


    @Resource
    private ILoginPort loginPort;

    @Resource
    private Cache<String ,String> openidToken;

    @Override
    public String createQrCodeTicket() throws Exception {
        return loginPort.createQrCodeTicket();
    }

    @Override
    public String checkLogin(String ticket) {
        return openidToken.getIfPresent(ticket);
    }

    @Override
    public void saveLoginState(String ticket, String openid) throws IOException {
        openidToken.put(ticket,openid);
        //发送模板消息
        loginPort.sendLoginTemplate(openid);
    }
}
