package club.yusei37.webtemplate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by Yusei on 2018/8/27
 */
@Controller
public class ThymeleafController {

    @RequestMapping("thymeleaf")
    public String hello(Map<String,Object> map) {
        map.put("msg", "Hello Thymeleaf!");
        return "hello";
    }

    @RequestMapping("/")
    public String index(Map<String,Object> map) {
        return "index";
    }

    @RequestMapping("/redirect")
    public String redirect(){
        return "redirect";
    }

    @RequestMapping("/model")
    public String model(Model model){
        model.addAttribute("name","Yusei");
        return "model";
    }
}
