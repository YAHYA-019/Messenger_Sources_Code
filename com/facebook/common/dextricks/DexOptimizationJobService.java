package com.facebook.common.dextricks;

import X.AnonymousClass001;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import com.facebook.common.dextricks.DexOptimization;

/* loaded from: DexOptimizationJobService.class */
public class DexOptimizationJobService extends JobService {
    public static final int JOB_ID = -87105850;
    public static final String KEY_SCHEDULED_AT = "scheduledAt";
    public static final String TAG = "DexOptimizationJobService";

    /* loaded from: DexOptimizationJobService$Client.class */
    public class Client {
        public static void cancel(Context context) {
            Mlog.v("DexOptimizationJobService: canceling dexoptjobsvc", new Object[0]);
            try {
                ((JobScheduler) context.getSystemService("jobscheduler")).cancel(DexOptimizationJobService.JOB_ID);
            } catch (SecurityException e) {
                Mlog.w("Failure to cancel DexOptimizationJobService", e);
            } catch (RuntimeException e2) {
                if (!AnonymousClass001.A1Y(e2)) {
                    throw e2;
                }
                Mlog.w("Failure to cancel DexOptimizationJobService", e2);
            }
        }

        public static void schedule(Context context, DexStore dexStore, boolean z, boolean z2, long j) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("DexOptimizationJobService: scheduling dexoptjobsvc requiresCharging:");
            A0k.append(z);
            A0k.append(" requiresDeviceIdle:");
            A0k.append(z2);
            A0k.append(" idleOptimizationPeriod:");
            A0k.append(j / 60000);
            AnonymousClass001.A1C(AnonymousClass001.A0d("min", A0k));
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putLong(DexOptimizationJobService.KEY_SCHEDULED_AT, System.currentTimeMillis());
            try {
                jobScheduler.schedule(new JobInfo.Builder(DexOptimizationJobService.JOB_ID, new ComponentName(context, (Class<?>) DexOptimizationJobService.class)).setPeriodic(j).setExtras(persistableBundle).setRequiresCharging(z).setRequiresDeviceIdle(z2).build());
            } catch (SecurityException e) {
                Mlog.w("Failure to schedule DexOptimizationJobService", e);
            } catch (RuntimeException e2) {
                if (!AnonymousClass001.A1Y(e2)) {
                    throw e2;
                }
                Mlog.w("Failure to schedule DexOptimizationJobService", e2);
            }
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        Mlog.v("DexOptimizationJobService: onStartJob", new Object[0]);
        DexStore mainDexStore = DexLibLoader.getMainDexStore();
        if (mainDexStore == null) {
            Mlog.w("DexOptimizationJobService: onStartJob: no main dex store", new Object[0]);
            return false;
        }
        DexOptimization.Client.startBackgroundOptimization(this, mainDexStore);
        jobFinished(jobParameters, false);
        return false;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        Mlog.v("DexOptimizationJobService: onStopJob", new Object[0]);
        return false;
    }
}
