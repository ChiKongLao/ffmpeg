package com.chikong.ndkdemo;

/**
 * Created by Chikong on 2019/7/5.
 */
public class JniTest {


    public static void main(String[] args) {
        JniTest jni = new JniTest();
        System.out.println(jni.get());
        jni.set("haha");

    }

    public native String get();
    public native void set(String str);

}
