package com.example.demo.hello;

import java.util.Date;

import org.quartz.Job;

import org.quartz.JobExecutionContext;

import org.quartz.JobExecutionException;



import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@EnableScheduling // 此注解必加,必须要加，重中之重
@Component // 此注解必加
public class HelloJob {

    @Scheduled(cron = "0 0/1 * * * ?") // 每分钟执行一次
    public void work() throws Exception {
        System.out.println("执行调度任务："+new Date());
    }


    @Scheduled(fixedRate = 5000)//每5秒执行一次
    public void play() throws Exception {
        System.out.println("执行Quartz定时器任务："+new Date());
    }



    @Scheduled(cron = "0/2 * * * * ?") //每2秒执行一次
    public void doSomething() throws Exception {
        System.out.println("每2秒执行一个的定时任务："+new Date());
    }




    @Scheduled(cron = "0 0 0/1 * * ? ") // 每一小时执行一次
    public void goWork() throws Exception {
        System.out.println("每一小时执行一次的定时任务："+new Date());
    }

}