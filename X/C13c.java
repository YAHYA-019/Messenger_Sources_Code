package X;

import java.util.Collection;

/* renamed from: X.13c, reason: invalid class name */
/* loaded from: 13c.class */
public abstract class C13c {
    public static final String A00(Collection collection, Object[] objArr, int i, int i2) {
        StringBuilder A0l = AnonymousClass001.A0l((i2 * 3) + 2);
        A0l.append("[");
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= i2) {
                String A0d = AnonymousClass001.A0d("]", A0l);
                11T.A0A(A0d);
                return A0d;
            }
            if (i4 > 0) {
                AnonymousClass001.A1H(A0l);
            }
            Object obj = objArr[i + i4];
            if (obj == collection) {
                A0l.append("(this Collection)");
            } else {
                A0l.append(obj);
            }
            i3 = i4 + 1;
        }
    }

    public static final void A01(Object[] objArr, int i, int i2) {
        11T.A0F(objArr, 0);
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }
}
