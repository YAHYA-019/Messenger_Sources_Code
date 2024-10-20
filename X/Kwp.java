package X;

import android.os.Parcel;

/* loaded from: Kwp.class */
public abstract class Kwp {
    public static int A00(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (i >> 16) & ((char) (-1)) : parcel.readInt();
    }

    public static void A01(Parcel parcel, int i, int i2) {
        int A00 = A00(parcel, i);
        if (A00 == i2) {
            return;
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(AnonymousClass000.A00(75));
        A0k.append(i2);
        A0k.append(" got ");
        A0k.append(A00);
        A0k.append(" (0x");
        JQz.A1Q(A0k, A00);
        throw new RuntimeException(AnonymousClass001.A0d(")", A0k));
    }
}
