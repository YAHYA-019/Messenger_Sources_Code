package com.facebook.payments.p2m.attachreceipt.models;

import X.11T;
import X.4YV;
import X.C1pq;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: OffsiteBankTransferScreen.class */
public final class OffsiteBankTransferScreen implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(67);
    public final BankDetailsComponent A00;
    public final ConfirmButtonComponent A01;
    public final PhotoUploadComponent A02;

    public OffsiteBankTransferScreen(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A00 = (BankDetailsComponent) parcel.readParcelable(A0e);
        this.A01 = (ConfirmButtonComponent) parcel.readParcelable(A0e);
        this.A02 = (PhotoUploadComponent) parcel.readParcelable(A0e);
    }

    public OffsiteBankTransferScreen(BankDetailsComponent bankDetailsComponent, ConfirmButtonComponent confirmButtonComponent, PhotoUploadComponent photoUploadComponent) {
        this.A00 = bankDetailsComponent;
        this.A01 = confirmButtonComponent;
        this.A02 = photoUploadComponent;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof OffsiteBankTransferScreen)) {
                return false;
            }
            OffsiteBankTransferScreen offsiteBankTransferScreen = (OffsiteBankTransferScreen) obj;
            if (!11T.A0O(this.A00, offsiteBankTransferScreen.A00) || !11T.A0O(this.A01, offsiteBankTransferScreen.A01) || !11T.A0O(this.A02, offsiteBankTransferScreen.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
    }
}
