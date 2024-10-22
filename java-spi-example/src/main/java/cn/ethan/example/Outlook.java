package cn.ethan.example;

import cn.ethan.core.Email;

/**
 * Outlook
 */
public class Outlook implements Email {

    @Override
    public void send(String emailContent) {
        System.out.println("使用微软邮箱发送");
    }
}
