package tm.disconf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tm.disconf.config.TestConfig;

@RestController
@RequestMapping(value = "test")
public class TestController {

    @Autowired
    private TestConfig testConfig;

    @GetMapping(value = "test1")
    public Object test1(){
        System.out.println(testConfig.getUsername());
        System.out.println(testConfig.getPassword());
        return "ok";
    }

}
