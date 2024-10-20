package com.facebook.conditionalworker;

import X.05X;
import X.0Pz;
import X.0fH;
import X.1BK;
import X.1BQ;
import X.1Bn;
import X.1HH;
import X.1XS;
import X.2yD;
import X.4AZ;
import X.4CX;
import X.51X;
import X.AnonymousClass001;
import X.C00i;
import X.C3o5;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.facebook.common.build.BuildConstants;
import com.facebook.inject.FbInjector;
import java.util.concurrent.TimeUnit;

/* loaded from: ConditionalWorkerJobScheduler.class */
public final class ConditionalWorkerJobScheduler {
    public static PendingIntent A06;
    public Context A00;
    public final Context A01;
    public final C00i A02;
    public final C00i A03 = new 1BQ(32934);
    public final C00i A04 = new 1BQ(16511);
    public final C00i A05;

    public ConditionalWorkerJobScheduler() {
        Context context = (Context) 1Bn.A0A(83719);
        this.A00 = context;
        this.A02 = new 1HH(context, 100172);
        this.A05 = new 1BQ(67208);
        this.A01 = FbInjector.A00().getApplicationContext();
    }

    public static PendingIntent A00(Context context, boolean z) {
        PendingIntent pendingIntent;
        synchronized (ConditionalWorkerJobScheduler.class) {
            pendingIntent = A06;
            if (pendingIntent == null) {
                Intent A0D = C3o5.A0D(context, ConditionalWorkerServiceReceiver.class);
                A0D.putExtra("service_start_reason", "alarm_manager");
                A0D.setAction(51X.A00("FOR_CONDITIONAL_WORKER_SERVICE"));
                int i = 536870912;
                if (z) {
                    i = 134217728;
                }
                05X r0 = new 05X();
                r0.A08();
                r0.A0D(A0D, context.getClassLoader());
                pendingIntent = r0.A02(context, 0, i);
                A06 = pendingIntent;
            }
        }
        return pendingIntent;
    }

    public void A01() {
        int i;
        C00i c00i = this.A03;
        c00i.get();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        long millis = timeUnit.toMillis(180L);
        c00i.get();
        long max = Math.max(millis, timeUnit.toMillis(180L));
        long millis2 = timeUnit.toMillis(((2yD) ((4AZ) c00i.get()).A00.get()).Auy(36591837169975423L));
        long min = Math.min(max, millis2);
        1XS r0 = (1XS) this.A05.get();
        if (r0 == null) {
            AlarmManager alarmManager = (AlarmManager) this.A02.get();
            long elapsedRealtime = SystemClock.elapsedRealtime() + min;
            c00i.get();
            alarmManager.setInexactRepeating(3, elapsedRealtime, timeUnit.toMillis(180L), A00(this.A01, true));
            return;
        }
        long j = -1;
        long j2 = -1;
        long millis3 = timeUnit.toMillis(((2yD) ((4AZ) c00i.get()).A00.get()).Auy(36591837169713277L));
        if (millis > millis2) {
            1BK.A09(this.A04).D0v("CWJobScheduler-HardMax", 0Pz.A0U("Suggested latency is ", millis));
            j2 = millis2 + millis3;
            i = 0;
        } else {
            j = min + millis3;
            i = 1;
        }
        4CX r02 = new 4CX();
        r02.A00.putInt("__VERSION_CODE", BuildConstants.A01());
        if (j > 0 && j2 > 0) {
            throw AnonymousClass001.A0L("setSoftMaximumLatencyMs(long) and setHardMaximumLatencyMs(long) were both called. You must use one or the other");
        }
        if (min >= 0) {
            if (j < 0 && j2 < 0) {
                throw AnonymousClass001.A0L("You must call setSoftMaximumLatencyMs(long) or setHardMaximumLatencyMs(long)");
            }
            if (j >= 0 && j <= min) {
                throw AnonymousClass001.A0L("setSoftMaximumLatencyMs(long) <= setMinimumLatencyMs(long)");
            }
            if (j2 >= 0 && j2 <= min) {
                throw AnonymousClass001.A0L("setHardMaximumLatencyMs(long) <= setMinimumLatencyMs(long)");
            }
        }
        if (j >= 0 && min < 0) {
            throw AnonymousClass001.A0L("setSoftMaximumLatencyMs(long) <= setMinimumLatencyMs(long)");
        }
        if (j2 >= 0 && min < 0) {
            throw AnonymousClass001.A0L("setHardMaximumLatencyMs(long) <= setMinimumLatencyMs(long)");
        }
        if (min == 0 && j2 == 0) {
            0fH.A0o("JS-ScheduleIncorrect", "JobScheduler cannot be scheduled with an interval (0,0)");
        }
        1XS.A01(r0, r02, 2131365111, i, j2, min, false);
    }
}
