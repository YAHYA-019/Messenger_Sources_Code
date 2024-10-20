package com.google.android.gms.fido.fido2.api.common;

import X.0Q8;
import X.AbstractC09524qc;
import X.AnonymousClass001;
import X.C1fa;
import X.JR0;
import X.K6S;
import X.Kz1;
import X.LGn;
import X.LdJ;
import X.Lip;
import X.Lj7;
import X.LtH;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: PublicKeyCredential.class */
public final class PublicKeyCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(96);
    public final AuthenticationExtensionsClientOutputs A00;
    public final AuthenticatorAssertionResponse A01;
    public final AuthenticatorAttestationResponse A02;
    public final AuthenticatorErrorResponse A03;
    public final Lj7 A04;
    public final String A05;
    public final String A06;
    public final String A07;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x007d, code lost:
    
        r312 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x001c, code lost:
    
        r312 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        if (r305 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r303 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r305 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PublicKeyCredential(com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs r302, com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse r303, com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse r304, com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse r305, java.lang.String r306, java.lang.String r307, java.lang.String r308, byte[] r309) {
        /*
            r301 = this;
            r0 = r309
            if (r0 != 0) goto L83
            r0 = 0
            r310 = r0
        L8:
            r0 = r301
            r0.<init>()
            r0 = 1
            r311 = r0
            r0 = r304
            if (r0 == 0) goto L74
            r0 = r303
            if (r0 != 0) goto L1c
        L17:
            r0 = r305
            if (r0 == 0) goto L7d
        L1c:
            r0 = 0
            r312 = r0
        L1f:
            java.lang.String r0 = "Must provide a response object."
            r313 = r0
            r0 = r312
            r1 = r313
            X.AbstractC00481b7.A08(r0, r1)
            r0 = r305
            if (r0 != 0) goto L39
            r0 = r306
            if (r0 == 0) goto L6e
            r0 = r310
            if (r0 == 0) goto L6e
        L39:
            r0 = r311
            java.lang.String r1 = "Must provide id and rawId if not an error response."
            X.AbstractC00481b7.A08(r0, r1)
            r0 = r301
            r1 = r306
            r0.A05 = r1
            r0 = r301
            r1 = r307
            r0.A06 = r1
            r0 = r301
            r1 = r310
            r0.A04 = r1
            r0 = r301
            r1 = r304
            r0.A02 = r1
            r0 = r301
            r1 = r303
            r0.A01 = r1
            r0 = r301
            r1 = r305
            r0.A03 = r1
            r0 = r301
            r1 = r302
            r0.A00 = r1
            r0 = r301
            r1 = r308
            r0.A07 = r1
            return
        L6e:
            r0 = 0
            r311 = r0
            goto L39
        L74:
            r0 = r303
            if (r0 != 0) goto L17
            r0 = r305
            if (r0 == 0) goto L1c
        L7d:
            r0 = 1
            r312 = r0
            goto L1f
        L83:
            r0 = r309
            int r0 = r0.length
            r314 = r0
            r0 = r309
            r1 = r314
            X.K6O r0 = X.Lj7.A01(r0, r1)
            r310 = r0
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.<init>(com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs, com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse, com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse, com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse, java.lang.String, java.lang.String, java.lang.String, byte[]):void");
    }

    public static Lip A00(LtH ltH, long j) {
        return (Lip) ltH.get(new K6S(j));
    }

    public static void A01(Lj7 lj7, String str, JSONObject jSONObject) {
        jSONObject.put(str, C1fa.A00(lj7.A04()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:256:0x05b1  */
    /* JADX WARN: Type inference failed for: r0v319, types: [byte[], byte[][]] */
    /* JADX WARN: Type inference failed for: r0v365, types: [byte[], byte[][]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A02() {
        /*
            Method dump skipped, instructions count: 1894
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.A02():java.lang.String");
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof PublicKeyCredential) {
            PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
            if (AbstractC09524qc.A00(this.A05, publicKeyCredential.A05) && AbstractC09524qc.A00(this.A06, publicKeyCredential.A06) && AbstractC09524qc.A00(this.A04, publicKeyCredential.A04) && AbstractC09524qc.A00(this.A02, publicKeyCredential.A02) && AbstractC09524qc.A00(this.A01, publicKeyCredential.A01) && AbstractC09524qc.A00(this.A03, publicKeyCredential.A03) && AbstractC09524qc.A00(this.A00, publicKeyCredential.A00)) {
                z = JR0.A1X(this.A07, publicKeyCredential.A07);
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A05, this.A06, this.A04, this.A01, this.A02, this.A03, this.A00, this.A07});
    }

    public final String toString() {
        byte[] A1Y = JR0.A1Y(this.A04);
        String str = this.A06;
        String str2 = this.A05;
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.A02;
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.A01;
        AuthenticatorErrorResponse authenticatorErrorResponse = this.A03;
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.A00;
        String str3 = this.A07;
        String A00 = C1fa.A00(A1Y);
        String valueOf = String.valueOf(authenticatorAttestationResponse);
        String valueOf2 = String.valueOf(authenticatorAssertionResponse);
        String valueOf3 = String.valueOf(authenticatorErrorResponse);
        String valueOf4 = String.valueOf(authenticationExtensionsClientOutputs);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PublicKeyCredential{\n id='");
        A0k.append(str2);
        A0k.append("', \n type='");
        A0k.append(str);
        A0k.append("', \n rawId=");
        A0k.append(A00);
        A0k.append(", \n registerResponse=");
        A0k.append(valueOf);
        A0k.append(", \n signResponse=");
        A0k.append(valueOf2);
        A0k.append(", \n errorResponse=");
        A0k.append(valueOf3);
        A0k.append(", \n extensionsClientOutputs=");
        A0k.append(valueOf4);
        A0k.append(", \n authenticatorAttachment='");
        A0k.append(str3);
        return AnonymousClass001.A0d("'}", A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        LdJ.A01.A00.DCA();
        Kz1.A0A.DCA();
        throw 0Q8.createAndThrow();
    }
}
