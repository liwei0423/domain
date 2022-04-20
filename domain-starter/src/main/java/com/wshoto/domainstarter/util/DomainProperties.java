package com.wshoto.domainstarter.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Slf4j
@Component
@AutoConfigureOrder(-1)
public class DomainProperties {

    public DomainProperties(){
        log.info("配置域名属性bean加载");
    }

    public static String qqmap;

    public static String qyweixin;

    @Value("${domain.qqmap}")
    public void setQqmap(String qqmap) {
        System.out.println("##### setQqmap=" + qqmap);
        DomainProperties.qqmap = qqmap;
    }

    @Value("${domain.qyweixin}")
    public void setQyweixin(String qyweixin) {
        DomainProperties.qyweixin = qyweixin;
    }

    @Override
    public String toString() {
        return "属性"+qqmap;
    }
}
