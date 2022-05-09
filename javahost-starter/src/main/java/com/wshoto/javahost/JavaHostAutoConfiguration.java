package com.wshoto.javahost;

import com.wshoto.javahost.config.DnsConfiguration;
import com.wshoto.javahost.processor.DnsBeanProcessor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;

@Import({DnsBeanProcessor.class})
@EnableConfigurationProperties({DnsConfiguration.class})
@SpringBootConfiguration
@Slf4j
public class JavaHostAutoConfiguration {

}
