//
// Created by Chikong on 2019/7/5.
//
#include <stdio.h>
#include "android_log.h"
#include "ffmpeg.h"
#include "com_chikong_ndkdemo_FFmpegRun.h"
/*
 * Class:     com_chikong_ndkdemo_FFmpegRun
 * Method:    set
 * Signature: (Ljava/lang/String;)V
 */
JNIEXPORT jint JNICALL Java_com_chikong_ndkdemo_FFmpegRun_run(JNIEnv *env, jclass obj, jobjectArray commands){
     int argc = (*env)->GetArrayLength(env, commands);
     char *argv[argc];
     int i;
     for (i = 0; i < argc; i++) {
         jstring js = (jstring) (*env)->GetObjectArrayElement(env, commands, i);
         argv[i] = (char*) (*env)->GetStringUTFChars(env, js, 0);
     }
     LOGD("----------begin---------");
     return main(argc, argv);

}
