package com.xiaoming.config;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author by fangxiaoming01
 * @date 2018/3/2.
 */
@Component
public class ScheduledTasks {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    /**
     * 定义每过5秒执行的任务
     */
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("现在时间：" + dateFormat.format(new Date()));
    }

    /**
     * 上一次执行完毕时间点之后5秒再执行
     */
    @Scheduled(fixedDelay = 5000)
    public void reportCurrentTime1() {
        System.out.println("现在时间1：" + dateFormat.format(new Date()));
    }

    /**
     * 第一次延迟1秒后执行，之后按fixedRate的规则每5秒执行一次
     */
    @Scheduled(initialDelay = 1000, fixedRate = 5000)
    public void reportCurrentTime2() {
        System.out.println("现在时间2：" + dateFormat.format(new Date()));
    }

    /**
     * 通过cron表达式定义规则
     */
    @Scheduled(cron = "*/5 * * * * *")
    public void reportCurrentTime3() {
        System.out.println("现在时间3：" + dateFormat.format(new Date()));
    }

}
