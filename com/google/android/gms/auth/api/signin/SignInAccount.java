package com.google.android.gms.auth.api.signin;

import X.AbstractC00481b7;
import X.AbstractC01153q8;
import X.JQx;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: SignInAccount.class */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(73);
    public final String zba;
    public final String zbb;
    public final GoogleSignInAccount zbc;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.zbc = googleSignInAccount;
        AbstractC00481b7.A06(str, "8.3 and 8.4 SDKs require non-null email");
        this.zba = str;
        AbstractC00481b7.A06(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.zbb = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zba;
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A08(parcel, str, 4);
        AbstractC01153q8.A07(parcel, this.zbc, 7, i);
        AbstractC01153q8.A08(parcel, this.zbb, 8);
        AbstractC01153q8.A03(parcel, A0E);
    }

    public final GoogleSignInAccount zba() {
        return this.zbc;
    }
}
