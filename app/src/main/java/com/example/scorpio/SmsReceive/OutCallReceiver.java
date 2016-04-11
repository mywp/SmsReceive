package com.example.scorpio.SmsReceive;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Scorpio on 16/3/3.
 */
public class OutCallReceiver extends BroadcastReceiver {
    /*1.创建一个收音机 继承广播接收者*/
    @Override
    public void onReceive(Context context, Intent intent) {
        String number = getResultData();
        if ("5556".equals(number)){
            setResultData(null);
        }
    }
}
