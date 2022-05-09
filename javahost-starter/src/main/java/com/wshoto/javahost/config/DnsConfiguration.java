package com.wshoto.javahost.config;

import com.wshoto.javahost.core.JavaHost;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Map;

/**
 * @author: fahai
 * @date：2022-05-07 11:34:35
 */
@Slf4j
@Component
@ConfigurationProperties(prefix = "dns")
public class DnsConfiguration {

    //    这里的zk也要跟配置文件中的配置一致
    private Map<String, String> host;

    public Map<String, String> getHost() {
        return host;
    }

    public void setHost(Map<String, String> host) {
        this.host = host;
    }

    public void handler() {
//        业务代码......

        if (host != null && !host.isEmpty()) {
            host.forEach((k, v) -> System.out.println(k+""+v));
//            设置域名解析
            JavaHost.updateVirtualDns(host);
            log.info("开启JVM虚拟DNS");
            JavaHost.printAllVirtualDns();
//            for (String host : host.keySet()) {
//                try {
////                    ping 命令,设置超时时间为30秒
//                    boolean status = InetAddress.getByName(host).isReachable(30);
////                     ping 的结果
//                    log.info("Test Ping Host: [{}] result: [{}]", host, status);
//                } catch (IOException e) {
//                    log.info("Test Ping Host: [{}] exception: [{}]", host, e.getMessage());
//                }
//            }
        } else {
            System.out.println("未设置虚拟DNS");
        }


//        业务代码....
    }
}