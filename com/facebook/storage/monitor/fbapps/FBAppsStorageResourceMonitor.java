package com.facebook.storage.monitor.fbapps;

import X.0S2;
import X.0Zi;
import X.11T;
import X.1BK;
import X.1BQ;
import X.1Bi;
import X.1G0;
import X.1G2;
import X.1Qf;
import X.1Ql;
import X.2HT;
import X.C00i;
import X.C01s;
import X.C03h;
import X.C0dp;
import X.C0t9;
import android.content.Context;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: FBAppsStorageResourceMonitor.class */
public final class FBAppsStorageResourceMonitor {
    public static final 1G2 A0A;
    public static final 1G2 A0B;
    public static final 1G2 A0C;
    public static final 1G2 A0D;
    public long A00;
    public ScheduledFuture A01;
    public final C01s A02;
    public final C03h A03;
    public final LightweightQuickPerformanceLogger A04;
    public final Runnable A05;
    public final Map A06;
    public final ScheduledExecutorService A07;
    public final C0dp A08;
    public final C00i A09;

    static {
        1G2 r0 = 1G0.A06;
        A0C = r0.A0D("storage.low_space_time");
        A0A = r0.A0D("storage.did_enter_low_space");
        A0D = r0.A0D("storage.very_low_space_time");
        A0B = r0.A0D("storage.did_enter_very_low_space");
    }

    public FBAppsStorageResourceMonitor() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) 1Bi.A03(16464);
        C03h c03h = (C03h) 1Bi.A03(115118);
        C01s c01s = (C01s) 1Bi.A03(16511);
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = (LightweightQuickPerformanceLogger) 1Bi.A03(68406);
        this.A00 = 0L;
        this.A07 = scheduledExecutorService;
        this.A03 = c03h;
        this.A02 = c01s;
        this.A04 = lightweightQuickPerformanceLogger;
        this.A06 = new HashMap();
        this.A05 = new 1Qf(this);
        this.A08 = (C0dp) 1Bi.A03(99390);
        this.A09 = new 1BQ(33013);
    }

    private boolean A00(1G2 r302, long j, long j2) {
        C00i c00i = this.A09;
        long Av1 = ((FbSharedPreferences) c00i.get()).Av1(r302, 0L);
        long now = this.A08.now();
        if (now - TimeUnit.DAYS.toMillis(j) >= Av1) {
            if (C03h.A01().A06(0S2.A00) >= j2) {
                return false;
            }
            1Ql edit = ((FbSharedPreferences) c00i.get()).edit();
            edit.CaH(r302, now);
            edit.commit();
        }
        return true;
    }

    private boolean A01(1G2 r302, long j, long j2) {
        C00i c00i = this.A09;
        boolean AZn = 1BK.A0R(c00i).AZn(r302, false);
        long A06 = C03h.A01().A06(0S2.A00);
        if (AZn) {
            if (A06 > j2) {
                1Ql.A03(r302, c00i.get(), false);
                return false;
            }
        } else {
            if (A06 >= j) {
                return false;
            }
            1Ql.A03(r302, c00i.get(), true);
        }
        return true;
    }

    public void A02(2HT r302) {
        try {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A04;
            lightweightQuickPerformanceLogger.markerStart(43253762);
            Map map = this.A06;
            synchronized (map) {
                map.put(r302, 1);
            }
            lightweightQuickPerformanceLogger.markerEnd(43253762, (short) 2);
        } catch (Throwable th) {
            this.A04.markerEnd(43253762, (short) 2);
            throw th;
        }
    }

    public boolean A03() {
        boolean z;
        Context A00 = FbInjector.A00();
        11T.A0F(A00, 0);
        C0t9 A01 = 0Zi.A01(A00);
        long j = A01.A1p;
        long j2 = A01.A1q;
        if (j > 0) {
            z = A00(A0C, j, j2);
        } else {
            long j3 = A01.A1r;
            if (j2 > 0 && j3 > 0) {
                return A01(A0A, j2, j3);
            }
            z = false;
            if (this.A03.A06(0S2.A00) < OdexSchemeArtXdex.MIN_DISK_FREE_FOR_MIXED_MODE) {
                return true;
            }
        }
        return z;
    }

    public boolean A04() {
        boolean z;
        Context A00 = FbInjector.A00();
        11T.A0F(A00, 0);
        C0t9 A01 = 0Zi.A01(A00);
        long j = A01.A1s;
        long j2 = A01.A1t;
        if (j > 0) {
            z = A00(A0D, j, j2);
        } else {
            long j3 = A01.A1u;
            if (j2 > 0 && j3 > 0) {
                return A01(A0B, j2, j3);
            }
            z = false;
            if (this.A03.A06(0S2.A00) < 104857600) {
                return true;
            }
        }
        return z;
    }
}
