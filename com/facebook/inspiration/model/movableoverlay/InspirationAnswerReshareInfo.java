package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.7zU;
import X.C1pq;
import X.FKc;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: InspirationAnswerReshareInfo.class */
public final class InspirationAnswerReshareInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKc.A00(3);
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public InspirationAnswerReshareInfo(Parcel parcel) {
        this.A02 = 7zU.A0l(parcel, this);
        this.A00 = parcel.readInt();
        this.A03 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A04 = parcel.readString();
    }

    public InspirationAnswerReshareInfo(String str, int i, String str2, int i2, String str3) {
        C1pq.A08("answerId", str);
        this.A02 = str;
        this.A00 = i;
        C1pq.A08("question", str2);
        this.A03 = str2;
        this.A01 = i2;
        C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, str3);
        this.A04 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationAnswerReshareInfo)) {
                return false;
            }
            InspirationAnswerReshareInfo inspirationAnswerReshareInfo = (InspirationAnswerReshareInfo) obj;
            if (!11T.A0O(this.A02, inspirationAnswerReshareInfo.A02) || this.A00 != inspirationAnswerReshareInfo.A00 || !11T.A0O(this.A03, inspirationAnswerReshareInfo.A03) || this.A01 != inspirationAnswerReshareInfo.A01 || !11T.A0O(this.A04, inspirationAnswerReshareInfo.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, (C1pq.A04(this.A03, (C1pq.A03(this.A02) * 31) + this.A00) * 31) + this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A04);
    }
}
