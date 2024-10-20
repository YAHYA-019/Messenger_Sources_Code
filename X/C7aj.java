package X;

import android.content.Context;
import com.facebook.threadview.ThreadViewVideoStateButton;

/* renamed from: X.7aj, reason: invalid class name */
/* loaded from: 7aj.class */
public final class C7aj extends C1rj {
    public C7aj() {
        super("M4ReplyVideoStateButton");
    }

    public Integer A0m() {
        return 0S2.A0C;
    }

    public Object A0n(Context context) {
        return new ThreadViewVideoStateButton(context);
    }

    @Override // X.C1rj
    public void A1K(1Iw r302, AnonymousClass274 anonymousClass274, Object obj) {
        ((ThreadViewVideoStateButton) obj).A0W();
    }

    @Override // X.C1rj
    public boolean A1a(1LI r302, boolean z) {
        boolean z2 = true;
        if (this != r302 && (r302 == null || getClass() != r302.getClass())) {
            z2 = false;
        }
        return z2;
    }
}
