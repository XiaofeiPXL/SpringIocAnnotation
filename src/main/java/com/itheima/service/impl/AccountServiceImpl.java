package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.entity.Account;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: SpringIocAnnotation
 * @description: 业务层接口实现类
 * @author: Xiaofei Wang
 * @created: 2020/09/29 23:35
 */

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    public List<Account> findAll() {
        return accountDao.findAll();
    }
}
