package com.wshoto.domainstarter.util;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Slf4j
@Data
@ConfigurationProperties(prefix = "domain")
public class TestProperties {

    public TestProperties(){
      log.info("配置TestProperties加载");
    }

    private String qyweixin;
}
