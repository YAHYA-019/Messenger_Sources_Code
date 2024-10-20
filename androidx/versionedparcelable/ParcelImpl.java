package androidx.versionedparcelable;

import X.4iR;
import X.C3086Jio;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ParcelImpl.class */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(29);
    public final 4iR A00;

    public ParcelImpl(4iR r302) {
        this.A00 = r302;
    }

    public ParcelImpl(Parcel parcel) {
        this.A00 = new C3086Jio(parcel).A04();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        new C3086Jio(parcel).A08(this.A00);
    }
}
