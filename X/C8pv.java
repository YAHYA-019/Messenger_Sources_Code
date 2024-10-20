package X;

import android.net.Uri;

/* renamed from: X.8pv, reason: invalid class name */
/* loaded from: 8pv.class */
public final class C8pv extends 2Yv {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Uri A04;

    public void A02(C2l4 c2l4) {
        Object[] objArr = c2l4.A01;
        int i = c2l4.A00;
        if (i == 0) {
            Number number = (Number) objArr[0];
            Number number2 = (Number) objArr[1];
            this.A01 = number.intValue();
            this.A00 = number2.intValue();
            return;
        }
        if (i == 1) {
            9RU r0 = (9RU) objArr[0];
            Uri uri = r0.A02;
            Integer valueOf = Integer.valueOf(r0.A01);
            Integer valueOf2 = Integer.valueOf(r0.A00);
            this.A04 = uri;
            this.A03 = valueOf.intValue();
            this.A02 = valueOf2.intValue();
        }
    }
}
