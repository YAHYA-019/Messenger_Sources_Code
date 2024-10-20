package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: X.1cv, reason: invalid class name */
/* loaded from: 1cv.class */
public final class C1cv extends 1Km implements 1UN {
    public 5TS A00;
    public int[] A02;
    public volatile QuickPerformanceLogger A05;
    public final 1Br A04 = 1Bq.A00(84488);
    public final 1Br A03 = 1Bq.A00(16616);
    public HashMap A01 = new HashMap();

    public C1cv() {
        ((1UP) 1Bi.A03(66348)).A01.add(this);
    }

    public static final 5TR A02(C1cv c1cv, 5TQ r302) {
        5TR r305;
        int i = 0;
        if (r302 instanceof 5TP) {
            i = 5510864;
        }
        synchronized (c1cv) {
            if (i == 0) {
                r305 = null;
            } else {
                HashMap hashMap = c1cv.A01;
                11T.A0D(hashMap);
                r305 = (5TR) hashMap.get(Integer.valueOf(i));
            }
        }
        return r305;
    }

    public void AFz() {
        synchronized (this) {
            this.A01 = new HashMap();
        }
        QuickPerformanceLogger quickPerformanceLogger = this.A05;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.updateListenerMarkers();
        }
    }

    public C02S Au6() {
        C02S c02s;
        synchronized (this) {
            int[] iArr = this.A02;
            if (iArr != null) {
                new C02S(Arrays.copyOf(iArr, iArr.length), null);
            } else {
                c02s = null;
            }
        }
        return c02s;
    }

    public void C5i(C03b c03b) {
        11T.A0F(c03b, 0);
        synchronized (this) {
            HashMap hashMap = this.A01;
            11T.A0D(hashMap);
            5TR r0 = (5TR) hashMap.get(Integer.valueOf(c03b.getMarkerId()));
            if (r0 != null) {
                r0.A02 = 0L;
                r0.A00 = 0L;
                r0.A05 = 0L;
                r0.A03 = 0L;
                r0.A01 = 0L;
                r0.A04 = 0L;
            }
        }
    }

    public void Ctc(QuickPerformanceLogger quickPerformanceLogger) {
        11T.A0F(quickPerformanceLogger, 0);
        this.A05 = quickPerformanceLogger;
    }

    public String getName() {
        return "preload_manager";
    }
}
