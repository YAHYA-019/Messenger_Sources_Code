package com.facebook.messaging.phoneconfirmation.protocol;

import X.1BL;
import X.AbJ;
import X.AnonymousClass001;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ResponseConfirmationCodeParams.class */
public final class ResponseConfirmationCodeParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSS(7);
    public final RecoveredAccount A00;
    public final RecoveredAccount A01;
    public final RequestConfirmationCodeParams A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public ResponseConfirmationCodeParams(Parcel parcel) {
        this.A02 = (RequestConfirmationCodeParams) 1BL.A0C(parcel, RequestConfirmationCodeParams.class);
        this.A05 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A04 = AbJ.A1W(parcel);
        this.A03 = parcel.readString();
        this.A00 = (RecoveredAccount) 1BL.A0C(parcel, RecoveredAccount.class);
        this.A01 = (RecoveredAccount) 1BL.A0C(parcel, RecoveredAccount.class);
    }

    public ResponseConfirmationCodeParams(RecoveredAccount recoveredAccount, RecoveredAccount recoveredAccount2, RequestConfirmationCodeParams requestConfirmationCodeParams, String str, boolean z, boolean z2) {
        this.A02 = requestConfirmationCodeParams;
        this.A05 = z;
        this.A04 = z2;
        this.A03 = str;
        this.A00 = recoveredAccount;
        this.A01 = recoveredAccount2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }
}
