package com.example.DAWN;

public class Data {
    public static Long delay;
    public static String Server;
    public static int port;
    public static float[] location;
    Data(){
        delay = 0L;
//        Server = "39.105.27.108";
        Server = "192.168.137.1";
        port = 66;
        location = new float[]{0, 0};
    }

    public static Long getDelay() {
        return delay;
    }

    public static void setDelay(Long a) {
        delay = a;
    }
    public static void setMaxDelay(Long a) {
        if(a > delay){
            delay = a;
        }
    }
}