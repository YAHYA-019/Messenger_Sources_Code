package com.facebook.messaging.business.search.model;

import X.1BL;
import X.B46;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;

/* loaded from: PlatformSearchGameData.class */
public final class PlatformSearchGameData extends PlatformSearchData {
    public static final Parcelable.Creator CREATOR = CSW.A00(44);
    public final CallToAction A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public PlatformSearchGameData(B46 b46) {
        super(b46);
        b46.A00.getClass();
        this.A00 = b46.A00;
        this.A02 = b46.A02;
        this.A04 = b46.A04;
        this.A03 = b46.A03;
        this.A01 = b46.A01;
    }

    public PlatformSearchGameData(Parcel parcel) {
        super(parcel);
        this.A00 = (CallToAction) 1BL.A0C(parcel, CallToAction.class);
        this.A02 = parcel.readString();
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A01 = parcel.readString();
    }

    @Override // com.facebook.messaging.business.search.model.PlatformSearchData, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
    }
}
