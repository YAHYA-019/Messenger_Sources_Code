package X;

import android.content.Context;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.messaging.highlightstab.model.bottomsheet.HighlightsFeedMenuItem;

/* renamed from: X.9vc, reason: invalid class name */
/* loaded from: 9vc.class */
public final class C9vc implements AZN {
    public final Context A00;
    public final HighlightsFeedContent A01;

    public C9vc(Context context, HighlightsFeedContent highlightsFeedContent) {
        this.A00 = context;
        this.A01 = highlightsFeedContent;
    }

    public C00m Acg(HighlightsFeedMenuItem highlightsFeedMenuItem) {
        return AQl.A01(this, 33);
    }

    public HighlightsFeedMenuItem Awd() {
        C9ky c9ky = new C9ky();
        C9ky.A01(c9ky, 2);
        C9ky.A00(this.A00, c9ky, 2131957851);
        c9ky.A02(C1u3.A0C);
        c9ky.A01 = C98S.A0U;
        return new HighlightsFeedMenuItem(c9ky);
    }
}
