package com.paradise.demo.compoent;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 * Created by macro on 2018/4/26.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.paradise.demo.controller")
                .title("Demo-System")
                .description("接口文档")
                .contactName("Paradise")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
