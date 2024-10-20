package X;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.52P, reason: invalid class name */
/* loaded from: 52P.class */
public final class C52P {
    public static final ClassLoader A00 = C52P.class.getClassLoader();

    public static Parcelable A00(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void A01(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw new BadParcelableException(0Pz.A0T(JQw.A00(58), dataAvail));
        }
    }
}
