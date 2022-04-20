package com.wshoto.domainweb.service.impl;

import com.wshoto.domainstarter.util.DomainProperties;
import com.wshoto.domainweb.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserServiceImpl implements IUserService {

    public final static String GET_PRE_AUTH_CODE = DomainProperties.qqmap+"cgi-bin/service/get_pre_auth_code";

    public UserServiceImpl(){
        log.info("UserServiceImpl bean加载");
    }

    @Override
    public void test() {
        log.info("执行test方法;{}",GET_PRE_AUTH_CODE);
    }
}
