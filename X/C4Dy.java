package X;

import com.facebook.push.constants.PushProperty;
import com.mapbox.mapboxsdk.style.layers.Property;

/* renamed from: X.4Dy, reason: invalid class name */
/* loaded from: 4Dy.class */
public final class C4Dy {
    public final 1Br A02 = 1Bq.A00(68335);
    public final 1Br A04 = 1Bq.A00(32798);
    public final 1Br A03 = 1Bq.A00(16634);
    public final 1Br A00 = 1Bq.A00(16960);
    public final 1Br A01 = 1Bq.A00(33013);

    public static final 04J A00(C4Dy c4Dy) {
        return (04J) c4Dy.A03.A00.get();
    }

    public final void A01(PushProperty pushProperty, String str) {
        1UG A00 = 1UD.A00(A00(this), 1ZG.A01, 1BJ.A00(545));
        if (A00.isSampled()) {
            A00.A7R("event_type", str);
            A00.A7R(Property.SYMBOL_Z_ORDER_SOURCE, pushProperty.A04.toString());
            A00.A7R("notif_type", pushProperty.A0B);
            A00.A7R("push_id", pushProperty.A0A);
            A00.BZL();
        }
    }
}
