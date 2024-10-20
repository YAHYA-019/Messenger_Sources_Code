package com.facebook.video.creativeediting.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbI;
import X.AbJ;
import X.AbL;
import X.AbM;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: ClipMetaData.class */
public final class ClipMetaData implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKb.A00(1);
    public final double A00;
    public final float A01;
    public final ImmutableList A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public ClipMetaData(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            int readInt = parcel.readInt();
            ClipEffectMeta[] clipEffectMetaArr = new ClipEffectMeta[readInt];
            int i = 0;
            while (i < readInt) {
                i = AbI.A01(parcel, A0e, clipEffectMetaArr, i);
            }
            this.A02 = ImmutableList.copyOf(clipEffectMetaArr);
        }
        this.A05 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A06 = AbJ.A1W(parcel);
        this.A03 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A04 = C3o5.A0O(parcel);
        this.A01 = parcel.readFloat();
        this.A00 = parcel.readDouble();
    }

    public ClipMetaData(ImmutableList immutableList, String str, String str2, double d, float f, boolean z, boolean z2) {
        this.A02 = immutableList;
        this.A05 = z;
        this.A06 = z2;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = f;
        this.A00 = d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ClipMetaData)) {
                return false;
            }
            ClipMetaData clipMetaData = (ClipMetaData) obj;
            if (!11T.A0O(this.A02, clipMetaData.A02) || this.A05 != clipMetaData.A05 || this.A06 != clipMetaData.A06 || !11T.A0O(this.A03, clipMetaData.A03) || !11T.A0O(this.A04, clipMetaData.A04) || this.A01 != clipMetaData.A01 || this.A00 != clipMetaData.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A00(this.A00, AbM.A00(C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A02(C1pq.A02(C1pq.A03(this.A02), this.A05), this.A06))), this.A01));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ImmutableList immutableList = this.A02;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                parcel.writeParcelable((ClipEffectMeta) A0Y.next(), i);
            }
        }
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        parcel.writeFloat(this.A01);
        parcel.writeDouble(this.A00);
    }
}
