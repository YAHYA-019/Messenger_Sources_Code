package com.google.android.gms.wearable.internal;

import X.AbstractC01153q8;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.JQx;
import X.LGm;
import X.MDA;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: zzhg.class */
public final class zzhg extends AbstractSafeParcelable implements MDA {
    public static final Parcelable.Creator CREATOR = LGm.A00(71);
    public final String A00;
    public final int A01;
    public final String A02;
    public final boolean A03;

    public zzhg(String str, String str2, int i, boolean z) {
        this.A00 = str;
        this.A02 = str2;
        this.A01 = i;
        this.A03 = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzhg) {
            return ((zzhg) obj).A00.equals(this.A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        String str = this.A02;
        String str2 = this.A00;
        int i = this.A01;
        boolean z = this.A03;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Node{");
        A0k.append(str);
        A0k.append(", id=");
        A0k.append(str2);
        A0k.append(", hops=");
        A0k.append(i);
        A0k.append(", isNearby=");
        return AbstractC2327GOs.A0X(A0k, z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A08(parcel, this.A00, 2);
        AbstractC01153q8.A08(parcel, this.A02, 3);
        AbstractC01153q8.A04(parcel, 4, this.A01);
        AbstractC01153q8.A06(parcel, 5, this.A03);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
