package com.facebook.messaging.montage.store.service.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.AbH;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: FetchBucketParams.class */
public final class FetchBucketParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CST.A00(27);
    public final ImmutableList A00;
    public final Boolean A01;
    public final Boolean A02;

    public FetchBucketParams(Parcel parcel) {
        int A01 = C3o5.A01(parcel, this);
        String[] strArr = new String[A01];
        int i = 0;
        while (i < A01) {
            i = AbH.A00(parcel, strArr, i);
        }
        this.A00 = ImmutableList.copyOf(strArr);
        this.A01 = Boolean.valueOf(AnonymousClass001.A1Q(parcel.readInt(), 1));
        this.A02 = Boolean.valueOf(AbJ.A1W(parcel));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FetchBucketParams)) {
                return false;
            }
            FetchBucketParams fetchBucketParams = (FetchBucketParams) obj;
            if (!11T.A0O(this.A00, fetchBucketParams.A00) || !11T.A0O(this.A01, fetchBucketParams.A01) || !11T.A0O(this.A02, fetchBucketParams.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            C3o5.A0h(parcel, A0b);
        }
        parcel.writeInt(this.A01.booleanValue() ? 1 : 0);
        parcel.writeInt(this.A02.booleanValue() ? 1 : 0);
    }
}
