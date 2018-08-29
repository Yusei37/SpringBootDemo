package club.yusei37.webtemplate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by Yusei on 2018/8/27
 */
@Controller
public class FreemarkerController {

    @RequestMapping("freemarker")
    public String hello(Map<String,Object> map) {
        map.put("msg", "Hello Freemarker!");
        return "hello";
    }
}
