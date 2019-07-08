//
// Created by Chikong on 2019/7/5.
//
#include <stdio.h>

/*
 * Class:     com_chikong_ndkdemo_JniTest
 * Method:    set
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_com_chikong_ndkdemo_FFmpeg_run(JNIEnv *env, jobject thiz, jstring string){
    char* str = (char*) (*env)->GetStringUTFChars(env,string,NULL);
    (*env)->ReleaseStringUTFChars(env, string, str);

}

