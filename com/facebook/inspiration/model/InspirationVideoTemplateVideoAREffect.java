package com.facebook.inspiration.model;

import X.11T;
import X.1BL;
import X.C1pq;
import X.C3o5;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InspirationVideoTemplateVideoAREffect.class */
public final class InspirationVideoTemplateVideoAREffect implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(80);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public InspirationVideoTemplateVideoAREffect(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        this.A01 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        this.A03 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A04 = C3o5.A0O(parcel);
    }

    public InspirationVideoTemplateVideoAREffect(String str, String str2, String str3, String str4, String str5) {
        this.A00 = str;
        C1pq.A08("effectID", str2);
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationVideoTemplateVideoAREffect)) {
                return false;
            }
            InspirationVideoTemplateVideoAREffect inspirationVideoTemplateVideoAREffect = (InspirationVideoTemplateVideoAREffect) obj;
            if (!11T.A0O(this.A00, inspirationVideoTemplateVideoAREffect.A00) || !11T.A0O(this.A01, inspirationVideoTemplateVideoAREffect.A01) || !11T.A0O(this.A02, inspirationVideoTemplateVideoAREffect.A02) || !11T.A0O(this.A03, inspirationVideoTemplateVideoAREffect.A03) || !11T.A0O(this.A04, inspirationVideoTemplateVideoAREffect.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        parcel.writeString(this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
    }
}
