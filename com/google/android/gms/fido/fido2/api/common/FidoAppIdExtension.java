package com.google.android.gms.fido.fido2.api.common;

import X.0Pz;
import X.AbstractC00481b7;
import X.DKD;
import X.JQx;
import X.JQy;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: FidoAppIdExtension.class */
public final class FidoAppIdExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(26);
    public final String A00;

    public FidoAppIdExtension(String str) {
        AbstractC00481b7.A02(str);
        this.A00 = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof FidoAppIdExtension) {
            return this.A00.equals(((FidoAppIdExtension) obj).A00);
        }
        return false;
    }

    public int hashCode() {
        return DKD.A04(this.A00);
    }

    public final String toString() {
        return 0Pz.A0j("FidoAppIdExtension{appid='", this.A00, "'}");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        JQy.A16(parcel, this.A00, JQx.A0E(parcel));
    }
}
