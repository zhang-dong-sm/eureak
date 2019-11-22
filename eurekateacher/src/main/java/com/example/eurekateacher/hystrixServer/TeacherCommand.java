package com.example.eurekateacher.hystrixServer;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

public class TeacherCommand extends HystrixCommand<String> {
    protected TeacherCommand(HystrixCommandGroupKey group) {
        super(group);
    }

    @Override
    protected String run() throws Exception {
        return null;
    }

    @Override
    protected String getFallback() {
        return super.getFallback();
    }
}
