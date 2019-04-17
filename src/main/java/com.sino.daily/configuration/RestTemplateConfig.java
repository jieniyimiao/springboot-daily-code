package com.sino.daily.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * Created on 2019/4/17 17:21.
 *
 * @author caogu
 */
@Configuration
public class RestTemplateConfig {
    @Bean
    public RestTemplate createRestTemplate() {
        int timeOut = 10 * 1000;
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setReadTimeout(timeOut);
        factory.setConnectTimeout(timeOut);
        return new RestTemplate(factory);
    }
}
