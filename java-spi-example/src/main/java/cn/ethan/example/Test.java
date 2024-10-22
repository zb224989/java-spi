package cn.ethan.example;

import cn.ethan.core.Email;
import cn.ethan.core.EmailFactory;
import cn.ethan.core.MyServiceLoader;

import java.util.List;

/**
 * 测试
 */
public class Test {
    public static void main(String[] args) {
//        Email email = EmailFactory.getEmail();
//        email.send("123");
        MyServiceLoader<Email> load = MyServiceLoader.load(Email.class);
        List<Email> providers = load.getProviders();
        System.out.println(providers);
        Email email = providers.get(0);
        email.send("123");

    }
}
