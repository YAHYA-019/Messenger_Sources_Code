package com.facebook.messaging.montage.store.service.model;

import X.11T;
import X.7zU;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FetchStoryParams.class */
public final class FetchStoryParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CST.A00(29);
    public final String A00;
    public final Integer A01;

    public FetchStoryParams(Parcel parcel) {
        this.A01 = C3o5.A01(parcel, this) == 0 ? null : 7zU.A0e(parcel, 5);
        this.A00 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FetchStoryParams)) {
                return false;
            }
            FetchStoryParams fetchStoryParams = (FetchStoryParams) obj;
            if (this.A01 != fetchStoryParams.A01 || !11T.A0O(this.A00, fetchStoryParams.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C3o5.A04(this.A01) + 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(AbN.A01(parcel, this.A01));
        parcel.writeString(this.A00);
    }
}
