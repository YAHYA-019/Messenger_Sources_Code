package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.2wc, reason: invalid class name */
/* loaded from: 2wc.class */
public final class C2wc {
    public final LightweightQuickPerformanceLogger A00;
    public final Set A01;
    public final CopyOnWriteArraySet A02;
    public final int[] A03;
    public final int[] A04;

    public C2wc(C2wb c2wb, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        11T.A0F(lightweightQuickPerformanceLogger, 1);
        11T.A0F(c2wb, 2);
        this.A00 = lightweightQuickPerformanceLogger;
        C00i c00i = c2wb.A01.A00;
        String BCy = ((2yD) c00i.get()).BCy(36878195521291067L);
        11T.A0A(BCy);
        this.A04 = C2wb.A00(c2wb, BCy).A00();
        String BCy2 = ((2yD) c00i.get()).BCy(36878195521356604L);
        11T.A0A(BCy2);
        this.A03 = C2wb.A00(c2wb, BCy2).A00();
        this.A02 = new CopyOnWriteArraySet();
        this.A01 = new HashSet();
    }
}
