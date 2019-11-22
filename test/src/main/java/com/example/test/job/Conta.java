package com.example.test.job;

import java.util.Date;

/**
 * Function
 *
 * @author zhangd <zhangd@shinemo.com>
 * @date 2019/11/15 11:36
 */
public class Conta {
    public static void main(String[] args)throws  Exception {
        /*JobDetail detail= JobBuilder.newJob(ExecuteJob.class).withIdentity("first","haha")
                .usingJobData("id",12).usingJobData("name","zhangsa").build();
        JobDetail detail2= JobBuilder.newJob(ExecuteJob.class).withIdentity("first","hahaa")
                .usingJobData("id",12).usingJobData("name","zhangsa").build();
        Trigger trigger= TriggerBuilder.newTrigger().withIdentity("first","haha")
                .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(2).repeatForever())
                .build();*/

        /*Scheduler scheduled=new StdSchedulerFactory().getScheduler();
        scheduled.scheduleJob(detail,trigger);
        scheduled.scheduleJob(detail,trigger2);
        scheduled.start();*/
        new Thread(){
            @Override
            public void run() {
                long l = System.currentTimeMillis();
                System.out.println(new Date());


                while(true){

                    if((System.currentTimeMillis()-l)/100==1){
                        System.out.println(new Date());
                        l=System.currentTimeMillis();
                    }
                }
            }
        }.start();

    }
}
