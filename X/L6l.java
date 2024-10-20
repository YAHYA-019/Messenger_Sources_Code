package X;

import android.os.Parcel;

/* loaded from: L6l.class */
public final class L6l {
    public static final ClassLoader A00 = L6l.class.getClassLoader();

    public static void A00(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw JQy.A0P(dataAvail);
        }
    }
}
