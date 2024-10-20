package com.google.android.gms.fido.fido2.api.common;

import X.0Pz;
import X.AbM;
import X.AbstractC00481b7;
import X.AbstractC01153q8;
import X.JQx;
import X.JQy;
import X.KQB;
import X.KQD;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: PublicKeyCredentialParameters.class */
public final class PublicKeyCredentialParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(98);
    public final COSEAlgorithmIdentifier A00;
    public final PublicKeyCredentialType A01;

    public PublicKeyCredentialParameters(String str, int i) {
        AbstractC00481b7.A02(str);
        try {
            this.A01 = PublicKeyCredentialType.A00(str);
            AbstractC00481b7.A02(Integer.valueOf(i));
            try {
                this.A00 = COSEAlgorithmIdentifier.A00(i);
            } catch (KQB e) {
                throw new IllegalArgumentException((Throwable) e);
            }
        } catch (KQD e2) {
            throw new IllegalArgumentException((Throwable) e2);
        }
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof PublicKeyCredentialParameters) {
            PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
            if (this.A01.equals(publicKeyCredentialParameters.A01)) {
                z = JQy.A1Z(this.A00, publicKeyCredentialParameters.A00);
            }
        }
        return z;
    }

    public int hashCode() {
        return AbM.A05(this.A01, this.A00);
    }

    public final String toString() {
        return 0Pz.A0z("PublicKeyCredentialParameters{\n type=", String.valueOf(this.A01), ", \n algorithm=", String.valueOf(this.A00), "\n }");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A08(parcel, this.A01.toString(), 2);
        int AWD = this.A00.A00.AWD();
        if (Integer.valueOf(AWD) != null) {
            parcel.writeInt(262147);
            parcel.writeInt(AWD);
        }
        AbstractC01153q8.A03(parcel, A0E);
    }
}
