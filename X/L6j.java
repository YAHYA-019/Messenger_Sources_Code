package X;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: L6j.class */
public final class L6j {
    public static final ClassLoader A00 = L6j.class.getClassLoader();

    public static void A00(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }
}
