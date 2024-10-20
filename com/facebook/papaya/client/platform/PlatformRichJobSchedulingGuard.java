package com.facebook.papaya.client.platform;

import X.7zN;
import X.AnonymousClass001;
import X.JQx;
import X.Khg;
import X.KyK;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;
import com.google.common.base.Preconditions;
import java.util.HashMap;
import java.util.Map;

/* loaded from: PlatformRichJobSchedulingGuard.class */
public final class PlatformRichJobSchedulingGuard {
    public JobScheduler A00;
    public ComponentName A01;
    public int A02 = 0;
    public final Map A03 = JQx.A13();

    public void A00() {
        synchronized (this) {
            this.A02++;
        }
    }

    public void A01() {
        synchronized (this) {
            int i = this.A02;
            Preconditions.checkState(AnonymousClass001.A1P(i));
            int i2 = i - 1;
            this.A02 = i2;
            if (i2 == 0) {
                JobScheduler jobScheduler = this.A00;
                if (jobScheduler != null) {
                    HashMap A0u = AnonymousClass001.A0u();
                    for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                        A0u.put(Integer.valueOf(jobInfo.getId()), jobInfo);
                    }
                    int i3 = 771751936;
                    do {
                        Map map = this.A03;
                        if (map.containsKey(Integer.valueOf(i3))) {
                            Khg khg = (Khg) 7zN.A0r(map, i3);
                            if (this.A00 != null) {
                                ComponentName componentName = this.A01;
                                if (componentName != null) {
                                    int i4 = khg.A01.A00;
                                    JobInfo.Builder builder = new JobInfo.Builder(i4, componentName);
                                    PersistableBundle persistableBundle = new PersistableBundle();
                                    long j = khg.A00;
                                    long max = Math.max(KyK.A00, j);
                                    boolean A1Q = AnonymousClass001.A1Q(2, i4 & 2);
                                    builder.setRequiresCharging(A1Q);
                                    boolean A1Q2 = AnonymousClass001.A1Q(4, i4 & 4);
                                    if (A1Q2) {
                                        builder.setRequiredNetworkType(2);
                                    } else {
                                        builder.setRequiredNetworkType(1);
                                    }
                                    boolean z = true;
                                    if (1 == (i4 & 1)) {
                                        builder.setRequiresDeviceIdle(true);
                                    } else {
                                        z = false;
                                    }
                                    builder.setExtras(persistableBundle);
                                    builder.setMinimumLatency(max);
                                    try {
                                        this.A00.schedule(builder.build());
                                        PlatformLog.A02(KyK.class, String.format("Scheduled execution with job scheduler, id=0x%08X, idle=%s, WiFi=%s, external power=%s, delay=%d", Integer.valueOf(i4), z ? "y" : "n", A1Q2 ? "y" : "n", A1Q ? "y" : "n", Long.valueOf(j)), new Object[0]);
                                    } catch (Exception e) {
                                        PlatformLog.A01(KyK.class, e.toString(), new Object[0]);
                                    }
                                }
                            }
                            i3++;
                        } else {
                            if (this.A00 != null) {
                                Integer valueOf = Integer.valueOf(i3);
                                if (A0u.containsKey(valueOf)) {
                                    try {
                                        this.A00.cancel(i3);
                                        PlatformLog.A02(KyK.class, String.format("Cancelled execution with job scheduler, id=0x%08X", valueOf), new Object[0]);
                                    } catch (Exception e2) {
                                        PlatformLog.A01(KyK.class, e2.toString(), new Object[0]);
                                    }
                                }
                            }
                            i3++;
                        }
                    } while (i3 < 771752191);
                }
                this.A00 = null;
                this.A01 = null;
            }
        }
    }
}
