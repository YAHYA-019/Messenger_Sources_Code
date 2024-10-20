package X;

import com.facebook.inject.FbInjector;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.47j, reason: invalid class name */
/* loaded from: 47j.class */
public final class C47j {
    public final C00i A06 = new 1BQ(84488);
    public final C00i A04 = new 1BQ(16511);
    public final C00i A05 = new 1BQ(16385);
    public final C00i A03 = new 1BQ(16387);
    public final C00i A07 = new 1BQ(32915);
    public final java.util.Map A08 = Collections.synchronizedMap(new HashMap());
    public final java.util.Map A09 = Collections.synchronizedMap(new HashMap());
    public final AtomicLong A0A = new AtomicLong(0);
    public final C47l A01 = new C47l() { // from class: X.47k
        @Override // X.C47l
        public long now() {
            return ((C0dr) C47j.this.A06.get()).now();
        }
    };
    public final C47n A02 = new C47n() { // from class: X.47m
        @Override // X.C47n
        public void Ca5(String str, String str2) {
            C47j.this.A04.get();
        }

        @Override // X.C47n
        public void Cg0(String str, String str2, Throwable th) {
            1BK.A09(C47j.this.A04).softReport(str, str2, th);
        }
    };
    public boolean A00 = false;

    public static C47r A00(C47j c47j, int i, long j, boolean z, boolean z2) {
        Integer valueOf;
        int i2;
        synchronized (c47j) {
            long j2 = ((1Od) 1Bi.A03(16616)).A0f;
            AtomicLong atomicLong = c47j.A0A;
            if (j2 != atomicLong.get()) {
                c47j.A09.clear();
                atomicLong.set(j2);
            }
        }
        synchronized (c47j) {
            java.util.Map map = c47j.A08;
            valueOf = Integer.valueOf(i);
            Integer num = (Integer) map.get(valueOf);
            i2 = 1;
            if (num != null) {
                i2 = 1 + num.intValue();
            }
            map.put(valueOf, Integer.valueOf(i2));
        }
        C47o c47o = (C47o) 1Bi.A03(32914);
        QuickPerformanceLogger quickPerformanceLogger = (QuickPerformanceLogger) 1Bi.A03(16520);
        C0dp c0dp = (C0dp) 1Bi.A03(99390);
        3zV r0 = (3zV) 1Bi.A03(32848);
        C2mT c2mT = (C2mT) 1Bi.A03(17093);
        45R A00 = 45R.A00();
        C47l c47l = c47j.A01;
        C47n c47n = c47j.A02;
        C47p c47p = (C47p) c47j.A07.get();
        synchronized (c47j) {
            java.util.Map map2 = c47j.A09;
            Integer num2 = (Integer) map2.get(valueOf);
            int i3 = 1;
            if (num2 != null) {
                i3 = 1 + num2.intValue();
            }
            map2.put(valueOf, Integer.valueOf(i3));
        }
        long j3 = r0.A04;
        long j4 = r0.A03;
        String str = r0.A00;
        ((2yD) c47j.A05.get()).AZk(36314262020497197L);
        C47r c47r = new C47r(c2mT, c47o, c47p, c47l, c47n, A00, c0dp, quickPerformanceLogger, str, i, i2, j, j3, j4, z, z2);
        45R.A00().A03(c47r);
        if (!c47j.A00) {
            c47j.A00 = true;
            if (!((2yD) c47j.A03.get()).AZk(72340653860917217L)) {
                1P9 r02 = new 1P9((1I7) 1Hv.A02(FbInjector.A00(), 65728));
                r02.A05(new 4WH(c47j, 0), "com.facebook.common.appstate.AppStateManager.USER_LEFT_APP");
                r02.A02().A00();
            }
        }
        return c47r;
    }

    public static C7z0 A01(int i) {
        C47t c47t;
        45R A00 = 45R.A00();
        synchronized (A00) {
            c47t = (C47t) A00.A00.get(i);
        }
        return (C7z0) c47t;
    }

    public C47r A02(int i) {
        return A00(this, i, ((C0dr) this.A06.get()).now(), true, true);
    }

    public C47r A03(int i, boolean z, boolean z2) {
        return A00(this, i, ((C0dr) this.A06.get()).now(), z, z2);
    }
}
