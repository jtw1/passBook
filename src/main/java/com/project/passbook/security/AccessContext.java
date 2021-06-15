package com.project.passbook.security;

/**
 * @Description 用threadLocal单独存储每个线程携带的Token信息
 * @date 2021/6/14-16:29
 */
public class AccessContext {

    private static final ThreadLocal<String> token=new ThreadLocal<>();

    public static String getToken(){
        return token.get();
    }

    public static void setToken(String tokenStr){
        token.set(tokenStr);
    }

    /**
     * 清除当前线程的token信息
     */
    public static void clearAccessKey(){
        token.remove();
    }
}
