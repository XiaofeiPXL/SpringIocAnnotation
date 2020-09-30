package com.itheima.service;

import com.itheima.entity.Account;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @program: SpringIocAnnotation
 * @description:
 * @author: Xiaofei Wang
 * @created: 2020/09/29 23:38
 */


public class AccountServiceTest {

    private AccountService accountService;

    @Before
    public void setUp() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        accountService = applicationContext.getBean("accountService",AccountService.class);
    }

    @After
    public void tearDown() {
        System.out.println("All tests done");
    }

    @Test
    public void findAll() {
        List<Account> accountList = accountService.findAll();
        for(Account account:accountList){
            System.out.println(account);
        }
    }
}