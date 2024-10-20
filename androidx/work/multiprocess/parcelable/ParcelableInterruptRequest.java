package androidx.work.multiprocess.parcelable;

import X.0Pz;
import X.11T;
import X.4YV;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ParcelableInterruptRequest.class */
public final class ParcelableInterruptRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(33);
    public final int A00;
    public final String A01;

    public ParcelableInterruptRequest(String str, int i) {
        11T.A0F(str, 1);
        this.A01 = str;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ParcelableInterruptRequest)) {
                return false;
            }
            ParcelableInterruptRequest parcelableInterruptRequest = (ParcelableInterruptRequest) obj;
            if (!11T.A0O(this.A01, parcelableInterruptRequest.A01) || this.A00 != parcelableInterruptRequest.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 4YV.A02(this.A01) + this.A00;
    }

    public String toString() {
        return 0Pz.A0n("ParcelableInterruptRequest(id=", this.A01, ", stopReason=", ')', this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
    }
}
