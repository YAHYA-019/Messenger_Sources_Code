package com.facebook.stories.model;

import X.11T;
import X.1BL;
import X.7zU;
import X.C1pq;
import X.C3o5;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InlineActivityInfo.class */
public final class InlineActivityInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(67);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public InlineActivityInfo(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        this.A03 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A04 = C3o5.A0O(parcel);
        this.A05 = parcel.readString();
    }

    public InlineActivityInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        C1pq.A08("activityDescription", str);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
        C1pq.A08("objectName", str6);
        this.A05 = str6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InlineActivityInfo)) {
                return false;
            }
            InlineActivityInfo inlineActivityInfo = (InlineActivityInfo) obj;
            if (!11T.A0O(this.A00, inlineActivityInfo.A00) || !11T.A0O(this.A01, inlineActivityInfo.A01) || !11T.A0O(this.A02, inlineActivityInfo.A02) || !11T.A0O(this.A03, inlineActivityInfo.A03) || !11T.A0O(this.A04, inlineActivityInfo.A04) || !11T.A0O(this.A05, inlineActivityInfo.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        parcel.writeString(this.A05);
    }
}
