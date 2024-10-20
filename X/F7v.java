package X;

import android.content.Context;
import com.facebook.forker.Process;
import com.facebook.privacy.e2ee.genericimpl.store.PublicKeyStoreImplKt;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: F7v.class */
public final class F7v {
    public static final AtomicInteger A03 = DKD.A14();
    public final int A00;
    public final QuickPerformanceLogger A01;
    public final java.util.Map A02 = new 0QO(0);

    public F7v(Context context, QuickPerformanceLogger quickPerformanceLogger) {
        this.A01 = quickPerformanceLogger;
        this.A00 = KyM.A00(context);
    }

    public void A00(FyG fyG, String str) {
        java.util.Map map = this.A02;
        Fwd fwd = (Fwd) map.remove(str);
        if (fwd != null) {
            int i = fwd.A04;
            double d = fwd.A00;
            long j = fwd.A05;
            QuickPerformanceLogger quickPerformanceLogger = fwd.A09;
            int i2 = fwd.A07;
            MarkerEditor withMarker = quickPerformanceLogger.withMarker(36713009, i2);
            withMarker.annotate("sfd", i);
            withMarker.annotate("lfd", d);
            withMarker.annotate(PublicKeyStoreImplKt.KEYS_UPDATE_TIMESTAMP, TimeUnit.NANOSECONDS.toMillis(j));
            withMarker.annotate("max_cac", fwd.A03);
            withMarker.annotate("bloks_logging_id", fwd.A0C);
            withMarker.annotate("module", fwd.A0A);
            withMarker.annotate(7zK.A00(Process.SD_BLACK_HOLE), fwd.A0B);
            withMarker.markerEditingCompleted();
            fwd.A01 = -1;
            fwd.A06 = false;
            quickPerformanceLogger.markerEnd(36713009, i2, (short) 2);
            List list = FJ6.A02(fyG).A0F;
            synchronized (list) {
                list.remove(fwd);
            }
            Iterator A1A = 1BK.A1A(map);
            while (A1A.hasNext()) {
                Fwd fwd2 = (Fwd) A1A.next();
                fwd2.A02--;
            }
        }
    }
}
