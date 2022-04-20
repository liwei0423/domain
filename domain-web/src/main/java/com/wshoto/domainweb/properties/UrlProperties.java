package com.wshoto.domainweb.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@PropertySource("classpath:config/uri.properties")
@ConfigurationProperties(prefix = "uri")
@Configuration
public class UrlProperties {

    private String getToken;
}
