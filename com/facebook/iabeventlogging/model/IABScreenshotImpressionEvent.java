package com.facebook.iabeventlogging.model;

import X.11T;
import X.1BL;
import X.EPy;
import X.KOk;
import android.os.Parcel;

/* loaded from: IABScreenshotImpressionEvent.class */
public final class IABScreenshotImpressionEvent extends IABEvent {
    public final EPy A00;
    public final String A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IABScreenshotImpressionEvent(EPy ePy, String str, String str2, String str3, long j) {
        super(KOk.A0O, str, j, j);
        11T.A0F(ePy, 4);
        this.A02 = str2;
        this.A00 = ePy;
        this.A01 = str3;
    }

    @Override // com.facebook.iabeventlogging.model.IABEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A02);
        1BL.A12(parcel, this.A00);
        parcel.writeString(this.A01);
    }
}
