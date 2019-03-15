package com.lgl.study.user;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class UserApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void thread() {
        ScheduledThreadPoolExecutor ss = new ScheduledThreadPoolExecutor(10);
        ss.scheduleWithFixedDelay(
                () -> System.out.println("sss"),
                0L,
                100L,
                TimeUnit.MILLISECONDS
        );
    }

}

