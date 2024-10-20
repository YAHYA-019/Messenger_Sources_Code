package com.facebook.auth.protocol;

import X.1BL;
import X.4YU;
import X.AbI;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.auth.component.listener.interfaces.AuthenticationResult;
import com.facebook.auth.credentials.FacebookCredentials;
import com.facebook.common.util.TriState;

/* loaded from: AuthenticationResultImpl.class */
public final class AuthenticationResultImpl implements AuthenticationResult {
    public static final Parcelable.Creator CREATOR = DKf.A00(31);
    public final FacebookCredentials A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final TriState A06;
    public final Integer A07;

    public AuthenticationResultImpl(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A00 = (FacebookCredentials) 1BL.A0C(parcel, FacebookCredentials.class);
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A06 = TriState.fromDbValue(parcel.readInt());
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A07 = AbI.A0z(parcel);
    }

    public AuthenticationResultImpl(FacebookCredentials facebookCredentials, TriState triState, Integer num, String str, String str2, String str3, String str4, String str5) {
        str.getClass();
        this.A03 = str;
        this.A00 = facebookCredentials;
        this.A02 = str2;
        this.A01 = str3;
        this.A06 = triState == null ? TriState.UNSET : triState;
        this.A04 = str4;
        this.A05 = str5;
        this.A07 = num;
    }

    public AuthenticationResultImpl(FacebookCredentials facebookCredentials, TriState triState, String str, String str2, String str3, String str4) {
        this(facebookCredentials, triState, 4YU.A0k(), str, str2, null, str3, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A06.getDbValue());
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A07.intValue());
    }
}
