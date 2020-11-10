package online.stringtek.mybatisdemojoin.mapper;

import online.stringtek.mybatisdemojoin.pojo.entity.Order;

import java.util.List;

public interface OrderMapper {
    List<Order> selectAll();
}
