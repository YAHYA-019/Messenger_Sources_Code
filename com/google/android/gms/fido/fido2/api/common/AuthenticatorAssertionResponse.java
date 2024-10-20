package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC00481b7;
import X.AbstractC01153q8;
import X.AbstractC09524qc;
import X.AnonymousClass001;
import X.DKD;
import X.JQx;
import X.JR0;
import X.K6O;
import X.KYB;
import X.Kje;
import X.KoQ;
import X.LGm;
import X.Lj7;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: AuthenticatorAssertionResponse.class */
public final class AuthenticatorAssertionResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator CREATOR = LGm.A00(17);
    public final Lj7 A00;
    public final Lj7 A01;
    public final Lj7 A02;
    public final Lj7 A03;
    public final Lj7 A04;

    public AuthenticatorAssertionResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        K6O A0k = JR0.A0k(bArr);
        K6O A0k2 = JR0.A0k(bArr2);
        K6O A0k3 = JR0.A0k(bArr3);
        K6O A0k4 = JR0.A0k(bArr4);
        Lj7 A01 = bArr5 == null ? null : Lj7.A01(bArr5, bArr5.length);
        AbstractC00481b7.A02(A0k);
        this.A00 = A0k;
        AbstractC00481b7.A02(A0k2);
        this.A01 = A0k2;
        AbstractC00481b7.A02(A0k3);
        this.A02 = A0k3;
        AbstractC00481b7.A02(A0k4);
        this.A03 = A0k4;
        this.A04 = A01;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof AuthenticatorAssertionResponse) {
            AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
            if (AbstractC09524qc.A00(this.A00, authenticatorAssertionResponse.A00) && AbstractC09524qc.A00(this.A01, authenticatorAssertionResponse.A01) && AbstractC09524qc.A00(this.A02, authenticatorAssertionResponse.A02) && AbstractC09524qc.A00(this.A03, authenticatorAssertionResponse.A03)) {
                z = JR0.A1X(this.A04, authenticatorAssertionResponse.A04);
            }
        }
        return z;
    }

    public int hashCode() {
        return JR0.A0O(Integer.valueOf(DKD.A04(this.A00)), Integer.valueOf(DKD.A04(this.A01)), Integer.valueOf(DKD.A04(this.A02)), Integer.valueOf(DKD.A04(this.A03)), Integer.valueOf(DKD.A04(this.A04)));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.Kje] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object, X.Kje] */
    public String toString() {
        String A0X = AnonymousClass001.A0X(this);
        ?? obj = new Object();
        A0X.getClass();
        KoQ koQ = KoQ.A00;
        Kje A00 = AuthenticatorResponse.A00(AuthenticatorResponse.A00(AuthenticatorResponse.A00(AuthenticatorResponse.A00(obj, JR0.A0r(koQ, this.A00), "keyHandle"), JR0.A0r(koQ, this.A01), PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA), JR0.A0r(koQ, this.A02), PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA), JR0.A0r(koQ, this.A03), PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE);
        Lj7 lj7 = this.A04;
        if (lj7 != null) {
            String A0r = JR0.A0r(koQ, lj7);
            ?? obj2 = new Object();
            A00.A00 = obj2;
            obj2.A01 = A0r;
            obj2.A02 = PublicKeyCredentialControllerUtility.JSON_KEY_USER_HANDLE;
        }
        return KYB.A00((Kje) obj, A0X);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A0B(parcel, this.A00.A04(), 2);
        AbstractC01153q8.A0B(parcel, this.A01.A04(), 3);
        AbstractC01153q8.A0B(parcel, this.A02.A04(), 4);
        AbstractC01153q8.A0B(parcel, this.A03.A04(), 5);
        AbstractC01153q8.A0B(parcel, JR0.A1Y(this.A04), 6);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
