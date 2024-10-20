package com.facebook.messaging.phoneconfirmation.protocol;

import X.1JF;
import X.24X;
import X.C3o5;
import X.C53v;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.util.JSONUtil;

/* loaded from: RecoveredAccount.class */
public final class RecoveredAccount implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(2);
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public RecoveredAccount(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A06 = parcel.readString();
        this.A07 = C53v.A0S(parcel);
        this.A05 = parcel.readString();
    }

    public RecoveredAccount(String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A03 = str4;
        this.A06 = str5;
        this.A07 = z;
        this.A05 = null;
    }

    public RecoveredAccount(String str, String str2, String str3, String str4, String str5, String str6, int i, boolean z) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A03 = str4;
        this.A06 = str5;
        this.A07 = z;
        this.A05 = str6;
    }

    public static RecoveredAccount A00(24X r301, int i) {
        if (1JF.A0B(JSONUtil.A0H(r301.A0D("account_id"), ""))) {
            return null;
        }
        return new RecoveredAccount(C3o5.A0P(r301, "account_id", ""), C3o5.A0P(r301, "firstname", ""), C3o5.A0P(r301, "lastname", ""), "", C3o5.A0P(r301, "profilepic", ""), C3o5.A0P(r301, "email", ""), i, JSONUtil.A0J(r301.A0D("is_twofac_user"), false));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeString(this.A05);
    }
}
