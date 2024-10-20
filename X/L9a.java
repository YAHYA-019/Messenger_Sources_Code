package X;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: L9a.class */
public final class L9a {
    public static final ClassLoader A00 = L9a.class.getClassLoader();

    public static Parcelable A00(Parcel parcel, Parcelable.Creator creator) {
        return JQy.A0R(parcel, creator);
    }

    public static void A01(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
