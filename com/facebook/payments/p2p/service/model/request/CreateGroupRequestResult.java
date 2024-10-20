package com.facebook.payments.p2p.service.model.request;

import X.11T;
import X.29B;
import X.AbF;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CreateGroupRequestResult.class */
public final class CreateGroupRequestResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(17);
    public final long A00;
    public final 29B A01;
    public final String A02;
    public final String A03;

    public CreateGroupRequestResult(29B r302, String str, String str2, long j) {
        this.A01 = r302;
        C1pq.A08("errorDescription", str);
        this.A02 = str;
        AbF.A1T(str2);
        this.A03 = str2;
        this.A00 = j;
    }

    public CreateGroupRequestResult(Parcel parcel) {
        this.A01 = C3o5.A01(parcel, this) == 0 ? null : 29B.values()[parcel.readInt()];
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A00 = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CreateGroupRequestResult)) {
                return false;
            }
            CreateGroupRequestResult createGroupRequestResult = (CreateGroupRequestResult) obj;
            if (this.A01 != createGroupRequestResult.A01 || !11T.A0O(this.A02, createGroupRequestResult.A02) || !11T.A0O(this.A03, createGroupRequestResult.A03) || this.A00 != createGroupRequestResult.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A01(C1pq.A04(this.A03, C1pq.A04(this.A02, C3o5.A03(this.A01) + 31)), this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(DKH.A05(parcel, this.A01));
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeLong(this.A00);
    }
}
