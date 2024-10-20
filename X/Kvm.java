package X;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: Kvm.class */
public abstract class Kvm {
    public static Object A00(Parcel parcel, Parcelable.Creator creator) {
        return AnonymousClass002.A0I(parcel, creator);
    }

    public static void A01(Parcel parcel, Parcelable parcelable, int i) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, i);
        }
    }
}
