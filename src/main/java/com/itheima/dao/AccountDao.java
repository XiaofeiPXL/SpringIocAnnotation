package com.itheima.dao;

import com.itheima.entity.Account;

import java.util.List;

/**
 * @program: SpringIocAnnotation
 * @description: 持久层接口
 * @author: Xiaofei Wang
 * @created: 2020/09/29 23:29
 */


public interface AccountDao {
    List<Account> findAll();
}
