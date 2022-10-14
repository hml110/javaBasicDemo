package com.hml.clone;

import com.google.gson.Gson;
import org.junit.Test;

import static org.junit.Assert.assertNotSame;

/**
 * @author hml
 * @version 1.0
 * @description:
 * @date 2022/10/14 10:30
 */
public class gsonCopy {
    @Test
    public void gsonCopyTest(){
        AddressBySerializable address = new AddressBySerializable("杭州","中国");
        UserBySerializable user = new UserBySerializable("大山",address);

        //利用Gson序列化进行深度拷贝
        Gson gson = new Gson();
        UserBySerializable userCopy = gson.fromJson(gson.toJson(user), UserBySerializable.class);

        //修改源对象的值
        user.getAddress().setCity("深圳");

        //检测两个对象的值不同
        //JUnit Assert.assertNotSame(Object unexpected, Object actual)
        // 断言两个对象没有引用同一对象。如果它们确实引用了相同的对象，则抛出一条不带消息的AssertionError。
        assertNotSame(user.getAddress().getCity(),userCopy.getAddress().getCity());
        System.out.println (user.getAddress().getCity()== userCopy.getAddress().getCity()); //false
        System.out.println(user.getAddress().getCity());//深圳
        System.out.println(userCopy.getAddress().getCity());//杭州
    }
}
