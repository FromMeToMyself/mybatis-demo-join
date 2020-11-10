package online.stringtek.mybatisdemojoin.pojo.entity;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class User {
    private long id;
    private String username;
    private String password;
    private List<Role> roleList;
    private List<Order> orderList;

    public User() {
    }

    public User(long id, String username, String password, List<Role> roleList, List<Order> orderList) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.roleList = roleList;
        this.orderList = orderList;
    }
}
