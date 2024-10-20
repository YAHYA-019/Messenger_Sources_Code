package X;

import android.content.Context;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.messaging.highlightstab.model.bottomsheet.HighlightsFeedMenuItem;

/* renamed from: X.9ve, reason: invalid class name */
/* loaded from: 9ve.class */
public final class C9ve implements AZN {
    public final 1Br A00 = 1Bu.A00(68109);
    public final HighlightsFeedContent A01;
    public final Context A02;

    public C9ve(Context context, HighlightsFeedContent highlightsFeedContent) {
        this.A02 = context;
        this.A01 = highlightsFeedContent;
    }

    public C00m Acg(HighlightsFeedMenuItem highlightsFeedMenuItem) {
        11T.A0F(highlightsFeedMenuItem, 0);
        return AQg.A00(this, highlightsFeedMenuItem, 49);
    }

    public HighlightsFeedMenuItem Awd() {
        C1u3 c1u3;
        boolean A01 = C9dE.A01(this.A01);
        C9ky c9ky = new C9ky();
        if (A01) {
            c9ky.A00 = 4;
            c9ky.A05 = true;
            C9ky.A00(this.A02, c9ky, 2131957841);
            c1u3 = C1u3.A4U;
        } else {
            C9ky.A01(c9ky, 3);
            C9ky.A00(this.A02, c9ky, 2131957827);
            c1u3 = C1u3.A6J;
        }
        c9ky.A02(c1u3);
        return new HighlightsFeedMenuItem(c9ky);
    }
}
