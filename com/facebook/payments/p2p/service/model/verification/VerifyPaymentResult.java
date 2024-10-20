package com.facebook.payments.p2p.service.model.verification;

import X.1BL;
import X.C53v;
import X.FKd;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.p2p.model.verification.ScreenData;

/* loaded from: VerifyPaymentResult.class */
public class VerifyPaymentResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKd.A00(41);
    public final boolean mFallbackMSite;
    public final String mFallbackUri;
    public final String mScreen;
    public final ScreenData mScreenData;

    public VerifyPaymentResult() {
        this.mFallbackMSite = false;
        this.mFallbackUri = null;
        this.mScreen = null;
        this.mScreenData = null;
    }

    public VerifyPaymentResult(Parcel parcel) {
        this.mFallbackMSite = C53v.A0S(parcel);
        this.mFallbackUri = parcel.readString();
        this.mScreen = parcel.readString();
        this.mScreenData = (ScreenData) 1BL.A0C(parcel, ScreenData.class);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mFallbackMSite ? 1 : 0);
        parcel.writeString(this.mFallbackUri);
        parcel.writeString(this.mScreen);
        parcel.writeParcelable(this.mScreenData, 0);
    }
}
