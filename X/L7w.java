package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.facebook.voltron.download.scheduledinstaller.OxygenScheduledInstallerJobService;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/* loaded from: L7w.class */
public final class L7w {
    public static final long A00(int i) {
        Calendar calendar = Calendar.getInstance();
        11T.A0A(calendar);
        calendar.add(5, 1);
        calendar.set(11, i);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis() - System.currentTimeMillis();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0073, code lost:
    
        if ("com.android.vending".equals(r306) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A01(android.content.Context r301) {
        /*
            r0 = r301
            java.lang.String r0 = r0.getPackageName()
            r302 = r0
            r0 = r302
            X.11T.A0A(r0)
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3e
            r303 = r0
            r0 = 30
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 < r1) goto L2d
            r0 = r301
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3e
            r305 = r0
            r0 = r305
            r1 = r302
            android.content.pm.InstallSourceInfo r0 = r0.getInstallSourceInfo(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3e
            r305 = r0
            r0 = r305
            java.lang.String r0 = r0.getInstallingPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3e
            r306 = r0
            goto L5a
        L2d:
            r0 = r301
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3e
            r305 = r0
            r0 = r305
            r1 = r302
            java.lang.String r0 = r0.getInstallerPackageName(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3e
            r306 = r0
            goto L5a
        L3e:
            r307 = move-exception
            java.lang.String r0 = "Could not find installer package name for "
            r1 = r302
            java.lang.String r0 = X.0Pz.A0W(r0, r1)
            r306 = r0
            java.lang.String r0 = "OxygenScheduledInstallerJobService"
            r305 = r0
            r0 = r305
            r1 = r306
            r2 = r307
            X.0fH.A0s(r0, r1, r2)
            r0 = 0
            r303 = r0
            r0 = 0
            r306 = r0
        L5a:
            java.util.ArrayList r0 = X.C2tc.A00
            r305 = r0
            r0 = r306
            if (r0 == 0) goto L76
            java.lang.String r0 = "com.android.vending"
            r305 = r0
            r0 = r305
            r1 = r306
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L7b
        L76:
            r0 = 0
            r304 = r0
            r0 = 0
            r305 = r0
        L7b:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L7w.A01(android.content.Context):boolean");
    }

    public final void A02(Context context, 1Fe r303, List list) {
        int A05 = 7zP.A05(context, r303, 0);
        long A00 = A00(0);
        Long valueOf = Long.valueOf(A00);
        long A002 = A00(6);
        Long valueOf2 = Long.valueOf(A002);
        if (list.isEmpty()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC00051a0 AP5 = r303.A00("AppModules::ScheduledInstallRequestTimestamp").AP5();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AP5.CaG(AnonymousClass001.A0i(it), currentTimeMillis);
        }
        AP5.apply();
        JobInfo.Builder persisted = new JobInfo.Builder(2131366222, new ComponentName(context, (Class<?>) OxygenScheduledInstallerJobService.class)).setRequiredNetworkType(A05).setRequiresDeviceIdle(true).setRequiresCharging(true).setPersisted(true);
        if (valueOf != null) {
            persisted.setMinimumLatency(A00);
        }
        if (valueOf2 != null) {
            persisted.setOverrideDeadline(A002);
        }
        Object systemService = context.getSystemService("jobscheduler");
        11T.A0I(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        ((JobScheduler) systemService).schedule(persisted.build());
    }
}
