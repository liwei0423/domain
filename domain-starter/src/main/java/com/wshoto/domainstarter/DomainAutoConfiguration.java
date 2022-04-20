package com.wshoto.domainstarter;

import com.wshoto.domainstarter.processor.ClientBeanProcessor;
import com.wshoto.domainstarter.util.DomainProperties;
import com.wshoto.domainstarter.util.TestProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;

@Import({DomainProperties.class,ClientBeanProcessor.class})
@EnableConfigurationProperties({TestProperties.class})
@SpringBootConfiguration
@Slf4j
public class DomainAutoConfiguration {

    public DomainAutoConfiguration(){
        log.info("域名自动配置类加载");
    }

}
