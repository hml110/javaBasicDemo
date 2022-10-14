package com.hml.clone;

import com.hml.clone.Address;
import com.hml.clone.User;
import org.junit.Test;

import static org.junit.Assert.assertNotSame;

/**
 * @author hml
 * @version 1.0
 * @description:
 * @date 2022/10/14 9:42
 */
public class cloneCopy {

    @Test
    public void cloneCopy() throws CloneNotSupportedException {
        Address address = new Address("杭州","中国");
        User user = new User("大山",address);

        //测试=号的复制
        User copyUserByEqual = user;

        //调用clone()方法进行深拷贝
        User copyUser = (User) user.clone();

        //修改源对象的值
        user.getAddress().setCity("深圳");

        //检测两个对象的值不同
        //JUnit Assert.assertNotSame(Object unexpected, Object actual)
        // 断言两个对象没有引用同一对象。如果它们确实引用了相同的对象，则抛出一条不带消息的AssertionError。
        assertNotSame(user.getAddress().getCity(),copyUser.getAddress().getCity());
        System.out.println (user.getAddress().getCity()== copyUser.getAddress().getCity()); //false
        System.out.println(user.getAddress().getCity());//深圳
        System.out.println(copyUser.getAddress().getCity());//杭州

        System.out.println("----------------------------------------------------------");
//        assertNotSame(user.getAddress().getCity(),copyUserByEqual.getAddress().getCity());//java.lang.AssertionError: expected not same
        System.out.println (user.getAddress().getCity()== copyUserByEqual.getAddress().getCity()); //true
        System.out.println(user.getAddress().getCity());//深圳
        System.out.println(copyUserByEqual.getAddress().getCity());//深圳

    }

}
