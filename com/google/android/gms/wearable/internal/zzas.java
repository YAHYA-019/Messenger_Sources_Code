package com.google.android.gms.wearable.internal;

import X.0Pz;
import X.1BL;
import X.AbstractC00481b7;
import X.AbstractC01153q8;
import X.JQx;
import X.JQz;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: zzas.class */
public final class zzas extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(63);
    public final String A00;
    public final List A01;

    public zzas(String str, List list) {
        this.A00 = str;
        this.A01 = list;
        AbstractC00481b7.A02(str);
        AbstractC00481b7.A02(list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            zzas zzasVar = (zzas) obj;
            String str = this.A00;
            String str2 = zzasVar.A00;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
            List list = this.A01;
            List list2 = zzasVar.A01;
            if (list != null) {
                if (!list.equals(list2)) {
                    return false;
                }
            } else if (list2 != null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int A06 = 1BL.A06(this.A00);
        return ((A06 + 31) * 31) + JQz.A0E(this.A01, 0);
    }

    public final String toString() {
        return 0Pz.A0z("CapabilityInfo{", this.A00, ", ", String.valueOf(this.A01), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A08(parcel, this.A00, 2);
        AbstractC01153q8.A0A(parcel, this.A01, 3);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
