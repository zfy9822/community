package com.nowcoder.community.config;

import com.nowcoder.community.annotation.LoginRequired;
import com.nowcoder.community.controller.interceptor.AlphaInterceptor;
import com.nowcoder.community.controller.interceptor.LoginRequiredInterceptor;
import com.nowcoder.community.controller.interceptor.LoginTicketInterceptor;
import com.nowcoder.community.controller.interceptor.MessageInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: zfy
 * @Date: 2022/4/18 14:40
 * @Description:
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    private AlphaInterceptor alphaInterceptor;

    // 登录凭证拦截器，用于在每次操作前后处理登录凭证
    @Autowired
    private LoginTicketInterceptor loginTicketInterceptor;

    // 登录检查拦截器，用于检查是否满足已经登录的条件，处理一些必须要登录才能显示的操作
    @Autowired
    private LoginRequiredInterceptor loginRequiredInterceptor;

    // 通知信息拦截器(私信、系统通知)
    @Autowired
    private MessageInterceptor messageInterceptor;

    // SpringBoot拦截器配置
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(alphaInterceptor)
                .excludePathPatterns("/**/*.css", "**/*.js",
                        "**/*.jpg", "**/*.png", "**/*.jpeg")
                .addPathPatterns("/register", "/login");

        registry.addInterceptor(loginTicketInterceptor)
                .excludePathPatterns("/**/*.css", "**/*.js",
                        "**/*.jpg", "**/*.png", "**/*.jpeg");

        registry.addInterceptor(loginRequiredInterceptor)
                .excludePathPatterns("/**/*.css", "**/*.js",
                        "**/*.jpg", "**/*.png", "**/*.jpeg");

        registry.addInterceptor(messageInterceptor)
                .excludePathPatterns("/**/*.css", "**/*.js",
                        "**/*.jpg", "**/*.png", "**/*.jpeg");

    }


}
