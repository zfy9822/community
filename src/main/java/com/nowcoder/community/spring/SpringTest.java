package com.nowcoder.community.spring;

import com.nowcoder.community.dao.AlphaDao;
import com.nowcoder.community.service.AlphaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: zfy
 * @Date: 2022/4/25 9:52
 * @Description:
 */
public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        System.out.println("context 启动成功");
        AlphaService alphaService = context.getBean(AlphaService.class);

    }
}
