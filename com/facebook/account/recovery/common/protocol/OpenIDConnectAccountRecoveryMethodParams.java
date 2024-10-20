package com.facebook.account.recovery.common.protocol;

import X.AnonymousClass001;
import X.C53v;
import X.CJm;
import X.LGo;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: OpenIDConnectAccountRecoveryMethodParams.class */
public final class OpenIDConnectAccountRecoveryMethodParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGo(78);
    public final Integer A00;
    public final String A01;
    public final List A02;
    public final List A03;
    public final boolean A04;

    public OpenIDConnectAccountRecoveryMethodParams(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = parcel.createStringArrayList();
        this.A03 = parcel.createStringArrayList();
        this.A00 = CJm.A00(parcel.readString());
        String readString = parcel.readString();
        if (!readString.equals("GOOGLE")) {
            throw AnonymousClass001.A0L(readString);
        }
        this.A04 = C53v.A0S(parcel);
    }

    public OpenIDConnectAccountRecoveryMethodParams(Integer num, String str, List list, List list2) {
        this.A01 = str;
        this.A02 = list;
        this.A03 = list2;
        this.A00 = num;
        this.A04 = false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeStringList(this.A02);
        parcel.writeStringList(this.A03);
        parcel.writeString(CJm.A02(this.A00));
        parcel.writeString("GOOGLE");
        parcel.writeInt(this.A04 ? 1 : 0);
    }
}
