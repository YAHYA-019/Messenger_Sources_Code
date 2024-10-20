package com.google.android.gms.fido.fido2.api.common;

import X.0Q8;
import X.AbstractC00481b7;
import X.AbstractC01153q8;
import X.AbstractC09524qc;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.C1fa;
import X.JQx;
import X.JQz;
import X.JR0;
import X.KQG;
import X.Kz1;
import X.LGn;
import X.LdJ;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.Arrays;
import java.util.List;

/* loaded from: PublicKeyCredentialRequestOptions.class */
public final class PublicKeyCredentialRequestOptions extends RequestOptions {
    public static final Parcelable.Creator CREATOR = LGn.A00(99);
    public ResultReceiver A00;
    public final AuthenticationExtensions A01;
    public final TokenBinding A02;
    public final Double A03;
    public final Integer A04;
    public final String A05;
    public final List A06;
    public final byte[] A07;
    public final UserVerificationRequirement A08;
    public final Long A09;

    public PublicKeyCredentialRequestOptions(ResultReceiver resultReceiver, AuthenticationExtensions authenticationExtensions, TokenBinding tokenBinding, Double d, Integer num, Long l, String str, String str2, String str3, List list, byte[] bArr) {
        this.A00 = resultReceiver;
        if (str3 != null) {
            LdJ.A01.A00.DCA();
            Kz1.A0A.DCA();
            throw 0Q8.createAndThrow();
        }
        AbstractC00481b7.A02(bArr);
        this.A07 = bArr;
        this.A03 = d;
        AbstractC00481b7.A02(str);
        this.A05 = str;
        this.A06 = list;
        this.A04 = num;
        this.A02 = tokenBinding;
        this.A09 = l;
        if (str2 != null) {
            try {
                this.A08 = UserVerificationRequirement.A00(str2);
            } catch (KQG e) {
                throw new IllegalArgumentException((Throwable) e);
            }
        }
        this.A01 = authenticationExtensions;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialRequestOptions)) {
            return false;
        }
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
        if (!Arrays.equals(this.A07, publicKeyCredentialRequestOptions.A07) || !AbstractC09524qc.A00(this.A03, publicKeyCredentialRequestOptions.A03) || !AbstractC09524qc.A00(this.A05, publicKeyCredentialRequestOptions.A05)) {
            return false;
        }
        List list = this.A06;
        List list2 = publicKeyCredentialRequestOptions.A06;
        if (list == null) {
            if (list2 != null) {
                return false;
            }
        } else if (list2 == null || !list.containsAll(list2) || !list2.containsAll(list)) {
            return false;
        }
        if (AbstractC09524qc.A00(this.A04, publicKeyCredentialRequestOptions.A04) && AbstractC09524qc.A00(this.A02, publicKeyCredentialRequestOptions.A02) && AbstractC09524qc.A00(this.A08, publicKeyCredentialRequestOptions.A08) && AbstractC09524qc.A00(this.A01, publicKeyCredentialRequestOptions.A01)) {
            return JR0.A1X(this.A09, publicKeyCredentialRequestOptions.A09);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.A07)), this.A03, this.A05, this.A06, this.A04, this.A02, this.A08, this.A01, this.A09});
    }

    public final String toString() {
        AuthenticationExtensions authenticationExtensions = this.A01;
        UserVerificationRequirement userVerificationRequirement = this.A08;
        TokenBinding tokenBinding = this.A02;
        List list = this.A06;
        String A00 = C1fa.A00(this.A07);
        String valueOf = String.valueOf(list);
        String valueOf2 = String.valueOf(tokenBinding);
        String valueOf3 = String.valueOf(userVerificationRequirement);
        String valueOf4 = String.valueOf(authenticationExtensions);
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PublicKeyCredentialRequestOptions{\n challenge=");
        A0k.append(A00);
        A0k.append(", \n timeoutSeconds=");
        A0k.append(this.A03);
        A0k.append(", \n rpId='");
        A0k.append(this.A05);
        A0k.append("', \n allowList=");
        A0k.append(valueOf);
        A0k.append(", \n requestId=");
        A0k.append(this.A04);
        A0k.append(", \n tokenBinding=");
        A0k.append(valueOf2);
        A0k.append(", \n userVerification=");
        A0k.append(valueOf3);
        A0k.append(", \n authenticationExtensions=");
        A0k.append(valueOf4);
        A0k.append(", \n longRequestId=");
        return AbstractC2327GOs.A0U(this.A09, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A0B(parcel, this.A07, 2);
        Double d = this.A03;
        if (d != null) {
            parcel.writeInt(524291);
            parcel.writeDouble(d.doubleValue());
        }
        AbstractC01153q8.A08(parcel, this.A05, 4);
        AbstractC01153q8.A0A(parcel, this.A06, 5);
        Integer num = this.A04;
        if (num != null) {
            parcel.writeInt(262150);
            JQz.A16(parcel, num);
        }
        AbstractC01153q8.A07(parcel, this.A02, 7, i);
        UserVerificationRequirement userVerificationRequirement = this.A08;
        String str = null;
        if (userVerificationRequirement != null) {
            str = userVerificationRequirement.toString();
        }
        AbstractC01153q8.A08(parcel, str, 8);
        AbstractC01153q8.A07(parcel, this.A01, 9, i);
        Long l = this.A09;
        if (l != null) {
            parcel.writeInt(524298);
            parcel.writeLong(l.longValue());
        }
        AbstractC01153q8.A07(parcel, this.A00, 12, i);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
