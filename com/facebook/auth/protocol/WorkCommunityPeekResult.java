package com.facebook.auth.protocol;

import X.1BL;
import X.4YV;
import X.BRt;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.results.BaseResult;
import com.facebook.workshared.auth.community.WorkCommunity;
import com.google.common.collect.ImmutableList;

/* loaded from: WorkCommunityPeekResult.class */
public final class WorkCommunityPeekResult extends BaseResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(44);
    public final WorkCommunity A00;
    public final ImmutableList A01;
    public final boolean A02;

    public WorkCommunityPeekResult(Parcel parcel) {
        super(parcel);
        this.A02 = 4YV.A1U(parcel.readByte());
        this.A00 = (WorkCommunity) 1BL.A0C(parcel, WorkCommunity.class);
        this.A01 = BRt.A00(4YV.A0y(parcel, WorkCommunity.class));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.fbservice.results.BaseResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A02 ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeList(this.A01);
    }
}
