package tm.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tm.request.MicroServiceRequest;
import tm.service.MicroService;

@RestController
@RequestMapping(value = "test")
public class TestController {

    @Reference(validation = "1.0.0")
    private MicroService microService;

    @GetMapping(value = "test1")
    public Object test1(String userName, String password){
        MicroServiceRequest microServiceRequest = new MicroServiceRequest();
        microServiceRequest.setUserName(userName);
        microServiceRequest.setPassword(password);
        return microService.execute(microServiceRequest);
    }

 }
