package lib.muhammed.com.androidjbscheduler;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.widget.Toast;

/**
 * Created by muhammed on 11/2/2017.
 */

public class TestJobService extends JobService {
    @Override
    public boolean onStartJob(JobParameters jobParameters) {
        Toast.makeText(getApplicationContext(), "hello job", Toast.LENGTH_SHORT).show();
//        Util.scheduleJob(getApplicationContext());
        return true;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        Toast.makeText(getApplicationContext(), "Stopped job", Toast.LENGTH_SHORT).show();
        return true;
    }
}
