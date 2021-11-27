package com.mj.config;

import com.mj.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.mj")
public class MyConfig {

    /**
     * @Bean 即注册了一个 bean，相当于 <bean> 标签
     * 方法名字即为 <bean> 标签中的 id
     * 方法返回即为 <bean> 标签中的 class
     */
    @Bean
    public User getUser() {
        return new User();
    }
}
