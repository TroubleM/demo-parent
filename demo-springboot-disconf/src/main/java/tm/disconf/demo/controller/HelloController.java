package tm.disconf.demo.controller;

import com.baidu.disconf.client.common.annotations.DisconfFileItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tm.disconf.demo.config.DisconfDemoConfig;

/**
 * Created by wenjl on 2015/8/5.
 */
@Controller
public class HelloController {

    @Value("${username}")
    private String username;

    @Autowired
    private DisconfDemoConfig disconfDemoConfig;

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        System.out.println(username);
        System.out.println(disconfDemoConfig.getUsername());
        return username + "-----" + disconfDemoConfig.getUsername();
    }
}
