package com.google.android.gms.fido.fido2.api.common;

import X.AbF;
import X.AbstractC01153q8;
import X.DKD;
import X.JQx;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: UvmEntries.class */
public final class UvmEntries extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(10);
    public final List A00;

    public UvmEntries(List list) {
        this.A00 = list;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UvmEntries)) {
            return false;
        }
        List list = this.A00;
        List list2 = ((UvmEntries) obj).A00;
        return list == null ? list2 == null : list2 != null && list.containsAll(list2) && list2.containsAll(list);
    }

    public int hashCode() {
        List list = this.A00;
        return DKD.A04(list == null ? null : AbF.A1E(list));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A0A(parcel, this.A00, 1);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
