package com.nobroker.config;


import com.nobroker.filter.PropertyApprovalFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {


    @Bean
    public FilterRegistrationBean<PropertyApprovalFilter> propertyApprovalFilter(){

        FilterRegistrationBean<PropertyApprovalFilter> registrationBean=new FilterRegistrationBean<>();
        registrationBean.setFilter(new PropertyApprovalFilter());
        registrationBean.addUrlPatterns("/properties/*");
        return registrationBean;
    }

}
