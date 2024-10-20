package com.facebook.messaging.contacts.ranking.logging;

import X.11T;
import X.82M;
import X.BpL;
import X.C1pq;
import X.C3o5;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ScoreLoggingItem.class */
public final class ScoreLoggingItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(28);
    public final float A00;
    public final int A01;
    public final String A02;

    public ScoreLoggingItem(BpL bpL) {
        this.A01 = bpL.A01;
        this.A00 = bpL.A00;
        String str = bpL.A02;
        C1pq.A08("scoreTypeName", str);
        this.A02 = str;
    }

    public ScoreLoggingItem(Parcel parcel) {
        this.A01 = C3o5.A01(parcel, this);
        this.A00 = parcel.readFloat();
        this.A02 = parcel.readString();
    }

    public ScoreLoggingItem(String str, int i, float f) {
        this.A01 = i;
        this.A00 = f;
        C1pq.A08("scoreTypeName", str);
        this.A02 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ScoreLoggingItem)) {
                return false;
            }
            ScoreLoggingItem scoreLoggingItem = (ScoreLoggingItem) obj;
            if (this.A01 != scoreLoggingItem.A01 || this.A00 != scoreLoggingItem.A00 || !11T.A0O(this.A02, scoreLoggingItem.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, ((this.A01 + 31) * 31) + Float.floatToIntBits(this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeFloat(this.A00);
        parcel.writeString(this.A02);
    }
}
