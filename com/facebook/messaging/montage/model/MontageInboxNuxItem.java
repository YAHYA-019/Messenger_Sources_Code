package com.facebook.messaging.montage.model;

import X.C53v;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: MontageInboxNuxItem.class */
public final class MontageInboxNuxItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = CST.A00(0);
    public final ImmutableList A00;
    public final boolean A01;

    public MontageInboxNuxItem(Parcel parcel) {
        ImmutableList A04 = C53v.A04(parcel, MontageCard.class);
        this.A00 = A04 == null ? ImmutableList.of() : A04;
        this.A01 = C53v.A0S(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }
}
