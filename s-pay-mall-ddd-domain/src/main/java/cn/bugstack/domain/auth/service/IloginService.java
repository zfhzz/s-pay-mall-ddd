package cn.bugstack.domain.auth.service;

import java.io.IOException;

public interface IloginService {
    String createQrCodeTicket() throws Exception;

    String checkLogin(String ticket);

    void saveLoginState(String ticket,String openid) throws IOException;
}
