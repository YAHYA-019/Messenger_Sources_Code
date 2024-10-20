package com.facebook.payments.auth;

import X.11T;
import X.7zU;
import X.AbF;
import X.C1pq;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: BioPromptContent.class */
public final class BioPromptContent implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(33);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public BioPromptContent(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
    }

    public BioPromptContent(String str, String str2, String str3) {
        C1pq.A08("actionButtonText", str);
        this.A00 = str;
        C1pq.A08("description", str2);
        this.A01 = str2;
        this.A02 = "";
        AbF.A1V(str3);
        this.A03 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof BioPromptContent)) {
                return false;
            }
            BioPromptContent bioPromptContent = (BioPromptContent) obj;
            if (!11T.A0O(this.A00, bioPromptContent.A00) || !11T.A0O(this.A01, bioPromptContent.A01) || !11T.A0O(this.A02, bioPromptContent.A02) || !11T.A0O(this.A03, bioPromptContent.A03)) {
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
