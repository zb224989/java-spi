package cn.ethan.core;

import java.util.ServiceLoader;

/**
 * 邮箱工厂
 */
public class EmailFactory {
    private static Email email;

    /**
     * 私有构造方法
     */
    private EmailFactory() {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取当前邮件发送主体
     */
    public static Email getEmail(){
        if(null != email){
            return email;
        }
        ServiceLoader<Email> emails = ServiceLoader.load(Email.class);
        if (emails.iterator().hasNext()) {
            email = emails.iterator().next();
            return email;
        }
        return null;
    }

}
