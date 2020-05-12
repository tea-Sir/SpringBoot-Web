package org.teasir.applicationrunner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Set;

@Component
@Order(99)
/*
 * ApplicationRunner实现系统启动任务
 * */
public class MyApplicationRuner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        //获得所有参数
        String[] arrays = args.getSourceArgs();
        //获得没有key值的参数
        List<String>  nooptions= args.getNonOptionArgs();
        //获得所有有key值的参数
        Set<String> options=  args.getOptionNames();
    }
}
