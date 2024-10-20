package X;

import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* renamed from: X.5ti, reason: invalid class name */
/* loaded from: 5ti.class */
public final class C5ti implements C5mp {
    @Override // X.C5mp
    public C5fv CZN(C5j5 c5j5, Capabilities capabilities, C5fv c5fv) {
        int i;
        11T.A0F(c5fv, 0);
        C5l9 c5l9 = C5l9.A00;
        C5uu c5uu = (C5uu) c5fv.AxW(c5l9);
        if (c5uu != null && ((i = c5uu.A00) > 0 || c5uu.A04)) {
            boolean z = c5uu.A04;
            c5fv = c5fv.A6V(c5l9, new C5uu(c5uu.A02, c5uu.A03, i, c5uu.A01, z));
        }
        return c5fv;
    }
}
