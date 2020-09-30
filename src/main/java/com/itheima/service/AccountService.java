package com.itheima.service;

import com.itheima.entity.Account;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: SpringIocAnnotation
 * @description: 业务层接口
 * @author: Xiaofei Wang
 * @created: 2020/09/29 23:34
 */

public interface AccountService {
    List<Account> findAll();
}
