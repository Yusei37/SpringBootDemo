package club.yusei37.basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yusei on 2018/8/25
 */
@RestController
public class TestController {

    @GetMapping("/helloworld")
    public String helloworld() {
        return "Hello world!";
    }
}
