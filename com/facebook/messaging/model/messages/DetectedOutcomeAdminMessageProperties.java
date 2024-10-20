package com.facebook.messaging.model.messages;

import X.DJg;
import X.RqW;
import android.os.Build;
import android.os.Parcel;

/* loaded from: DetectedOutcomeAdminMessageProperties.class */
public final class DetectedOutcomeAdminMessageProperties extends GenericAdminMessageExtensibleData {
    public static final DJg CREATOR = new RqW();
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public DetectedOutcomeAdminMessageProperties(String str, String str2, String str3, boolean z) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
        this.A03 = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        if (Build.VERSION.SDK_INT >= 29) {
            parcel.writeBoolean(this.A03);
        }
    }
}
