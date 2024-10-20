package com.google.android.gms.wearable.internal;

import X.AbstractC01153q8;
import X.AnonymousClass001;
import X.JQx;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: zzk.class */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(73);
    public final byte A00;
    public final byte A01;
    public final String A02;

    public zzk(String str, byte b, byte b2) {
        this.A00 = b;
        this.A01 = b2;
        this.A02 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            zzk zzkVar = (zzk) obj;
            if (this.A00 != zzkVar.A00 || this.A01 != zzkVar.A01 || !this.A02.equals(zzkVar.A02)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = ((this.A00 + 31) * 31) + this.A01;
        return (i * 31) + this.A02.hashCode();
    }

    public final String toString() {
        byte b = this.A00;
        byte b2 = this.A01;
        String str = this.A02;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AmsEntityUpdateParcelable{, mEntityId=");
        A0k.append((int) b);
        A0k.append(", mAttributeId=");
        A0k.append((int) b2);
        A0k.append(", mValue='");
        A0k.append(str);
        return AnonymousClass001.A0d("'}", A0k);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        byte b = this.A00;
        parcel.writeInt(262146);
        parcel.writeInt(b);
        byte b2 = this.A01;
        parcel.writeInt(262147);
        parcel.writeInt(b2);
        AbstractC01153q8.A08(parcel, this.A02, 4);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
