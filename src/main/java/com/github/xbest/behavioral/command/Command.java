package com.github.xbest.behavioral.command;

/**
 * 命令模式将请求封装成对象，可以调用同一个方法，完成不同的事情。<br/>
 * 适用于排队的请求或者记录日志等，能够提供命令的撤销和恢复功能。<br/>
 * 命令模式在jdk中的典型应用案例，{@link Runnable#run()}<br/>
 * Created by link on 2017/3/1.
 */
public interface Command {
    void execute();
}
