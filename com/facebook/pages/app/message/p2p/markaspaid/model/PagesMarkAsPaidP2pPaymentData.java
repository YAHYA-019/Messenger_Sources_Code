package com.facebook.pages.app.message.p2p.markaspaid.model;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PagesMarkAsPaidP2pPaymentData.class */
public final class PagesMarkAsPaidP2pPaymentData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(22);
    public final String A00;
    public final String A01;

    public PagesMarkAsPaidP2pPaymentData(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this) != 0 ? parcel.readString() : null;
        this.A01 = C3o5.A0O(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PagesMarkAsPaidP2pPaymentData)) {
                return false;
            }
            PagesMarkAsPaidP2pPaymentData pagesMarkAsPaidP2pPaymentData = (PagesMarkAsPaidP2pPaymentData) obj;
            if (!11T.A0O(this.A00, pagesMarkAsPaidP2pPaymentData.A00) || !11T.A0O(this.A01, pagesMarkAsPaidP2pPaymentData.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A03(this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
    }
}
