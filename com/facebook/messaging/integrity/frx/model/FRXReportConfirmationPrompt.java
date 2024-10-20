package com.facebook.messaging.integrity.frx.model;

import X.11T;
import X.7zL;
import X.7zU;
import X.C1pq;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FRXReportConfirmationPrompt.class */
public final class FRXReportConfirmationPrompt implements Parcelable {
    public static final Parcelable.Creator CREATOR = 7zL.A0v(95);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public FRXReportConfirmationPrompt(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
    }

    public FRXReportConfirmationPrompt(String str, String str2, String str3, String str4) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FRXReportConfirmationPrompt)) {
                return false;
            }
            FRXReportConfirmationPrompt fRXReportConfirmationPrompt = (FRXReportConfirmationPrompt) obj;
            if (!11T.A0O(this.A00, fRXReportConfirmationPrompt.A00) || !11T.A0O(this.A01, fRXReportConfirmationPrompt.A01) || !11T.A0O(this.A02, fRXReportConfirmationPrompt.A02) || !11T.A0O(this.A03, fRXReportConfirmationPrompt.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
    }
}
