package X;

import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;

/* renamed from: X.8bx, reason: invalid class name */
/* loaded from: 8bx.class */
public final class C8bx extends 1LH {
    public final 5zD A00;
    public final Aaj A01;
    public final 2Qz A02;
    public final HighlightsFeedContent A03;
    public final C9yk A04;
    public final MigColorScheme A05;

    public C8bx(5zD r302, Aaj aaj, 2Qz r304, HighlightsFeedContent highlightsFeedContent, C9yk c9yk, MigColorScheme migColorScheme) {
        7zT.A1U(migColorScheme, aaj, r304);
        11T.A0F(c9yk, 6);
        this.A03 = highlightsFeedContent;
        this.A05 = migColorScheme;
        this.A01 = aaj;
        this.A02 = r304;
        this.A00 = r302;
        this.A04 = c9yk;
    }

    public 1LI A0s(C2k5 c2k5) {
        User A0v;
        11T.A0F(c2k5, 0);
        if (!C1ub.A03.A0N()) {
            return null;
        }
        Integer[] numArr = {Integer.valueOf(C5by.A0K.value), Integer.valueOf(C5by.A07.value)};
        HighlightsFeedContent highlightsFeedContent = this.A03;
        if (02L.A0C(Integer.valueOf(highlightsFeedContent.A05), numArr) || (A0v = 7zQ.A0v()) == null) {
            return null;
        }
        String A07 = A0v.A07();
        C2sn A0L = 7zR.A0L(c2k5);
        MigColorScheme migColorScheme = this.A05;
        Aaj aaj = this.A01;
        8ZA r0 = new 8ZA(aaj, this.A02, highlightsFeedContent, migColorScheme);
        2lQ r02 = 2lO.A02;
        2lO A0R = 7zS.A0R((2lO) null, 1.0f);
        C2sn A0K = 7zS.A0K(A0L);
        if (!C1ub.A00().AZk(36321636495606414L)) {
            A0K.A00(new C8gq(this.A00, aaj, highlightsFeedContent, this.A04, migColorScheme, A0v));
        }
        7zQ.A1E(new C8ha(r0, null, highlightsFeedContent, migColorScheme, C1ro.CENTER, 0S2.A00, A07, null, null, null, null, 1.0f, C8ha.A0F, true, false), A0K, A0L, A0R);
        return new C1rh(null, null, null, null, A0L.A01, false);
    }
}
