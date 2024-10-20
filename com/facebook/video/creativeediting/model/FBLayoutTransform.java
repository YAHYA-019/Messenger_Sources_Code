package com.facebook.video.creativeediting.model;

import X.4YV;
import X.AbM;
import X.AnonymousClass001;
import X.BLJ;
import X.C1pq;
import X.C3o5;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: FBLayoutTransform.class */
public final class FBLayoutTransform implements Parcelable {
    public static volatile BLJ A09;
    public static final Parcelable.Creator CREATOR = new FKb(2);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final boolean A06;
    public final BLJ A07;
    public final Set A08;

    public FBLayoutTransform(BLJ blj, Set set, float f, float f2, float f3, float f4, int i, int i2, boolean z) {
        this.A07 = blj;
        this.A06 = z;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
        this.A04 = i;
        this.A05 = i2;
        this.A08 = Collections.unmodifiableSet(set);
    }

    public FBLayoutTransform(Parcel parcel) {
        this.A07 = C3o5.A01(parcel, this) == 0 ? null : BLJ.values()[parcel.readInt()];
        int i = 0;
        this.A06 = 4YV.A1U(parcel.readInt());
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readFloat();
        this.A02 = parcel.readFloat();
        this.A03 = parcel.readFloat();
        this.A04 = parcel.readInt();
        this.A05 = parcel.readInt();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A08 = Collections.unmodifiableSet(A0v);
    }

    public BLJ A00() {
        if (this.A08.contains("cropType")) {
            return this.A07;
        }
        if (A09 == null) {
            synchronized (this) {
                if (A09 == null) {
                    A09 = BLJ.A03;
                }
            }
        }
        return A09;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FBLayoutTransform)) {
                return false;
            }
            FBLayoutTransform fBLayoutTransform = (FBLayoutTransform) obj;
            if (A00() != fBLayoutTransform.A00() || this.A06 != fBLayoutTransform.A06 || this.A00 != fBLayoutTransform.A00 || this.A01 != fBLayoutTransform.A01 || this.A02 != fBLayoutTransform.A02 || this.A03 != fBLayoutTransform.A03 || this.A04 != fBLayoutTransform.A04 || this.A05 != fBLayoutTransform.A05) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((AbM.A00(AbM.A00(AbM.A00(AbM.A00(C1pq.A02(C3o5.A03(A00()) + 31, this.A06), this.A00), this.A01), this.A02), this.A03) * 31) + this.A04) * 31) + this.A05;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int ordinal;
        BLJ blj = this.A07;
        if (blj == null) {
            ordinal = 0;
        } else {
            parcel.writeInt(1);
            ordinal = blj.ordinal();
        }
        parcel.writeInt(ordinal);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A03);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A05);
        Iterator A0S = C3o5.A0S(parcel, this.A08);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
