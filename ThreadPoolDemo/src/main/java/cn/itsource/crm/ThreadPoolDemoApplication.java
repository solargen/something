package cn.itsource.crm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 使用POSTMAN模拟发送10条请求到  localhost/threadPoolTest
 *
 * 如果不适用连接池，由于在service层模拟了阻塞，则所有的请求需要10s结束
 * 但是我们使用了连接池，配置了最大连接数为10，则所有的请求异步在服务端2s执行结束
 *
 */
@SpringBootApplication
public class ThreadPoolDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThreadPoolDemoApplication.class, args);
    }

}
