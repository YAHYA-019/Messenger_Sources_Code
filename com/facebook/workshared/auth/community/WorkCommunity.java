package com.facebook.workshared.auth.community;

import X.11T;
import X.1BL;
import X.7zN;
import X.C04v;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: WorkCommunity.class */
public final class WorkCommunity extends C04v implements Parcelable {
    public static final FKb CREATOR = FKb.A00(41);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public WorkCommunity(String str, String str2, String str3, String str4) {
        this.A02 = str;
        this.A00 = str2;
        this.A03 = str3;
        this.A01 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof WorkCommunity)) {
                return false;
            }
            WorkCommunity workCommunity = (WorkCommunity) obj;
            if (!11T.A0O(this.A02, workCommunity.A02) || !11T.A0O(this.A00, workCommunity.A00) || !11T.A0O(this.A03, workCommunity.A03) || !11T.A0O(this.A01, workCommunity.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((1BL.A05(this.A02) * 31) + 1BL.A05(this.A00)) * 31) + 1BL.A05(this.A03)) * 31) + 7zN.A05(this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
    }
}
