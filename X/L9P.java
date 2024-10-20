package X;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: L9P.class */
public final class L9P {
    static {
        L9P.class.getClassLoader();
    }

    public static void A00(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail > 0) {
            throw JQy.A0P(dataAvail);
        }
    }

    public static void A01(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }
}
