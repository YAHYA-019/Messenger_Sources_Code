package com.facebook.messaging.montage.store.service.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.C1pq;
import X.C3o5;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.montage.model.MontageBucketInfo;
import com.google.common.collect.ImmutableList;

/* loaded from: FetchBucketResult.class */
public final class FetchBucketResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = CST.A00(28);
    public final ImmutableList A00;

    /* JADX WARN: Multi-variable type inference failed */
    public FetchBucketResult(Parcel parcel) {
        int A01 = C3o5.A01(parcel, this);
        MontageBucketInfo[] montageBucketInfoArr = new MontageBucketInfo[A01];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= A01) {
                this.A00 = ImmutableList.copyOf(montageBucketInfoArr);
                return;
            } else {
                montageBucketInfoArr[i2] = MontageBucketInfo.CREATOR.createFromParcel(parcel);
                i = i2 + 1;
            }
        }
    }

    public FetchBucketResult(ImmutableList immutableList) {
        C1pq.A08("montageBucketInfos", immutableList);
        this.A00 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof FetchBucketResult) && 11T.A0O(this.A00, ((FetchBucketResult) obj).A00));
    }

    public int hashCode() {
        return C1pq.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            ((MontageBucketInfo) A0b.next()).writeToParcel(parcel, i);
        }
    }
}
