package X;

import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3TG, reason: invalid class name */
/* loaded from: 3TG.class */
public final class C3TG {
    public final int A04;
    public final 3QA A05;
    public final 3AN[] A06;
    public final AtomicInteger A07 = new AtomicInteger();
    public int A00 = -1;
    public int A01 = 1;
    public Exception A02 = null;
    public boolean A03 = false;

    public C3TG(3QA r302, 3AN[] r303, int i) {
        this.A04 = i;
        this.A05 = r302;
        this.A06 = r303;
    }

    public static int A00(C3TG c3tg, Exception exc, int i) {
        synchronized (c3tg) {
            if (i == 1 && exc != null) {
                0fH.A0x("DownloadStateHandler", "Result should not be SUCCESS when exception != null", exc);
                i = 2;
            }
            if (c3tg.A01 == 1) {
                c3tg.A01 = i;
            }
            if (c3tg.A02 == null) {
                c3tg.A02 = exc;
            }
        }
        return i;
    }

    private void A01() {
        synchronized (this) {
            if (!this.A03) {
                3AM[] r0 = this.A06;
                int i = 0;
                do {
                    3AM r02 = r0[i];
                    3QA r03 = this.A05;
                    int i2 = this.A01;
                    Exception exc = this.A02;
                    if (r02 instanceof 3AM) {
                        3AM r04 = r02;
                        int i3 = 3;
                        if (i2 == 1) {
                            i3 = 1;
                        } else if (i2 != 3) {
                            i3 = 2;
                        }
                        C2u7 c2u7 = r04.A01;
                        if (c2u7 != null) {
                            0fH.A0g(r03.A02, "SideloadQplListener", "onCompleteDownloadModule - %s");
                            if (exc != null && exc.getMessage() != null) {
                                c2u7.A00.markerAnnotate(11345739, r03.A00, "exception", exc.getMessage());
                            }
                            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = c2u7.A00;
                            int i4 = r03.A00;
                            short s = 3;
                            if (i3 == 1) {
                                s = 2;
                            }
                            lightweightQuickPerformanceLogger.markerEnd(11345739, i4, s);
                        }
                        r04.A00.A01(new C3O1(exc, null, i3));
                    }
                    i++;
                } while (i < 2);
                this.A03 = true;
            }
        }
    }

    public void A02(03H r302, Exception exc, int i) {
        3AL[] r0 = this.A06;
        int i2 = 0;
        do {
            3AL r02 = r0[i2];
            String str = r302.A03;
            if (r02 instanceof 3AL) {
                r02.A00.A07(str, i == 1 ? 0S2.A0C : 0S2.A0N);
            }
            i2++;
        } while (i2 < 2);
        synchronized (this) {
            A00(this, exc, i);
            int incrementAndGet = this.A07.incrementAndGet();
            int i3 = this.A00;
            if (i3 < 0) {
                i3 = this.A05.A02.size();
            }
            if (incrementAndGet == i3) {
                A01();
            }
        }
    }

    public void A03(IOException iOException, int i, int i2) {
        for (int i3 = 0; i3 < 2; i3++) {
        }
        synchronized (this) {
            Integer valueOf = Integer.valueOf(i2);
            0fH.A0g(valueOf, "DownloadStateHandler", "setDownloadCount: %d");
            Set set = this.A05.A02;
            if (i2 != set.size()) {
                0fH.A17("DownloadStateHandler", "Expected metadata for %d modules, got %d", new Object[]{Integer.valueOf(set.size()), valueOf});
            }
            this.A00 = i2;
            if (A00(this, iOException, i) != 1) {
                A01();
            }
        }
    }

    public void A04(Exception exc, int i) {
        synchronized (this) {
            A00(this, exc, i);
            A01();
        }
    }
}
