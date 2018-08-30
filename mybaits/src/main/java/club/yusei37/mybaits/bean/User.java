package club.yusei37.mybaits.bean;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Yusei on 2018/8/30
 */
@Getter
@Setter
public class User {

    private String account;
    private String password;

    public User() {
    }

    public User(String account, String password) {
        this.account = account;
        this.password = password;
    }
}