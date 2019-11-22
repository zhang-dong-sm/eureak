package com.example.test.job;

import org.quartz.*;

/**
 * Function
 *
 * @author zhangd <zhangd@shinemo.com>
 * @date 2019/11/15 11:28
 */
public class ExecuteJob implements Job {

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        JobKey key = jobExecutionContext.getJobDetail().getKey();
        JobDataMap jobDataMap = jobExecutionContext.getJobDetail().getJobDataMap();
        System.out.println("key的参数描述："+key.getName()+"  "+key.getGroup());
        System.out.println("参数描述："+jobDataMap.getInt("id")+"  "+jobDataMap.getString("name"));
    }
}
