package tm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tm.fescar.service.OrderService;
import tm.fescar.service.StorageService;

@RestController
@RequestMapping(value = "fescar-customer")
public class FescarCustomerController {

    @Autowired
    private StorageService storageService;

    @Autowired
    private OrderService orderService;

    /**
     * @Author zhangyi
     * @Description: fescar消费者测试
     * @Date  2019/3/1
     * @Param []
     * @return java.lang.Object
     **/
    @GetMapping(value = "testOne")
    public Object testOne(){
        orderService.create("1","1",1);
        storageService.deduct("1",1);
        System.out.println("121212122");
        return orderService.create("1","1",1);
    }

}
