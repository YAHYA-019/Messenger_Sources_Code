package com.google.android.gms.fido.fido2.api.common;

import X.1BK;
import X.AbstractC01153q8;
import X.AbstractC09524qc;
import X.AnonymousClass001;
import X.JQx;
import X.JR0;
import X.KQC;
import X.KYB;
import X.Kje;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: AuthenticatorErrorResponse.class */
public final class AuthenticatorErrorResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator CREATOR = LGm.A00(19);
    public final ErrorCode A00;
    public final String A01;
    public final int A02;

    public AuthenticatorErrorResponse(int i, String str, int i2) {
        try {
            for (ErrorCode errorCode : ErrorCode.values()) {
                if (i == errorCode.zzb) {
                    this.A00 = errorCode;
                    this.A01 = str;
                    this.A02 = i2;
                    return;
                }
            }
            throw new Exception(String.format(Locale.US, "Error code %d is not supported", AnonymousClass001.A1a(i)));
        } catch (KQC e) {
            throw new IllegalArgumentException((Throwable) e);
        }
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof AuthenticatorErrorResponse) {
            AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
            if (AbstractC09524qc.A00(this.A00, authenticatorErrorResponse.A00) && AbstractC09524qc.A00(this.A01, authenticatorErrorResponse.A01)) {
                z = JR0.A1X(Integer.valueOf(this.A02), Integer.valueOf(authenticatorErrorResponse.A02));
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(1BK.A1a(this.A00, this.A01, this.A02));
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, X.Kje] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.Kje] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, X.Kje] */
    public String toString() {
        String A0X = AnonymousClass001.A0X(this);
        ?? obj = new Object();
        A0X.getClass();
        String valueOf = String.valueOf(this.A00.zzb);
        ?? obj2 = new Object();
        obj.A00 = obj2;
        obj2.A01 = valueOf;
        obj2.A02 = "errorCode";
        String str = this.A01;
        if (str != null) {
            ?? obj3 = new Object();
            obj2.A00 = obj3;
            obj3.A01 = str;
            obj3.A02 = "errorMessage";
        }
        return KYB.A00((Kje) obj, A0X);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A04(parcel, 2, this.A00.zzb);
        AbstractC01153q8.A08(parcel, this.A01, 3);
        AbstractC01153q8.A04(parcel, 4, this.A02);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
