package com.wshoto.domainweixin.service;

import com.wshoto.domainweixin.util.WxHostConfig;
import org.springframework.stereotype.Service;

@Service
public class WxService {

    public String getUrl(){
        return WxHostConfig.API_DEFAULT_HOST_URL;
    }
}
