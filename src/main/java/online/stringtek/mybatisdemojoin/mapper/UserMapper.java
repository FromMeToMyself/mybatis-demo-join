package online.stringtek.mybatisdemojoin.mapper;

import online.stringtek.mybatisdemojoin.pojo.entity.User;

import java.util.List;

public interface UserMapper {
    List<User> findAllWithOrder();
    List<User> findAllWithRole();
    List<User> findAll();
}
