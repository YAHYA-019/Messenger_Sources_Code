package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC01153q8;
import X.AbstractC09524qc;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.C1fa;
import X.JQx;
import X.JR0;
import X.LGn;
import X.Lj7;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: zzai.class */
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(93);
    public final Lj7 A00;
    public final Lj7 A01;
    public final Lj7 A02;
    public final int A03;

    public zzai(Lj7 lj7, Lj7 lj72, Lj7 lj73, int i) {
        this.A00 = lj7;
        this.A01 = lj72;
        this.A02 = lj73;
        this.A03 = i;
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof zzai) {
            zzai zzaiVar = (zzai) obj;
            if (AbstractC09524qc.A00(this.A00, zzaiVar.A00) && AbstractC09524qc.A00(this.A01, zzaiVar.A01) && AbstractC09524qc.A00(this.A02, zzaiVar.A02) && this.A03 == zzaiVar.A03) {
                z = true;
            }
        }
        return z;
    }

    public final int hashCode() {
        return JR0.A0N(this.A00, this.A01, this.A02, Integer.valueOf(this.A03));
    }

    public final String toString() {
        String A00 = C1fa.A00(JR0.A1Y(this.A00));
        String A002 = C1fa.A00(JR0.A1Y(this.A01));
        String A003 = C1fa.A00(JR0.A1Y(this.A02));
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("HmacSecretExtension{coseKeyAgreement=");
        A0k.append(A00);
        A0k.append(", saltEnc=");
        A0k.append(A002);
        A0k.append(", saltAuth=");
        A0k.append(A003);
        A0k.append(", getPinUvAuthProtocol=");
        return AbstractC2327GOs.A0W(A0k, this.A03);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A0B(parcel, JR0.A1Y(this.A00), 1);
        AbstractC01153q8.A0B(parcel, JR0.A1Y(this.A01), 2);
        AbstractC01153q8.A0B(parcel, JR0.A1Y(this.A02), 3);
        AbstractC01153q8.A04(parcel, 4, this.A03);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
