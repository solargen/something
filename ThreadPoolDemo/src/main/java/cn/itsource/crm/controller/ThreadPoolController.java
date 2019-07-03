package cn.itsource.crm.controller;

import cn.itsource.crm.service.ThreadPoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThreadPoolController {

    @Autowired
    private ThreadPoolService threadPoolService;

    @GetMapping("/threadPoolTest")
    public String threadPoolTest(){
        threadPoolService.threadPoolTest();
        return "success";
    }

}
