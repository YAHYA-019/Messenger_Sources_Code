package com.facebook.messaging.aibot.aiplugins.search.models;

import X.0Pz;
import X.11T;
import X.1BL;
import X.4YV;
import X.7zN;
import X.7zR;
import X.AnonymousClass002;
import X.C04v;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AISearchSource.class */
public final class AISearchSource extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(88);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public AISearchSource(String str, String str2, String str3, String str4) {
        7zR.A1N(str, str3);
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AISearchSource)) {
                return false;
            }
            AISearchSource aISearchSource = (AISearchSource) obj;
            if (!11T.A0O(this.A03, aISearchSource.A03) || !11T.A0O(this.A02, aISearchSource.A02) || !11T.A0O(this.A01, aISearchSource.A01) || !11T.A0O(this.A00, aISearchSource.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A07(this.A01, (4YV.A02(this.A03) + 1BL.A05(this.A02)) * 31) + 7zN.A05(this.A00);
    }

    public String toString() {
        return 0Pz.A14("AISearchSource(title=", this.A03, ", subTitle=", this.A02, ", sourceUrl=", this.A01, ", favicon=", this.A00, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
