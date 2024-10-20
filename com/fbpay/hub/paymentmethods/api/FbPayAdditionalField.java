package com.fbpay.hub.paymentmethods.api;

import X.11T;
import X.1BL;
import X.1Du;
import X.AbG;
import X.C1pq;
import X.LGn;
import X.Qoy;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: FbPayAdditionalField.class */
public final class FbPayAdditionalField implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(14);
    public final ImmutableList A00;
    public final String A01;

    public FbPayAdditionalField(Parcel parcel) {
        AbG.A1X(this);
        this.A01 = parcel.readString();
        int readInt = parcel.readInt();
        Qoy[] qoyArr = new Qoy[readInt];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= readInt) {
                this.A00 = ImmutableList.copyOf(qoyArr);
                return;
            } else {
                qoyArr[i2] = Qoy.values()[parcel.readInt()];
                i = i2 + 1;
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FbPayAdditionalField)) {
                return false;
            }
            FbPayAdditionalField fbPayAdditionalField = (FbPayAdditionalField) obj;
            if (!11T.A0O(this.A01, fbPayAdditionalField.A01) || !11T.A0O(this.A00, fbPayAdditionalField.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A03(this.A01));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            parcel.writeInt(((Qoy) A0b.next()).ordinal());
        }
    }
}
