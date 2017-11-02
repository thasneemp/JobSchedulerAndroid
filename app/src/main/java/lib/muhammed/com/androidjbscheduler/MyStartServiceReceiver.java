package lib.muhammed.com.androidjbscheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by muhammed on 11/2/2017.
 */

public class MyStartServiceReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        Util.scheduleJob(context);

    }
}
