package X;

import android.content.Context;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.messaging.highlightstab.model.bottomsheet.HighlightsFeedMenuItem;

/* renamed from: X.9vf, reason: invalid class name */
/* loaded from: 9vf.class */
public final class C9vf implements AZN {
    public final 1Br A00 = 1Bu.A00(68109);
    public final HighlightsFeedContent A01;
    public final Context A02;

    public C9vf(Context context, HighlightsFeedContent highlightsFeedContent) {
        this.A02 = context;
        this.A01 = highlightsFeedContent;
    }

    public C00m Acg(HighlightsFeedMenuItem highlightsFeedMenuItem) {
        return AQl.A01(this, 32);
    }

    public HighlightsFeedMenuItem Awd() {
        if (!C9dE.A00(this.A01)) {
            return null;
        }
        C9ky c9ky = new C9ky();
        C9ky.A01(c9ky, 3);
        C9ky.A00(this.A02, c9ky, 2131957828);
        c9ky.A02(C1u3.A6J);
        return new HighlightsFeedMenuItem(c9ky);
    }
}
