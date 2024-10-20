package X;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.4f0, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4f0.class */
public final class C05804f0 {
    public static boolean A09;
    public boolean A00;
    public final Runnable A01;
    public final Runnable A02;
    public final Runnable A03;
    public final Set A04;
    public final C01i A05;
    public final C00m A06;
    public final boolean A07;
    public volatile boolean A08;

    public C05804f0(Context context, C00m c00m) {
        11T.A0F(c00m, 2);
        this.A06 = c00m;
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        this.A00 = i < 31;
        this.A05 = C01g.A01(new AnonymousClass831(this, 0));
        this.A04 = new LinkedHashSet();
        if (i >= 31 && context.getApplicationInfo().targetSdkVersion >= 31) {
            z = true;
        }
        this.A07 = z;
        this.A02 = new Runnable() { // from class: X.4f1
            public static final String __redex_internal_original_name = "ForegroundEligibilityStatus$safetyExpiredAction$1";

            @Override // java.lang.Runnable
            public final void run() {
                C05804f0 c05804f0 = C05804f0.this;
                if (c05804f0.A08) {
                    return;
                }
                c05804f0.A00 = false;
                IDO.A00.A03("ForegroundEligibilityStatus", "No longer safe to start foreground service", (Throwable) null);
            }
        };
        this.A03 = new Runnable() { // from class: X.4f2
            public static final String __redex_internal_original_name = "ForegroundEligibilityStatus$startSafetyExpirationTimerAction$1";

            @Override // java.lang.Runnable
            public final void run() {
                C05804f0 c05804f0 = C05804f0.this;
                ((Handler) c05804f0.A05.getValue()).postDelayed(c05804f0.A02, 5000L);
            }
        };
        this.A01 = new Runnable() { // from class: X.4f3
            public static final String __redex_internal_original_name = "ForegroundEligibilityStatus$dispatchSafeToGoForegroundAction$1";

            @Override // java.lang.Runnable
            public final void run() {
                Set set = C05804f0.this.A04;
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    ((C00m) it.next()).invoke();
                }
                set.clear();
            }
        };
        if (A09) {
            IDO.A01("ForegroundEligibilityStatus", "An instance ForegroundEligibilityStatus has already been instantiated in this process");
        }
        A09 = true;
    }

    public static final boolean A00(C05804f0 c05804f0) {
        return 11T.A0O(((Handler) c05804f0.A05.getValue()).getLooper().getThread(), Thread.currentThread());
    }
}
