package X;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Set;

/* renamed from: X.4Jo, reason: invalid class name */
/* loaded from: 4Jo.class */
public final class C4Jo {
    public static final String A02 = 4IS.A01("SystemJobInfoConverter");
    public final ComponentName A00;
    public final C4Ia A01;

    public C4Jo(Context context, C4Ia c4Ia) {
        this.A01 = c4Ia;
        this.A00 = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JobInfo A00(C4Kf c4Kf, int i) {
        int i2;
        C4Ke c4Ke = c4Kf.A0B;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", c4Kf.A0M);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", c4Kf.A0K);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", c4Kf.A06 != 0);
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i, this.A00).setRequiresCharging(c4Ke.A05);
        boolean z = c4Ke.A06;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z).setExtras(persistableBundle);
        Integer num = c4Ke.A02;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30 || num != 0S2.A0j) {
            int intValue = num.intValue();
            if (intValue != 0) {
                i2 = 2;
                if (intValue != 1) {
                    if (intValue != 2) {
                        i2 = 4;
                        if (intValue == 3) {
                            i2 = 3;
                        } else if (intValue != 4) {
                            4IS.A00().A02(A02, 0Pz.A0W("API version too low. Cannot convert network type value ", C4S5.A00(num)));
                        }
                    }
                }
                i2 = 1;
            } else {
                i2 = 0;
            }
            extras.setRequiredNetworkType(i2);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if (!z) {
            extras.setBackoffCriteria(c4Kf.A03, c4Kf.A0F == 0S2.A01 ? 0 : 1);
        }
        long max = Math.max(c4Kf.A00() - System.currentTimeMillis(), 0L);
        if (i3 <= 28 || max > 0) {
            extras.setMinimumLatency(max);
        } else if (!c4Kf.A0J) {
            extras.setImportantWhileForeground(true);
        }
        Set<4UJ> set = c4Ke.A03;
        if (!set.isEmpty()) {
            for (4UJ r0 : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(r0.A00, r0.A01 ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(c4Ke.A01);
            extras.setTriggerContentMaxDelay(c4Ke.A00);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(c4Ke.A04);
        extras.setRequiresStorageNotLow(c4Ke.A07);
        byte b = c4Kf.A02 > 0;
        byte b2 = max > 0;
        if (i3 >= 31 && c4Kf.A0J && b == false && b2 == false) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
