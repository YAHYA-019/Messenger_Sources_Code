package com.facebook.videocodec.effects.model;

import X.AbM;
import X.AnonymousClass001;
import X.C3o5;
import X.DKH;
import X.FKb;
import X.Qty;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: DoodleLineMetadata.class */
public final class DoodleLineMetadata implements Parcelable {
    public static volatile Qty A04;
    public static final Parcelable.Creator CREATOR = FKb.A00(17);
    public final float A00;
    public final int A01;
    public final Qty A02;
    public final Set A03;

    public DoodleLineMetadata(Qty qty, Set set, float f, int i) {
        this.A02 = qty;
        this.A01 = i;
        this.A00 = f;
        this.A03 = Collections.unmodifiableSet(set);
    }

    public DoodleLineMetadata(Parcel parcel) {
        this.A02 = C3o5.A01(parcel, this) == 0 ? null : Qty.values()[parcel.readInt()];
        this.A01 = parcel.readInt();
        this.A00 = parcel.readFloat();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A03 = Collections.unmodifiableSet(A0v);
    }

    public Qty A00() {
        if (this.A03.contains("brushType")) {
            return this.A02;
        }
        if (A04 == null) {
            synchronized (this) {
                if (A04 == null) {
                    A04 = Qty.A02;
                }
            }
        }
        return A04;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DoodleLineMetadata)) {
                return false;
            }
            DoodleLineMetadata doodleLineMetadata = (DoodleLineMetadata) obj;
            if (A00() != doodleLineMetadata.A00() || this.A01 != doodleLineMetadata.A01 || this.A00 != doodleLineMetadata.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbM.A00(((C3o5.A03(A00()) + 31) * 31) + this.A01, this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(DKH.A05(parcel, this.A02));
        parcel.writeInt(this.A01);
        parcel.writeFloat(this.A00);
        Iterator A0S = C3o5.A0S(parcel, this.A03);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
