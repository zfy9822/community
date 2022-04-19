package com.nowcoder.community;

import com.nowcoder.community.util.SensitiveFilter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

/**
 * @Author: zfy
 * @Date: 2022/4/19 15:18
 * @Description:
 */

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class SensitiveTest {

    @Autowired
    private SensitiveFilter sensitiveFilter;

    @Test
    public void testSensitiveFilter(){
        String text = "这里可以赌博，可以嫖娼，可以吸毒，可以开票！";
        String filter = sensitiveFilter.filter(text);
        System.out.println(filter);

        text = "这里可以##赌博##，可以#嫖#娼#，可以吸毒，可以开票！";
        filter = sensitiveFilter.filter(text);
        System.out.println(filter);
    }
}
