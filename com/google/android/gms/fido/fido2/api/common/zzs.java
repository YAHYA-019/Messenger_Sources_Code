package com.google.android.gms.fido.fido2.api.common;

import X.AbF;
import X.AbstractC00481b7;
import X.AbstractC01153q8;
import X.DKD;
import X.JQx;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: zzs.class */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(23);
    public final List A00;

    public zzs(List list) {
        AbstractC00481b7.A02(list);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof zzs) {
            List list = this.A00;
            List list2 = ((zzs) obj).A00;
            if (list.containsAll(list2) && list2.containsAll(list)) {
                z = true;
            }
        }
        return z;
    }

    public final int hashCode() {
        return DKD.A04(AbF.A1E(this.A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.A00;
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A0A(parcel, list, 1);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
