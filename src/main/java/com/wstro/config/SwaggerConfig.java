package com.wstro.config;

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger-UI
 *
 * @author weipeng
 * @Email weipeng@symdata.cn
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * 可以定义多个组
     *
     * @return Docket
     */
    @SuppressWarnings("unchecked")
    @Bean
    public Docket testApi() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2).groupName("admin")
                .genericModelSubstitutes(DeferredResult.class).useDefaultResponseMessages(false).forCodeGeneration(true)
                .pathMapping("/")// base，最终调用接口后会和paths拼接在一起
                .select().paths(Predicates.or(PathSelectors.regex("/admin/.*")))// 过滤的接口
                .build().apiInfo(adminApiInfo());
        ;
        return docket;
    }

    private ApiInfo adminApiInfo() {
        ApiInfo apiInfo = new ApiInfo("后台相关接口", // 大标题
                "后台相关接口，主要用于测试.", // 小标题
                "1.0", // 版本
                "https://gitee.com/astraveler/zhilesong",
                new Contact("weipeng", "https://gitee.com/astraveler/zhilesong", "weipeng@symdata.cn"), // 作者
                "智乐送", // 链接显示文字
                "https://www.zhilesong.com/"// 网站链接
        );
        return apiInfo;
    }

}
