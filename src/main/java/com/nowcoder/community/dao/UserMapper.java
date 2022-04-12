package com.nowcoder.community.dao;

import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @Author: zfy
 * @Date: 2022/4/11 11:20
 * @Description:
 */

@Mapper
public interface UserMapper {

    User selectById(int id);

    User selectByName(String username);

    User selectByEmail(String email);

    //插入用户
    int insertUser(User user);

    //更新状态
    int updateStatus(int id, int status);

    //更新头像
    int updateHeader(int id, String headerUrl);

    //更新密码
    int updatePassword(int id, String password);
}
