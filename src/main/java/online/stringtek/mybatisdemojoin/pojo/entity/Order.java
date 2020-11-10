package online.stringtek.mybatisdemojoin.pojo.entity;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class Order {
    private long id;
    private String orderCode;
    private String orderName;
    private BigDecimal totalAmount;
    private User owner;
}
