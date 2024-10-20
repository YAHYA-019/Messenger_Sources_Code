package com.facebook.smartcapture.flow;

import X.11T;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FbCreditCardFlowBuilder$CreditCardIdCaptureExperimentConfigProvider.class */
public final class FbCreditCardFlowBuilder$CreditCardIdCaptureExperimentConfigProvider implements Parcelable {
    public static final FKe CREATOR = FKe.A00(25);
    public FbCardScannerExperimentConfig A00;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A00, i);
    }
}
