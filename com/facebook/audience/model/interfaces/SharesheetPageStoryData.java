package com.facebook.audience.model.interfaces;

import X.11T;
import X.1BL;
import X.AbF;
import X.C1pq;
import X.C3o5;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: SharesheetPageStoryData.class */
public final class SharesheetPageStoryData implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(8);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public SharesheetPageStoryData(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this) != 0 ? parcel.readString() : null;
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = C3o5.A0O(parcel);
    }

    public SharesheetPageStoryData(String str, String str2, String str3, String str4) {
        this.A00 = str;
        AbF.A1T(str2);
        this.A01 = str2;
        AbF.A1U(str3);
        this.A02 = str3;
        this.A03 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SharesheetPageStoryData)) {
                return false;
            }
            SharesheetPageStoryData sharesheetPageStoryData = (SharesheetPageStoryData) obj;
            if (!11T.A0O(this.A00, sharesheetPageStoryData.A00) || !11T.A0O(this.A01, sharesheetPageStoryData.A01) || !11T.A0O(this.A02, sharesheetPageStoryData.A02) || !11T.A0O(this.A03, sharesheetPageStoryData.A03)) {
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
        1BL.A13(parcel, this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        1BL.A13(parcel, this.A03);
    }
}
