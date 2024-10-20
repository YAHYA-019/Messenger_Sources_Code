package com.facebook.analytics2.logger;

import X.05X;
import X.0FI;
import X.0Pz;
import X.0fH;
import X.1BK;
import X.3G9;
import X.49O;
import X.4EL;
import X.7zO;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C08o;
import X.C1lR;
import X.C3o5;
import X.C5ej;
import X.DKD;
import X.JUd;
import X.LTD;
import X.RI0;
import X.Rh8;
import android.app.AlarmManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.facebook.common.build.BuildConstants;
import com.facebook.common.gcmcompat.OneoffTask;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: GooglePlayUploadService.class */
public class GooglePlayUploadService extends JUd {
    public static boolean A01;
    public static boolean A02;
    public static final long A03;
    public static final long A04;
    public static final AtomicInteger A05;
    public 49O A00;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        A04 = timeUnit.toMillis(2);
        A03 = timeUnit.toMillis(5);
        A05 = DKD.A14();
    }

    public static void A01(Context context) {
        synchronized (GooglePlayUploadService.class) {
            if (!A02) {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) GooglePlayUploadService.class), 1, 1);
                A02 = true;
            }
        }
    }

    public static void A03(Context context, OneoffTask oneoffTask, int i) {
        int A042 = GoogleApiAvailability.A00.A04(context, 12451000);
        if (A042 == 0) {
            try {
                Rh8.A01(context).A03(oneoffTask);
            } catch (IllegalArgumentException e) {
                3G9.A00(new ComponentName(context, oneoffTask.A04), context, e);
            }
            A05.set(0);
            return;
        }
        int incrementAndGet = A05.incrementAndGet();
        AtomicBoolean atomicBoolean = GooglePlayServicesUtil.A02;
        if (incrementAndGet == 3) {
            0fH.A18("GooglePlayUploadService", "Google Play Services became consistently unavailable after initial check: %s", new Object[]{ConnectionResult.A00(A042)});
            return;
        }
        0fH.A0h(ConnectionResult.A00(A042), "GooglePlayUploadService", "Scheduling Google Play Services retry due to: %s");
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        05X r0 = new 05X();
        Intent action = C3o5.A0D(context, GooglePlayUploadService.class).setAction(0Pz.A0T("com.facebook.analytics2.logger.gms.TRY_SCHEDULE-", i));
        Bundle A052 = 1BK.A05();
        A052.putInt("job_id", i);
        A052.putParcelable("task", oneoffTask);
        action.putExtras(A052);
        r0.A0D(action, context.getClassLoader());
        alarmManager.set(2, SystemClock.elapsedRealtime() + A03, r0.A03(context, 0, 134217728));
    }

    public int A05(RI0 ri0) {
        try {
            Bundle bundle = ri0.A00;
            if (bundle == null) {
                0fH.A0k("GooglePlayUploadService", "Job with no build ID, cancelling job");
                return 2;
            }
            int i = bundle.getInt("__VERSION_CODE", 0);
            int A012 = BuildConstants.A01();
            if (A012 != i) {
                0fH.A14("GooglePlayUploadService", "Job with old build ID: %d, cancelling job, expected: %d", new Object[]{Integer.valueOf(i), Integer.valueOf(A012)});
                return 2;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            try {
                int parseInt = Integer.parseInt(ri0.A01.split("-", 3)[2]);
                C1lR c1lR = new C1lR(bundle);
                String string = bundle.getString("action");
                LTD ltd = new LTD();
                this.A00.A06(c1lR, ltd, string, parseInt, 1);
                try {
                    long uptimeMillis2 = A04 - (SystemClock.uptimeMillis() - uptimeMillis);
                    while (true) {
                        try {
                            break;
                        } catch (InterruptedException unused) {
                            uptimeMillis2 = (SystemClock.uptimeMillis() + uptimeMillis2) - SystemClock.uptimeMillis();
                        }
                    }
                    if (ltd.A00.await(uptimeMillis2, TimeUnit.MILLISECONDS)) {
                        return ltd.A01 ? 1 : 0;
                    }
                    throw new TimeoutException();
                } catch (TimeoutException unused2) {
                    this.A00.A04(parseInt);
                    return 1;
                }
            } catch (RuntimeException e) {
                throw new Exception(e.getMessage());
            }
        } catch (NumberFormatException | 4EL e2) {
            0fH.A0u("GooglePlayUploadService", "Misunderstood job extras: %s", e2);
            return 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate() {
        int A00 = C08o.A00(this, -1030730689);
        int A042 = 0FI.A04(56126258);
        super.onCreate();
        this.A00 = 49O.A00(this);
        0FI.A0A(-2029516456, A042);
        C08o.A02(-1794153451, A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int onStartCommand(Intent intent, int i, int i2) {
        Throwable th;
        int onStartCommand;
        int i3;
        int A012 = C08o.A01(this, 906668551);
        int A042 = 0FI.A04(-1634905976);
        try {
            if (intent != 0) {
                String action = intent.getAction();
                if (!action.startsWith("com.facebook.analytics2.logger.gms.TRY_SCHEDULE")) {
                    if (action.startsWith(AnonymousClass000.A00(183))) {
                        onStartCommand = this.A00.A03(intent, new C5ej(this, i2), 1);
                        0FI.A0A(-557809962, A042);
                        i3 = -2136983241;
                    } else {
                        onStartCommand = super.onStartCommand(intent, i, i2);
                        0FI.A0A(370297991, A042);
                        i3 = 509528996;
                    }
                    C08o.A03(i3, A012);
                    return onStartCommand;
                }
                Bundle extras = intent.getExtras();
                int i4 = extras.getInt("job_id", -1);
                if (i4 != -1) {
                    OneoffTask oneoffTask = (OneoffTask) extras.getParcelable("task");
                    if (oneoffTask != null) {
                        A03(this, oneoffTask, i4);
                        0FI.A0A(-229868435, A042);
                        C08o.A03(-758250566, A012);
                        return 2;
                    }
                    new Exception("Missing task");
                } else {
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("Invalid job_id: ");
                    new Exception(AnonymousClass001.A0a(extras.get("job_id"), A0k));
                }
            } else {
                new Exception("Received a null intent, did you ever return START_STICKY?");
                0FI.A0A(-477882720, A042);
                C08o.A03(456369191, A012);
            }
            throw th;
        } catch (4EL unused) {
            0fH.A17("GooglePlayUploadService", "Unexpected service start parameters: %s", 7zO.A1a(intent));
            stopSelf(i2);
            0FI.A0A(-1309388429, A042);
            C08o.A03(1723483272, A012);
            return 2;
        }
    }
}
