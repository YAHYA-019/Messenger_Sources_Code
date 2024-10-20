package com.google.android.gms.auth.api.identity;

import X.AbM;
import X.AbstractC00481b7;
import X.AbstractC01153q8;
import X.AbstractC09524qc;
import X.JQx;
import X.JQy;
import X.JR0;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: SignInPassword.class */
public final class SignInPassword extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(68);
    public final String A00;
    public final String A01;

    public SignInPassword(String str, String str2) {
        AbstractC00481b7.A03(str, "Account identifier cannot be null");
        String trim = str.trim();
        AbstractC00481b7.A06(trim, "Account identifier cannot be empty");
        this.A00 = trim;
        AbstractC00481b7.A04(str2);
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof SignInPassword) {
            SignInPassword signInPassword = (SignInPassword) obj;
            if (AbstractC09524qc.A00(this.A00, signInPassword.A00)) {
                z = JR0.A1X(this.A01, signInPassword.A01);
            }
        }
        return z;
    }

    public int hashCode() {
        return AbM.A05(this.A00, this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A08(parcel, this.A00, 1);
        JQy.A16(parcel, this.A01, A0E);
    }
}
