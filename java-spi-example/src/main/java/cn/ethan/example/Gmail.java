package cn.ethan.example;

import cn.ethan.core.Email;

/**
 *Gmail
 */
public class Gmail implements Email {

    public Gmail(String email) {
    }

    @Override
    public void send(String emailContent) {
        System.out.println("使用谷歌邮箱发送");
    }
}
