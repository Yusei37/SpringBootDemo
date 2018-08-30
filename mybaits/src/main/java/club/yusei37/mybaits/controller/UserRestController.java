package club.yusei37.mybaits.controller;

import club.yusei37.mybaits.bean.User;
import club.yusei37.mybaits.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Yusei on 2018/8/30
 */
@RestController
@RequestMapping(value = "/user")
public class UserRestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public boolean add(@RequestBody User user) {
        return userService.addUser(user);
    }

    @RequestMapping(value = "/delete/{account}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable String account) {
        return userService.deleteUser(account);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public boolean update(@RequestBody User user) {
        return userService.updateUser(user);
    }

    @RequestMapping(value = "/find/{account}", method = RequestMethod.GET)
    public User findUserByAccount(@PathVariable String account) {
        return userService.findByAccount(account);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<User> listAllUsers() {
        return userService.findAll();
    }
}
