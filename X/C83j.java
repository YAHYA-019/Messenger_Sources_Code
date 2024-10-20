package X;

import android.graphics.Color;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.presence.api.model.RichStatus;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.83j, reason: invalid class name */
/* loaded from: 83j.class */
public final class C83j {
    public final 1Br A00;
    public final List A01;
    public final java.util.Map A02;
    public final FbUserSession A03;

    public C83j(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A03 = fbUserSession;
        this.A00 = 7zM.A0R();
        this.A02 = 1BK.A1C();
        this.A01 = AnonymousClass001.A0s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Integer] */
    public final C4Tm A00(RichStatus richStatus) {
        C4Tm c4Tm = null;
        if (richStatus != null) {
            Object obj = this.A02.get(Long.valueOf(richStatus.A04));
            if (obj == null) {
                Iterator it = this.A01.iterator();
                while (it.hasNext()) {
                    2JY A0P = 7zL.A0P(it);
                    1Du it2 = A0P.A0Z(523149226).iterator();
                    while (it2.hasNext()) {
                        String A0i = AnonymousClass001.A0i(it2);
                        String str = richStatus.A0G;
                        11T.A0D(A0i);
                        if (0CU.A0T(str, A0i, true)) {
                            String A0r = A0P.A0r(-2115337775);
                            Integer valueOf = A0r != null ? Integer.valueOf(Color.parseColor(A0r)) : null;
                            String A0r2 = A0P.A0r(-1636913680);
                            Integer valueOf2 = A0r2 != null ? Integer.valueOf(Color.parseColor(A0r2)) : null;
                            String A0r3 = A0P.A0r(-2023374208);
                            Integer valueOf3 = A0r3 != null ? Integer.valueOf(Color.parseColor(A0r3)) : null;
                            String A0r4 = A0P.A0r(-818094361);
                            if (A0r4 != null) {
                                c4Tm = Integer.valueOf(Color.parseColor(A0r4));
                            }
                            return new C4Tm(valueOf, valueOf2, valueOf3, c4Tm, 11T.A0O(A0P.A0r(804465082), "halloween_2024") ? 2132476029 : null);
                        }
                    }
                }
            } else {
                c4Tm = (C4Tm) obj;
            }
        }
        return c4Tm;
    }
}
