package com.wshoto.domainstarter.util;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Slf4j
@Component
@AutoConfigureOrder(-1)
public class DomainProperties {

    private static Map<String, String> domainMap = new HashMap<>();

    public DomainProperties() {
        log.info("配置域名属性bean加载");
        log.info("qqmap={}", qqmap);
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
        for (String key : domainMap.keySet()) {
            log.info("key={}->value={}", key, domainMap.get(key));
        }
        return "属性" + qqmap;
    }

    public void initDomainMap() {
        domainMap.put(qqmap, "http://qqmap111.com/");
        domainMap.put(qyweixin, "http://qyweixin333.com/");
    }


}
