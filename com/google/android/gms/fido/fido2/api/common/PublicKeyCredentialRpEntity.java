package com.google.android.gms.fido.fido2.api.common;

import X.0Pz;
import X.4YU;
import X.AbstractC00481b7;
import X.AbstractC01153q8;
import X.AbstractC09524qc;
import X.JQx;
import X.JR0;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: PublicKeyCredentialRpEntity.class */
public final class PublicKeyCredentialRpEntity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(0);
    public final String A00;
    public final String A01;
    public final String A02;

    public PublicKeyCredentialRpEntity(String str, String str2, String str3) {
        AbstractC00481b7.A02(str);
        this.A00 = str;
        AbstractC00481b7.A02(str2);
        this.A01 = str2;
        this.A02 = str3;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof PublicKeyCredentialRpEntity) {
            PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) obj;
            if (AbstractC09524qc.A00(this.A00, publicKeyCredentialRpEntity.A00) && AbstractC09524qc.A00(this.A01, publicKeyCredentialRpEntity.A01)) {
                z = JR0.A1X(this.A02, publicKeyCredentialRpEntity.A02);
            }
        }
        return z;
    }

    public int hashCode() {
        return 4YU.A04(this.A00, this.A01, this.A02);
    }

    public final String toString() {
        return 0Pz.A12("PublicKeyCredentialRpEntity{\n id='", this.A00, "', \n name='", this.A01, "', \n icon='", this.A02, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A08(parcel, this.A00, 2);
        AbstractC01153q8.A08(parcel, this.A01, 3);
        AbstractC01153q8.A08(parcel, this.A02, 4);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
