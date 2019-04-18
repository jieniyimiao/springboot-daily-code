package com.sino.daily.configuration;

import com.sino.daily.annotations.ApiVersion;
import com.sino.daily.service.ApiVersionCondition;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.condition.RequestCondition;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.lang.reflect.Method;

/**
 * 自定义WebMvcConfigurationSupport
 * Created on 2019/4/18 14:12.
 *
 * @author caogu
 */

@Configuration
public class ApiVersionConfig extends WebMvcConfigurationSupport {

    //重写请求过处理的方法
    @Override
    public RequestMappingHandlerMapping requestMappingHandlerMapping() {
        RequestMappingHandlerMapping handlerMapping = new CustomRequestMappingHandlerMapping();
        handlerMapping.setOrder(0);
        return handlerMapping;
    }

    /**
     * 自定义匹配的处理器
     * Created on 2019/4/18 14:10.
     *
     * @author caogu
     */
    private static class CustomRequestMappingHandlerMapping extends RequestMappingHandlerMapping {
        @Override
        protected RequestCondition<ApiVersionCondition> getCustomTypeCondition(Class<?> handlerType) {
            ApiVersion apiVersion = AnnotationUtils.findAnnotation(handlerType, ApiVersion.class);
            return createCondition(apiVersion);
        }

        @Override
        protected RequestCondition<ApiVersionCondition> getCustomMethodCondition(Method method) {
            ApiVersion apiVersion = AnnotationUtils.findAnnotation(method, ApiVersion.class);
            return createCondition(apiVersion);
        }

        private RequestCondition<ApiVersionCondition> createCondition(ApiVersion apiVersion) {
            return apiVersion == null ? null : new ApiVersionCondition(apiVersion.value());
        }
    }
}
