package com.example.eurekateacher.hystrixServer;

import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixObservableCommand;
import rx.Observable;

public class TeacherHystrixObservableCommand extends HystrixObservableCommand<String> {
    protected TeacherHystrixObservableCommand(HystrixCommandGroupKey group) {
        super(group);
    }

    @Override
    protected Observable<String> construct() {
        return null;
    }

    @Override
    protected Observable<String> resumeWithFallback() {
        return super.resumeWithFallback();
    }
}
