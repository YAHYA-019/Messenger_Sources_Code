package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.messaging.highlightstab.model.bottomsheet.HighlightsFeedMenuItem;

/* renamed from: X.9vd, reason: invalid class name */
/* loaded from: 9vd.class */
public final class C9vd implements AZN {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FbUserSession A01;
    public final /* synthetic */ HighlightsFeedContent A02;

    public C9vd(Context context, FbUserSession fbUserSession, HighlightsFeedContent highlightsFeedContent) {
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A02 = highlightsFeedContent;
    }

    public C00m Acg(HighlightsFeedMenuItem highlightsFeedMenuItem) {
        11T.A0F(highlightsFeedMenuItem, 0);
        return new AQj(17, highlightsFeedMenuItem, this.A01, this.A02, this.A00);
    }

    public HighlightsFeedMenuItem Awd() {
        C9ky c9ky = new C9ky();
        C9ky.A01(c9ky, 1);
        C9ky.A00(this.A00, c9ky, 2131957821);
        c9ky.A02(C1u3.A2d);
        c9ky.A01 = C98S.A0H;
        return new HighlightsFeedMenuItem(c9ky);
    }
}
