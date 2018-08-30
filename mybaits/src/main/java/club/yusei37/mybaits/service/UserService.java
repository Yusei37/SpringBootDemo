package club.yusei37.mybaits.service;

import club.yusei37.mybaits.bean.User;

import java.util.List;

/**
 * Created by Yusei on 2018/8/30
 */
public interface UserService {

    /**
     * Add user
     * @param user
     * @return boolean
     */
    boolean addUser(User user);

    /**
     * Delete user
     * @param user
     * @return boolean
     */
    boolean deleteUser(String account);

    /**
     * Update user
     * @param user
     * @return boolean
     */
    boolean updateUser(User user);

    /**
     * Query user by account
     * @param account
     * @return user
     */
    User findByAccount(String account);

    /**
     * List all users
     * @return List
     */
    List<User> findAll();

}