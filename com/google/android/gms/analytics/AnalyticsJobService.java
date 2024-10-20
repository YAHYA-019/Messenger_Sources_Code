package com.google.android.gms.analytics;

import X.0FI;
import X.C01w;
import X.C08o;
import X.K6c;
import X.K6g;
import X.L0g;
import X.L24;
import X.L9t;
import X.LCw;
import X.LdM;
import X.Loa;
import X.MGH;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;

/* loaded from: AnalyticsJobService.class */
public final class AnalyticsJobService extends JobService implements MGH {
    public L24 A00;

    public final void DCB(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.Service
    public final void onCreate() {
        int A00 = C08o.A00(this, 79434226);
        int A04 = 0FI.A04(1600208358);
        super.onCreate();
        L24 l24 = this.A00;
        if (l24 == null) {
            l24 = new L24(this);
            this.A00 = l24;
        }
        K6g k6g = L9t.A01(l24.A00).A0C;
        L9t.A02(k6g);
        LCw.A0A(k6g, "Local AnalyticsService is starting up", 2);
        0FI.A0A(-1285130075, A04);
        C08o.A02(-1526480451, A00);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        int A04 = 0FI.A04(-1496486914);
        L24 l24 = this.A00;
        if (l24 == null) {
            l24 = new L24(this);
            this.A00 = l24;
        }
        K6g k6g = L9t.A01(l24.A00).A0C;
        L9t.A02(k6g);
        LCw.A0A(k6g, "Local AnalyticsService is shutting down", 2);
        super.onDestroy();
        0FI.A0A(-1074823759, A04);
        C01w.A00(this);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int A01 = C08o.A01(this, -742697436);
        int A04 = 0FI.A04(-238538585);
        L24 l24 = this.A00;
        if (l24 == null) {
            l24 = new L24(this);
            this.A00 = l24;
        }
        int A012 = l24.A01(intent, i2);
        0FI.A0A(1147937697, A04);
        C08o.A03(-1922901297, A01);
        return A012;
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        L24 l24 = this.A00;
        if (l24 == null) {
            l24 = new L24(this);
            this.A00 = l24;
        }
        Context context = l24.A00;
        final K6g k6g = L9t.A01(context).A0C;
        L9t.A02(k6g);
        String string = jobParameters.getExtras().getString("action");
        k6g.A0D("Local AnalyticsJobService called. action", string);
        if (!"com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(string)) {
            return true;
        }
        final L24 l242 = l24;
        Runnable runnable = new Runnable(jobParameters, k6g, l242) { // from class: X.Lq5
            public static final String __redex_internal_original_name = "zzcs";
            public final JobParameters A00;
            public final K6g A01;
            public final L24 A02;

            {
                this.A02 = l242;
                this.A01 = k6g;
                this.A00 = jobParameters;
            }

            @Override // java.lang.Runnable
            public final void run() {
                L24 l243 = this.A02;
                K6g k6g2 = this.A01;
                JobParameters jobParameters2 = this.A00;
                LCw.A0A(k6g2, "AnalyticsJobService processed last dispatch request", 2);
                l243.A00.DCB(jobParameters2, false);
            }
        };
        K6c k6c = L9t.A01(context).A06;
        L9t.A02(k6c);
        LdM ldM = new LdM(l24, runnable);
        k6c.A0I();
        L0g A00 = L9t.A00(k6c);
        A00.A02.submit(new Loa(k6c, ldM));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }
}
