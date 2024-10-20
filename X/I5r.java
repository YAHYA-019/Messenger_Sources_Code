package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: I5r.class */
public final class I5r {
    public final 1Br A00 = 7zM.A0S();

    public I5r() {
        if (QuickPerformanceLoggerProvider.getQPLInstance() == null) {
            QuickPerformanceLoggerProvider.A00 = 7zP.A0e(this.A00);
        }
    }

    private final void A00(int i, java.util.Map map) {
        Iterator A0y = AnonymousClass001.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            7zP.A0e(this.A00).markerAnnotate(538655551, i, AnonymousClass001.A0j(A0z), 1BK.A16(A0z));
        }
    }

    public void A01(long j) {
        int i = (int) (j & 4294967295L);
        1Br r0 = this.A00;
        7zP.A0e(r0).markerStartWithCancelPolicy(538655551, false, i, -1, TimeUnit.MILLISECONDS);
        QuickPerformanceLogger A0e = 7zP.A0e(r0);
        String str = C0di.A00().A00;
        if (str == null) {
            throw 1BK.A0h();
        }
        A0e.markerAnnotate(538655551, i, "flow_start_process", str);
    }

    public void A02(long j, String str) {
        7zP.A0e(this.A00).markerPoint(538655551, (int) (j & 4294967295L), str);
    }

    public void A03(long j, String str, String str2) {
        11T.A0F(str2, 2);
        7zP.A0e(this.A00).markerAnnotate(538655551, (int) (j & 4294967295L), str, str2);
    }

    public void A04(Integer num, long j) {
        A06(num, AnonymousClass001.A0u(), j);
    }

    public void A05(Integer num, String str, long j) {
        int i = (int) (((int) (j & 4294967295L)) & 4294967295L);
        A00(i, AnonymousClass001.A0u());
        1Br r0 = this.A00;
        7zP.A0e(r0).markerAnnotate(538655551, i, "exception_location", HKm.A00(num));
        if (str != null) {
            7zP.A0e(r0).markerAnnotate(538655551, i, "dropped_on_exception", str);
        }
        7zP.A0e(r0).markerEnd(538655551, i, (short) 3);
    }

    public void A06(Integer num, java.util.Map map, long j) {
        int i = (int) (j & 4294967295L);
        A00(i, map);
        1Br r0 = this.A00;
        7zP.A0e(r0).markerAnnotate(538655551, i, "drop_reason", HKm.A00(num));
        7zP.A0e(r0).markerEnd(538655551, i, (short) 3);
    }

    public final void A07(String str, Long l) {
        if (l != null) {
            int longValue = (int) (l.longValue() & 4294967295L);
            if (!0CV.A0Z(str, "_end", false)) {
                str = 0Pz.A0W(str, "_end");
            }
            7zP.A0e(this.A00).markerPoint(538655551, longValue, str);
        }
    }

    public final void A08(String str, Long l) {
        if (l != null) {
            int longValue = (int) (l.longValue() & 4294967295L);
            if (!0CV.A0Z(str, "_start", false)) {
                str = 0Pz.A0W(str, "_start");
            }
            7zP.A0e(this.A00).markerPoint(538655551, longValue, str);
        }
    }
}
