package online.stringtek.mybatisdemojoin;

import online.stringtek.mybatisdemojoin.mapper.OrderMapper;
import online.stringtek.mybatisdemojoin.mapper.UserMapper;
import online.stringtek.mybatisdemojoin.pojo.entity.Order;
import online.stringtek.mybatisdemojoin.pojo.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatisConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
//        OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
//        List<Order> orderList = orderMapper.selectAll();
//        for (Order order : orderList) {
//            System.out.println(order);
//        }
//        System.out.println("=============");
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//        for (User user : userMapper.findAllWithOrder()) {
//            System.out.println(user);
//        }
//        System.out.println("=============");
//        for (User user : userMapper.findAllWithRole()) {
//            System.out.println(user);
//        }
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> allUser1 = mapper.findAll();
    }
}
