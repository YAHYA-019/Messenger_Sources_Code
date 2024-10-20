package com.facebook.papaya.client.platform;

import X.1hM;
import X.AnonymousClass001;
import X.C0il;
import X.KfU;
import X.Khg;
import X.KyK;
import X.LfN;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import java.util.Map;

/* loaded from: Platform.class */
public final class Platform {
    public static final Class TAG;

    static {
        C0il.A0B("papaya");
        TAG = Platform.class;
    }

    public static void cancelExecution(Context context) {
        if (context == null) {
            PlatformLog.A01(Platform.class, "Fail to cancel the execution: context is null!", AnonymousClass001.A1Z());
            return;
        }
        PlatformRichJobSchedulingGuard platformRichJobSchedulingGuard = KyK.A01;
        platformRichJobSchedulingGuard.A00();
        synchronized (platformRichJobSchedulingGuard) {
            if (platformRichJobSchedulingGuard.A00 == null) {
                platformRichJobSchedulingGuard.A00 = (JobScheduler) context.getSystemService("jobscheduler");
            }
            platformRichJobSchedulingGuard.A03.clear();
        }
        LfN.A00(1hM.A01, platformRichJobSchedulingGuard, 17);
    }

    public static void onRunFinished() {
        synchronized (Platform.class) {
            PlatformLog.A02(Platform.class, "Finished Papaya execution", AnonymousClass001.A1Z());
            KyK.A01.A01();
        }
    }

    public static void onRunStarted() {
        synchronized (Platform.class) {
            PlatformLog.A02(Platform.class, "Performing Papaya execution", AnonymousClass001.A1Z());
            KyK.A01.A00();
        }
    }

    public static void onSchedulingFinished() {
        synchronized (Platform.class) {
            KyK.A01.A01();
        }
    }

    public static void onSchedulingStarted() {
        synchronized (Platform.class) {
            KyK.A01.A00();
        }
    }

    public static boolean scheduleExecution(Context context, ComponentName componentName, boolean z, boolean z2, boolean z3, long j) {
        if (context == null) {
            PlatformLog.A01(Platform.class, "Fail to schedule execution: context is null!", new Object[0]);
            return false;
        }
        PlatformRichJobSchedulingGuard platformRichJobSchedulingGuard = KyK.A01;
        platformRichJobSchedulingGuard.A00();
        synchronized (platformRichJobSchedulingGuard) {
            if (platformRichJobSchedulingGuard.A00 == null) {
                platformRichJobSchedulingGuard.A00 = (JobScheduler) context.getSystemService("jobscheduler");
            }
            if (platformRichJobSchedulingGuard.A01 == null) {
                platformRichJobSchedulingGuard.A01 = componentName;
            }
            int i = 771751936;
            if (z) {
                i = 771751937;
            }
            int i2 = i & (-5);
            if (z2) {
                i2 = i | 4;
            }
            int i3 = i2 & (-3);
            if (z3) {
                i3 = i2 | 2;
            }
            KfU kfU = new KfU(i3);
            Map map = platformRichJobSchedulingGuard.A03;
            Integer valueOf = Integer.valueOf(kfU.A00);
            if (map.containsKey(valueOf)) {
                j = Math.min(j, ((Khg) map.get(valueOf)).A00);
            }
            map.put(valueOf, new Khg(kfU, j));
        }
        LfN.A00(1hM.A01, platformRichJobSchedulingGuard, 17);
        return true;
    }
}
