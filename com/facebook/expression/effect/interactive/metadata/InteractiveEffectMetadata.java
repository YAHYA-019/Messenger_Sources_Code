package com.facebook.expression.effect.interactive.metadata;

import X.11T;
import X.DKD;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InteractiveEffectMetadata.class */
public final class InteractiveEffectMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(67);
    public final String A00;

    public InteractiveEffectMetadata(Parcel parcel) {
        String readString = parcel.readString();
        11T.A0D(readString);
        this.A00 = readString;
    }

    public InteractiveEffectMetadata(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof InteractiveEffectMetadata)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return 11T.A0O(this.A00, ((InteractiveEffectMetadata) obj).A00);
    }

    public int hashCode() {
        return DKD.A04(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00);
    }
}
