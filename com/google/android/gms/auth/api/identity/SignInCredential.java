package com.google.android.gms.auth.api.identity;

import X.AbstractC00481b7;
import X.AbstractC01153q8;
import X.AbstractC09524qc;
import X.JQx;
import X.JR0;
import X.LGn;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import java.util.Arrays;

/* loaded from: SignInCredential.class */
public final class SignInCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(67);
    public final Uri A00;
    public final PublicKeyCredential A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public SignInCredential(Uri uri, PublicKeyCredential publicKeyCredential, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC00481b7.A02(str);
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A00 = uri;
        this.A06 = str5;
        this.A07 = str6;
        this.A08 = str7;
        this.A01 = publicKeyCredential;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof SignInCredential) {
            SignInCredential signInCredential = (SignInCredential) obj;
            if (AbstractC09524qc.A00(this.A02, signInCredential.A02) && AbstractC09524qc.A00(this.A03, signInCredential.A03) && AbstractC09524qc.A00(this.A04, signInCredential.A04) && AbstractC09524qc.A00(this.A05, signInCredential.A05) && AbstractC09524qc.A00(this.A00, signInCredential.A00) && AbstractC09524qc.A00(this.A06, signInCredential.A06) && AbstractC09524qc.A00(this.A07, signInCredential.A07) && AbstractC09524qc.A00(this.A08, signInCredential.A08)) {
                z = JR0.A1X(this.A01, signInCredential.A01);
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A03, this.A04, this.A05, this.A00, this.A06, this.A07, this.A08, this.A01});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A08(parcel, this.A02, 1);
        AbstractC01153q8.A08(parcel, this.A03, 2);
        AbstractC01153q8.A08(parcel, this.A04, 3);
        AbstractC01153q8.A08(parcel, this.A05, 4);
        AbstractC01153q8.A07(parcel, this.A00, 5, i);
        AbstractC01153q8.A08(parcel, this.A06, 6);
        AbstractC01153q8.A08(parcel, this.A07, 7);
        AbstractC01153q8.A08(parcel, this.A08, 8);
        AbstractC01153q8.A07(parcel, this.A01, 9, i);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
