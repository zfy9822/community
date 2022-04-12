package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author: zfy
 * @Date: 2022/4/10 12:32
 * @Description:
 */
@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
