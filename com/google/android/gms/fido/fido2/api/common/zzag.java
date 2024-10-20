package com.google.android.gms.fido.fido2.api.common;

import X.AbstractC00481b7;
import X.AbstractC01153q8;
import X.DKD;
import X.JQx;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: zzag.class */
public final class zzag extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGn.A00(92);
    public final String A00;

    public zzag(String str) {
        AbstractC00481b7.A02(str);
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzag) {
            return this.A00.equals(((zzag) obj).A00);
        }
        return false;
    }

    public final int hashCode() {
        return DKD.A04(this.A00);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.A00;
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A08(parcel, str, 1);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
