package X;

import androidx.lifecycle.LifecycleOwner;
import com.facebook.messaging.highlightstab.model.HighlightsAttachmentContent;

/* renamed from: X.9iN, reason: invalid class name */
/* loaded from: 9iN.class */
public abstract class C9iN {
    public static final LifecycleOwner A00(C2k6 c2k6) {
        11T.A0F(c2k6, 0);
        Object A01 = 3vP.A01(c2k6, C3oi.A00);
        if (A01 != null) {
            return (LifecycleOwner) A01;
        }
        throw 1BK.A0h();
    }

    public static final 2R0 A01(C2k6 c2k6) {
        11T.A0F(c2k6, 0);
        Object A01 = 3vP.A01(c2k6, 9G3.A01);
        if (A01 != null) {
            return (2R0) A01;
        }
        throw 1BK.A0h();
    }

    public static final void A02(C98S c98s, C2k6 c2k6) {
        11T.A0F(c2k6, 0);
        Object A01 = 3vP.A01(c2k6, 9G3.A00);
        if (A01 == null) {
            throw 1BK.A0h();
        }
        9O8 r0 = (9O8) A01;
        2R0.A08(c98s, (3Ec) null, r0.A00, (HighlightsAttachmentContent) null, r0.A01);
    }
}
