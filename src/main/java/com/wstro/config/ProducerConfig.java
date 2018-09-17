package com.wstro.config;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * 验证码生成器
 *
 * @author weipeng
 * @Email weipeng@symdata.cn
 */
@Configuration
public class ProducerConfig {

    @Bean
    public DefaultKaptcha kaptcha() {
        DefaultKaptcha kaptcha = new DefaultKaptcha();
        Properties properties = new Properties();
        properties.put("kaptcha.border", "no");
        properties.put("kaptcha.textproducer.font.color", "black");
        properties.put("kaptcha.textproducer.char.space", 5);
        Config config = new Config(properties);
        kaptcha.setConfig(config);
        return kaptcha;
    }

}
