package com.google.android.gms.fido.fido2.api.common;

import X.4YU;
import X.AbstractC01153q8;
import X.JQx;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: UvmEntry.class */
public final class UvmEntry extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(11);
    public final int A00;
    public final short A01;
    public final short A02;

    public UvmEntry(int i, short s, short s2) {
        this.A00 = i;
        this.A01 = s;
        this.A02 = s2;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof UvmEntry) {
            UvmEntry uvmEntry = (UvmEntry) obj;
            if (this.A00 == uvmEntry.A00 && this.A01 == uvmEntry.A01 && this.A02 == uvmEntry.A02) {
                z = true;
            }
        }
        return z;
    }

    public int hashCode() {
        return 4YU.A04(Integer.valueOf(this.A00), Short.valueOf(this.A01), Short.valueOf(this.A02));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A04(parcel, 1, this.A00);
        short s = this.A01;
        parcel.writeInt(262146);
        parcel.writeInt(s);
        short s2 = this.A02;
        parcel.writeInt(262147);
        parcel.writeInt(s2);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
