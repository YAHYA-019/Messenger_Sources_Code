package X;

import com.facebook.perf.background.BackgroundStartupDetector;
import java.util.List;

/* renamed from: X.0ql, reason: invalid class name */
/* loaded from: 0ql.class */
public final class C0ql implements 0lQ {
    public static final List A01 = AnonymousClass001.A0s();
    public C0i0 A00;

    public void Bpe(int i, boolean z) {
        synchronized (this) {
            C0i0 c0i0 = this.A00;
            if (c0i0 != null) {
                C0hr c0hr = c0i0.A00;
                synchronized (c0hr.A0L) {
                    C0ql c0ql = c0hr.A08;
                    if (c0ql == null) {
                        0fH.A0n("lacrima", "AppStartModeBridge not initialized");
                    } else {
                        int i2 = BackgroundStartupDetector.A0F;
                        Integer num = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? 0S2.A0Y : 0S2.A0j : 0S2.A0C : 0S2.A0N : 0S2.A01;
                        c0hr.A02 = num;
                        if (num != 0S2.A01) {
                            Integer num2 = 0S2.A0j;
                            if (((num == num2 || (num != 0S2.A0Y && num != 0S2.A0N && num != 0S2.A0C)) && num == num2) || num == 0S2.A0N) {
                                synchronized (c0ql) {
                                    if (c0ql.A00 != null) {
                                        BackgroundStartupDetector.A0E.remove(c0ql);
                                    }
                                    c0ql.A00 = null;
                                }
                            }
                            char A00 = C0fj.A00(c0hr.A02);
                            C0pu c0pu = c0hr.A00;
                            if (c0pu == null) {
                                0fH.A0n("lacrima", "AppStateLogFile not initialized.");
                            } else {
                                c0pu.A06(A00);
                            }
                        }
                    }
                }
            }
        }
    }

    public void C2O(Boolean bool) {
    }
}
