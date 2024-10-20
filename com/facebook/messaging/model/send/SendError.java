package com.facebook.messaging.model.send;

import X.4YV;
import X.5PN;
import X.82M;
import X.C53v;
import X.C8P;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.base.MoreObjects;

/* loaded from: SendError.class */
public final class SendError implements Parcelable {
    public static final SendError A08 = new SendError(5PN.A09);
    public static final Parcelable.Creator CREATOR = new 82M(49);
    public final int A00;
    public final long A01;
    public final 5PN A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public SendError(5PN r302) {
        this.A02 = r302;
        this.A06 = null;
        this.A03 = null;
        this.A07 = null;
        this.A01 = -1;
        this.A04 = null;
        this.A00 = -1;
        this.A05 = null;
    }

    public SendError(5PN r302, String str, String str2, String str3, String str4, String str5, int i, long j) {
        this.A02 = r302;
        this.A06 = str4;
        this.A03 = str;
        this.A07 = str5;
        this.A01 = j;
        this.A04 = str2;
        this.A00 = i;
        this.A05 = str3;
    }

    public SendError(C8P c8p) {
        this.A02 = c8p.A02;
        this.A06 = c8p.A05;
        this.A03 = c8p.A03;
        this.A07 = c8p.A06;
        this.A01 = c8p.A01;
        this.A04 = null;
        this.A00 = c8p.A00;
        this.A05 = c8p.A04;
    }

    public SendError(Parcel parcel) {
        5PN A07 = C53v.A07(parcel, 5PN.class);
        A07.getClass();
        this.A02 = A07;
        this.A06 = parcel.readString();
        this.A03 = parcel.readString();
        this.A07 = parcel.readString();
        this.A01 = parcel.readLong();
        this.A04 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A05 = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("timeStamp", this.A01);
        stringHelper.add(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, this.A02.serializedString);
        stringHelper.add("errorMessage", this.A06);
        stringHelper.add("errorNumber", this.A00);
        return 4YV.A0s(stringHelper, this.A04, "errorUrl");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C53v.A0J(parcel, this.A02);
        parcel.writeString(this.A06);
        parcel.writeString(this.A03);
        parcel.writeString(this.A07);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A05);
    }
}
