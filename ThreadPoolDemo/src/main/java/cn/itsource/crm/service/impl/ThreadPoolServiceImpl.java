package cn.itsource.crm.service.impl;

import cn.itsource.crm.service.ThreadPoolService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ThreadPoolServiceImpl implements ThreadPoolService {

    @Override
    @Async("asyncServiceExecutor")
    public void threadPoolTest() {

        try {
            Thread.sleep(1000);
            System.out.println("当前线程:"+Thread.currentThread().getName()+"执行完毕");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
