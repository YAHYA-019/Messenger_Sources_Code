package X;

import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import java.util.ArrayList;

/* renamed from: X.9dF, reason: invalid class name */
/* loaded from: 9dF.class */
public abstract class C9dF {
    public static final 1LI A00(1LI r301, C2k6 c2k6, 8Ke r303, AZg aZg) {
        11T.A0F(c2k6, 3);
        if (1BL.A0Q().AZk(2342168768861721542L)) {
            03Y[] A1b = 7zQ.A1b(AZg.class, aZg);
            1Iw AeS = c2k6.AeS();
            ArrayList A0s = AnonymousClass001.A0s();
            11T.A0F(AeS, 1);
            A0s.add(r301);
            A0s.add(C9E0.A00(r303, 8nQ.A00(AeS)));
            r301 = new 7J5(new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0s, false), A1b, (03Y[]) null);
        }
        return r301;
    }

    public static final 7J5 A01(1LI r301, 2R0 r302, HighlightsFeedContent highlightsFeedContent) {
        11T.A0F(r302, 2);
        return new 7J5(r301, (03Y[]) null, 7zQ.A1b(9G3.A00, new 9O8(r302, highlightsFeedContent)));
    }
}
