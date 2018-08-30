package club.yusei37.mybaits.service.impl;

import club.yusei37.mybaits.bean.User;
import club.yusei37.mybaits.service.UserService;
import club.yusei37.mybaits.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Yusei on 2018/8/30
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public boolean addUser(User user) {
        boolean flag=false;
        try{
            userDao.addUser(user);
            flag=true;
        }catch(Exception e){
            System.out.println("Add failed!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteUser(String account) {
        boolean flag=false;
        try{
            userDao.deleteUser(account);
            flag=true;
        }catch(Exception e){
            System.out.println("Delete failed!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateUser(User user) {
        boolean flag=false;
        try{
            userDao.updateUser(user);
            flag=true;
        }catch(Exception e){
            System.out.println("Update failed!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public User findByAccount(String account) {
        User user = userDao.findByAccount(account);
        return user;
    }

    @Override
    public List<User> findAll() {
        List<User> users = userDao.findAll();
        return users;
    }
}
