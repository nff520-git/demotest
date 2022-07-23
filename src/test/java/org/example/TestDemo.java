package org.example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestDemo {
    @BeforeClass
    public void before(){
        System.out.println("我是BeforeClass");
    }
    @Test
    public void test1(){
        System.out.println("打开百度");

    }
    @AfterClass
    public void after(){
        System.out.println("我是AfterClass");

    }



}
