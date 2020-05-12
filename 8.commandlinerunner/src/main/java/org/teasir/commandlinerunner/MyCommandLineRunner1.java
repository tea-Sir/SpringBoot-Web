package org.teasir.commandlinerunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
@Order(23)
/*
* CommandLineRunner实现系统启动自动任务
* */
public class MyCommandLineRunner1 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("MyCommandLineRunner1"+ Arrays.toString(args));
    }
}
