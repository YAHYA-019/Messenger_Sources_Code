package com.google.android.gms.fido.fido2.api.common;

import X.0Pz;
import X.AbstractC00481b7;
import X.AbstractC01153q8;
import X.AbstractC09524qc;
import X.C1fa;
import X.JQx;
import X.JR0;
import X.K6O;
import X.LGm;
import X.Lj7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: PublicKeyCredentialUserEntity.class */
public final class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(2);
    public final Lj7 A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public PublicKeyCredentialUserEntity(byte[] bArr, String str, String str2, String str3) {
        K6O A0k = JR0.A0k(bArr);
        AbstractC00481b7.A02(A0k);
        this.A00 = A0k;
        AbstractC00481b7.A02(str);
        this.A01 = str;
        this.A02 = str2;
        AbstractC00481b7.A02(str3);
        this.A03 = str3;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof PublicKeyCredentialUserEntity) {
            PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
            if (AbstractC09524qc.A00(this.A00, publicKeyCredentialUserEntity.A00) && AbstractC09524qc.A00(this.A01, publicKeyCredentialUserEntity.A01) && AbstractC09524qc.A00(this.A02, publicKeyCredentialUserEntity.A02)) {
                z = JR0.A1X(this.A03, publicKeyCredentialUserEntity.A03);
            }
        }
        return z;
    }

    public int hashCode() {
        return JR0.A0N(this.A00, this.A01, this.A02, this.A03);
    }

    public final String toString() {
        return 0Pz.A15("PublicKeyCredentialUserEntity{\n id=", C1fa.A00(this.A00.A04()), ", \n name='", this.A01, "', \n icon='", this.A02, "', \n displayName='", this.A03, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A0B(parcel, this.A00.A04(), 2);
        AbstractC01153q8.A08(parcel, this.A01, 3);
        AbstractC01153q8.A08(parcel, this.A02, 4);
        AbstractC01153q8.A08(parcel, this.A03, 5);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
