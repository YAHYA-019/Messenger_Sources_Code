package com.facebook.payments.auth.pin.model;

import X.1BK;
import X.AbM;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PaymentPin.class */
public class PaymentPin implements Parcelable {
    public static final PaymentPin A00 = new PaymentPin();
    public static final Parcelable.Creator CREATOR = FKY.A00(38);
    public final String mFBPayPinStatus;
    public final Long mPinId;

    public PaymentPin() {
        this.mPinId = null;
        this.mFBPayPinStatus = null;
    }

    public PaymentPin(long j, String str) {
        this.mPinId = Long.valueOf(j);
        this.mFBPayPinStatus = str;
    }

    public PaymentPin(Parcel parcel) {
        String readString = parcel.readString();
        this.mPinId = readString.equals("null") ? null : 1BK.A0n(readString);
        this.mFBPayPinStatus = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (r0 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bf, code lost:
    
        if (r0 != null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.auth.pin.model.PaymentPin.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return AbM.A05(this.mPinId, this.mFBPayPinStatus);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(String.valueOf(this.mPinId));
        parcel.writeString(this.mFBPayPinStatus);
    }
}
