package lib.muhammed.com.androidjbscheduler;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;

/**
 * Created by muhammed on 11/2/2017.
 */

public class Util {
    public static void scheduleJob(Context context) {
        ComponentName componentName = new ComponentName(context, TestJobService.class);
        JobInfo.Builder builder = new JobInfo.Builder(0, componentName);
//        builder.setMinimumLatency(1 * 1000);
        builder.setPeriodic(2 * 1000);
        builder.setPersisted(true);


        JobScheduler jobScheduler = (JobScheduler) context.getSystemService(Context.JOB_SCHEDULER_SERVICE);

        jobScheduler.schedule(builder.build());
    }
}
