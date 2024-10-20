package com.facebook.browserextensions.ipc.login;

import X.1BL;
import X.AnonymousClass001;
import X.DKf;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: LoginDialogJSBridgeCallData.class */
public final class LoginDialogJSBridgeCallData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new DKf(60);
    public final Uri A00;
    public final Uri A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;
    public final String A07;

    public LoginDialogJSBridgeCallData(Parcel parcel) {
        this.A07 = parcel.readString();
        this.A02 = parcel.readString();
        ArrayList A0s = AnonymousClass001.A0s();
        this.A04 = A0s;
        parcel.readStringList(A0s);
        this.A03 = parcel.readString();
        this.A01 = (Uri) 1BL.A0C(parcel, Uri.class);
        boolean z = false;
        this.A06 = AnonymousClass001.A1Q(parcel.readByte(), 1);
        this.A00 = (Uri) 1BL.A0C(parcel, Uri.class);
        this.A05 = parcel.readByte() == 1 ? true : z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A07);
        parcel.writeString(this.A02);
        parcel.writeStringList(this.A04);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
        parcel.writeByte(this.A06 ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeByte(this.A05 ? (byte) 1 : (byte) 0);
    }
}
