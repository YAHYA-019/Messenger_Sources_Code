package X;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.facebook.bugreporter.core.scheduler.AlarmsBroadcastReceiver;
import com.facebook.common.build.BuildConstants;
import com.facebook.inject.FbInjector;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4V4, reason: invalid class name */
/* loaded from: 4V4.class */
public final class C4V4 {
    public static final String A03 = C4V4.class.getName();
    public static final long A04 = TimeUnit.MINUTES.toMillis(15);
    public final 1BP A02 = FbInjector.A00;
    public final 1Br A01 = 1Bq.A00(67208);
    public final 1Br A00 = 1Bq.A00(66184);

    public final void A00(long j, long j2) {
        IllegalArgumentException A0L;
        C00i c00i = this.A01.A00;
        1XS r0 = (1XS) c00i.get();
        if (r0 != null) {
            r0.A02(2131365110);
        }
        Context context = FbInjector.A03;
        11T.A0A(context);
        Intent A0D = C3o5.A0D(context, AlarmsBroadcastReceiver.class);
        A0D.setAction("com.facebook.bugreporter.core.scheduler.AlarmsBroadcastReceiver.RETRY_UPLOAD");
        05X r02 = new 05X();
        Context context2 = FbInjector.A03;
        11T.A0A(context2);
        r02.A0D(A0D, context2.getClassLoader());
        Context context3 = FbInjector.A03;
        11T.A0A(context3);
        PendingIntent A02 = r02.A02(context3, 0, 0);
        C00i c00i2 = this.A00.A00;
        ((1Py) c00i2.get()).A01(A02);
        if (c00i.get() == null) {
            Context context4 = FbInjector.A03;
            11T.A0A(context4);
            Intent A0D2 = C3o5.A0D(context4, AlarmsBroadcastReceiver.class);
            A0D2.setAction("com.facebook.bugreporter.core.scheduler.AlarmsBroadcastReceiver.RETRY_UPLOAD");
            05X r03 = new 05X();
            Context context5 = FbInjector.A03;
            11T.A0A(context5);
            r03.A0D(A0D2, context5.getClassLoader());
            Context context6 = FbInjector.A03;
            11T.A0A(context6);
            ((1Py) c00i2.get()).A00(3, SystemClock.elapsedRealtime() + (60000 * j), r03.A02(context6, 0, 0));
            0fH.A0g(Long.valueOf(j), A03, "Scheduled next run using Alarms after %d minutes.");
            return;
        }
        long millis = TimeUnit.MINUTES.toMillis(j);
        long j3 = -1;
        long j4 = -1;
        if (j2 == j3) {
            j3 = millis + A04;
        } else {
            j4 = millis + j2;
        }
        try {
            1XS r04 = (1XS) c00i.get();
            if (r04 != null) {
                4CX r05 = new 4CX();
                r05.A00.putInt("__VERSION_CODE", BuildConstants.A01());
                if (j3 <= 0 || j4 <= 0) {
                    if (millis >= 0) {
                        if (j3 < 0 && j4 < 0) {
                            A0L = AnonymousClass001.A0L("You must call setSoftMaximumLatencyMs(long) or setHardMaximumLatencyMs(long)");
                        } else if (j3 >= 0 && j3 <= millis) {
                            A0L = AnonymousClass001.A0L("setSoftMaximumLatencyMs(long) <= setMinimumLatencyMs(long)");
                        } else if (j4 >= 0 && j4 <= millis) {
                            A0L = AnonymousClass001.A0L("setHardMaximumLatencyMs(long) <= setMinimumLatencyMs(long)");
                        }
                    }
                    if (j3 >= 0 && millis < 0) {
                        A0L = AnonymousClass001.A0L("setSoftMaximumLatencyMs(long) <= setMinimumLatencyMs(long)");
                    } else {
                        if (j4 < 0 || millis >= 0) {
                            if (millis == 0 && j4 == 0) {
                                0fH.A0o("JS-ScheduleIncorrect", "JobScheduler cannot be scheduled with an interval (0,0)");
                            }
                            1XS.A01(r04, r05, 2131365110, 1, j4, millis, true);
                            return;
                        }
                        A0L = AnonymousClass001.A0L("setHardMaximumLatencyMs(long) <= setMinimumLatencyMs(long)");
                    }
                } else {
                    A0L = AnonymousClass001.A0L("setSoftMaximumLatencyMs(long) and setHardMaximumLatencyMs(long) were both called. You must use one or the other");
                }
                throw A0L;
            }
        } catch (IllegalArgumentException e) {
            Context context7 = FbInjector.A03;
            11T.A0A(context7);
            Context context8 = FbInjector.A03;
            11T.A0A(context8);
            3G9.A00(new ComponentName(context8, A03), context7, e);
        }
    }
}
