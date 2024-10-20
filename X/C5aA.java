package X;

import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.5aA, reason: invalid class name */
/* loaded from: 5aA.class */
public final class C5aA {
    public final 5Zm A00;

    public C5aA(5Zm r302) {
        this.A00 = r302;
    }

    public final void A00(String str) {
        this.A00.A02(str);
    }

    public final void A01(String str) {
        5Zm r0 = this.A00;
        QuickPerformanceLogger A00 = 5Zm.A00(r0);
        int i = r0.A00;
        if (A00.isMarkerOn(3488631, i)) {
            5Zm.A00(r0).markerPoint(3488631, i, "fetch_thread_image_end", str);
        }
    }

    public final void A02(String str, String str2) {
        5Zm r0 = this.A00;
        QuickPerformanceLogger A00 = 5Zm.A00(r0);
        int i = r0.A00;
        if (A00.isMarkerOn(3488631, i)) {
            5Zm.A00(r0).markerPoint(3488631, i, str, str2);
        }
        r0.A06((short) 216);
    }
}
