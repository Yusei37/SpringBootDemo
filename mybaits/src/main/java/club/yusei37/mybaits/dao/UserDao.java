package club.yusei37.mybaits.dao;

import club.yusei37.mybaits.bean.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by Yusei on 2018/8/30
 */
@Mapper
public interface UserDao {

    /**
     * Add user
     * @param user
     */
    @Insert("INSERT into user(account,password) values (#{account},#{password})")
    void addUser(User user);

    /**
     * Delete user
     * @param account
     */
    @Delete("DELETE FROM user WHERE account=#{account}")
    void deleteUser(String account);

    /**
     * Modify user
     * @param user
     * @return boolean
     */
    @Update("UPDATE user SET password=#{password} WHERE account=#{account} ")
    void updateUser(User user);

    /**
     * Query user by account
     * @param account
     * @return user
     */
    @Select("SELECT account,password FROM user WHERE account=#{account}")
    User findByAccount(String account);

    /**
     * List all users
     * @return List
     */
    @Select("SELECT account,password FROM user")
    List<User> findAll();
}
