package com.chenyu.ssm.util;

/**
 * Created by chenyu on 2018/1/9.
 */
import org.springframework.context.annotation.Bean;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 * @author pan
 *
 */
@EnableSwagger2
public class ApplicationSwaggerConfig {

    @Bean
    public Docket addUserDocket() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        Contact contact = new Contact("陈玉", "", "250187715@qq.com");
        ApiInfo apiInfo = new ApiInfo("API管理系统", "WEB API文档", "V1.0.0", "", contact, "", "");
        docket.apiInfo(apiInfo);
        return docket;
    }
}
