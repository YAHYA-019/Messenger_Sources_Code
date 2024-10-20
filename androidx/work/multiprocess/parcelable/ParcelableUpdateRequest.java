package androidx.work.multiprocess.parcelable;

import X.C4Kc;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

/* loaded from: ParcelableUpdateRequest.class */
public final class ParcelableUpdateRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(37);
    public final ParcelableData A00;
    public final String A01;

    public ParcelableUpdateRequest(C4Kc c4Kc, UUID uuid) {
        this.A01 = uuid.toString();
        this.A00 = new ParcelableData(c4Kc);
    }

    public ParcelableUpdateRequest(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = new ParcelableData(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        this.A00.writeToParcel(parcel, i);
    }
}
