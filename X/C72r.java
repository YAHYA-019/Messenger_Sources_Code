package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* renamed from: X.72r, reason: invalid class name */
/* loaded from: 72r.class */
public abstract class C72r {
    /* JADX WARN: Type inference failed for: r0v17, types: [X.6zD, java.lang.Object] */
    public static final void A00(C6qu c6qu) {
        6rM r0 = (6rM) c6qu.A06;
        MigColorScheme Ad3 = r0.A0S.Ad3();
        Object value = r0.A0J.getValue();
        List A14 = C0s8.A14(C6qt.A00(C6z2.A13, 6zM.A00, new C82z(c6qu, 21)), C6qt.A00(C6z2.A03, new Object(), new C82z(c6qu, 22)));
        C82z c82z = new C82z(c6qu, 23);
        11T.A0F(Ad3, 1);
        11T.A0F(value, 3);
        c6qu.A06(new ARN(48, c6qu, value, Ad3, c82z));
        c6qu.A05(new 84V(12, c6qu, A14, true));
    }
}
