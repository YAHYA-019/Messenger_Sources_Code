package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;

/* loaded from: K6f.class */
public final class K6f extends K6n {
    public Integer A00;
    public boolean A01;
    public boolean A02;
    public final AlarmManager A03;

    public K6f(L9t l9t) {
        super(l9t);
        this.A03 = (AlarmManager) ((LCw) this).A00.A00.getSystemService("alarm");
    }

    public final void A0J() {
        this.A02 = false;
        AlarmManager alarmManager = this.A03;
        Context context = ((LCw) this).A00.A00;
        alarmManager.cancel(PendingIntent.getBroadcast(context, 0, 4YU.A0A("com.google.android.gms.analytics.ANALYTICS_DISPATCH").setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsReceiver")), 0));
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Integer num = this.A00;
        if (num == null) {
            num = Integer.valueOf(JQy.A0s("analytics", context.getPackageName()).hashCode());
            this.A00 = num;
        }
        int intValue = num.intValue();
        A0D("Cancelling job. JobID", Integer.valueOf(intValue));
        jobScheduler.cancel(intValue);
    }
}
