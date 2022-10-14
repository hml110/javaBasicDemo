package com.hml.clone;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.junit.Assert.assertNotSame;

/**
 * @author hml
 * @version 1.0
 * @description:
 * @date 2022/10/14 10:40
 */
public class jacksonCopy {
    @Test
    public void jacksonCopyTest() throws JsonProcessingException {
        AddressByJackson address = new AddressByJackson("杭州", "中国");
        UserByJackson user = new UserByJackson("大山", address);

        //使用Jackson序列化进行深度拷贝
        ObjectMapper objectMapper = new ObjectMapper();
        UserByJackson copyUser = objectMapper.readValue(objectMapper.writeValueAsString(user), UserByJackson.class);

        //修改源对象的值
        user.getAddress().setCity("深圳");

        //检测两个对象的值不同
        //JUnit Assert.assertNotSame(Object unexpected, Object actual)
        // 断言两个对象没有引用同一对象。如果它们确实引用了相同的对象，则抛出一条不带消息的AssertionError。
        assertNotSame(user.getAddress().getCity(),copyUser.getAddress().getCity());
        System.out.println (user.getAddress().getCity()== copyUser.getAddress().getCity()); //false
        System.out.println(user.getAddress().getCity());//深圳
        System.out.println(copyUser.getAddress().getCity());//杭州





    }
}
