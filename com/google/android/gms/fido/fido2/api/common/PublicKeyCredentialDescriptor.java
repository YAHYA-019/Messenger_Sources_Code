package com.google.android.gms.fido.fido2.api.common;

import X.0Pz;
import X.4YU;
import X.AbstractC00481b7;
import X.AbstractC01153q8;
import X.AbstractC09524qc;
import X.C1fa;
import X.JQx;
import X.K60;
import X.K6O;
import X.KQD;
import X.Kc8;
import X.LGn;
import X.Lj7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: PublicKeyCredentialDescriptor.class */
public final class PublicKeyCredentialDescriptor extends AbstractSafeParcelable {
    public static final K60 A03 = K60.A01(new Object[]{Kc8.A00, Kc8.A01}, 2);
    public static final Parcelable.Creator CREATOR = LGn.A00(97);
    public final PublicKeyCredentialType A00;
    public final Lj7 A01;
    public final List A02;

    public PublicKeyCredentialDescriptor(String str, List list, byte[] bArr) {
        K6O A01 = Lj7.A01(bArr, bArr.length);
        AbstractC00481b7.A02(str);
        try {
            this.A00 = PublicKeyCredentialType.A00(str);
            AbstractC00481b7.A02(A01);
            this.A01 = A01;
            this.A02 = list;
        } catch (KQD e) {
            throw new IllegalArgumentException((Throwable) e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialDescriptor)) {
            return false;
        }
        PublicKeyCredentialDescriptor publicKeyCredentialDescriptor = (PublicKeyCredentialDescriptor) obj;
        if (!this.A00.equals(publicKeyCredentialDescriptor.A00) || !AbstractC09524qc.A00(this.A01, publicKeyCredentialDescriptor.A01)) {
            return false;
        }
        List list = this.A02;
        List list2 = publicKeyCredentialDescriptor.A02;
        if (list == null) {
            if (list2 != null) {
                return false;
            }
        } else if (list2 == null || !list.containsAll(list2) || !list2.containsAll(list)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return 4YU.A04(this.A00, this.A01, this.A02);
    }

    public final String toString() {
        return 0Pz.A12("PublicKeyCredentialDescriptor{\n type=", String.valueOf(this.A00), ", \n id=", C1fa.A00(this.A01.A04()), ", \n transports=", String.valueOf(this.A02), "}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A08(parcel, this.A00.toString(), 2);
        AbstractC01153q8.A0B(parcel, this.A01.A04(), 3);
        AbstractC01153q8.A0A(parcel, this.A02, 4);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
