package X;

import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.Locale;

/* renamed from: X.5e4, reason: invalid class name */
/* loaded from: 5e4.class */
public final class C5e4 {
    public final 1Br A01 = 1Bq.A00(16634);
    public final C03793z2 A00 = C03793z2.A00(C5ap.A1A, C5ap.A19, C5ap.A22, C5ap.A23, C5ap.A21, C5ap.A18);

    public static final void A00(BOn bOn, C5e4 c5e4, String str, int i, int i2, int i3, long j) {
        1UG A00 = 1UD.A00((04J) c5e4.A01.A00.get(), 1ZG.A01, 1BJ.A00(1287));
        if (A00.isSampled()) {
            A00.A6H("thread_id", Long.valueOf(j));
            A00.A5q("event", Integer.valueOf(i));
            String lowerCase = str.toLowerCase(Locale.ROOT);
            11T.A0A(lowerCase);
            A00.A7R("notification_type", lowerCase);
            A00.A7R("session_id", "");
            A00.A5c(bOn, "surface");
            A00.A5q(Property.SYMBOL_Z_ORDER_SOURCE, Integer.valueOf(i3));
            A00.A5q("action", Integer.valueOf(i2));
            A00.BZL();
        }
    }
}
