package com.facebook.messaging.business.common.calltoaction.model;

import X.11T;
import X.82M;
import X.C4o6;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AdCallToAction.class */
public final class AdCallToAction extends CallToAction {
    public static final Parcelable.Creator CREATOR = new 82M(16);
    public final String A00;
    public final String A01;

    public AdCallToAction(C4o6 c4o6) {
        super(c4o6);
        this.A00 = c4o6.A00;
        this.A01 = c4o6.A01;
    }

    public AdCallToAction(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    @Override // com.facebook.messaging.business.common.calltoaction.model.CallToAction, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
