package X;

import android.content.Context;

/* renamed from: X.3Yt, reason: invalid class name */
/* loaded from: 3Yt.class */
public final class C3Yt implements C2kb {
    public final int A00;
    public final Object A01;

    public C3Yt(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C2kb
    public final C2X6 AK6(Context context, int i, boolean z, boolean z2) {
        int i2;
        33J r313;
        switch (this.A00) {
            case 0:
                11T.A0F(context, 0);
                return new 37G(context, ((C8uf) this.A01).A02, i, z, z2);
            case 1:
                i2 = 0;
                break;
            case 2:
                i2 = 1;
                break;
            default:
                r313 = new 33J(((1Iw) this.A01).A0D, this, 3);
                return new C2X6(r313);
        }
        r313 = new 33J(context, this, i, i2, z);
        return new C2X6(r313);
    }
}
