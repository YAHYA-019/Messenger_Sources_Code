package X;

import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* renamed from: X.73r, reason: invalid class name */
/* loaded from: 73r.class */
public final class C73r implements 6zD {
    public final boolean A00;

    public C73r() {
        this(false);
    }

    public C73r(boolean z) {
        this.A00 = z;
    }

    public boolean BUV(5vW r302, int i) {
        11T.A0F(r302, 0);
        boolean z = false;
        if (this.A00) {
            return false;
        }
        5vV r0 = (5vV) r302;
        C5fv c5fv = r0.A00;
        Capabilities capabilities = r0.A01.A00;
        82T AxW = c5fv.AxW(5mD.A00);
        if ((AxW == null || !AxW.A01) && !C5ul.A00(c5fv) && capabilities.A00.get(20)) {
            z = true;
        }
        return z;
    }
}
