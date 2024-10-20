package com.facebook.inspiration.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbI;
import X.C1pq;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: InspirationVideoTemplateVideoClip.class */
public final class InspirationVideoTemplateVideoClip implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(81);
    public final int A00;
    public final ImmutableList A01;
    public final ImmutableList A02;

    public InspirationVideoTemplateVideoClip(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int readInt = parcel.readInt();
        InspirationVideoTemplateVideoAREffect[] inspirationVideoTemplateVideoAREffectArr = new InspirationVideoTemplateVideoAREffect[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbI.A01(parcel, A0e, inspirationVideoTemplateVideoAREffectArr, i2);
        }
        this.A01 = ImmutableList.copyOf(inspirationVideoTemplateVideoAREffectArr);
        this.A00 = parcel.readInt();
        int readInt2 = parcel.readInt();
        InspirationVideoTemplateVideoIGLUEffect[] inspirationVideoTemplateVideoIGLUEffectArr = new InspirationVideoTemplateVideoIGLUEffect[readInt2];
        while (i < readInt2) {
            i = AbI.A01(parcel, A0e, inspirationVideoTemplateVideoIGLUEffectArr, i);
        }
        this.A02 = ImmutableList.copyOf(inspirationVideoTemplateVideoIGLUEffectArr);
    }

    public InspirationVideoTemplateVideoClip(ImmutableList immutableList, ImmutableList immutableList2, int i) {
        C1pq.A08("arEffects", immutableList);
        this.A01 = immutableList;
        this.A00 = i;
        C1pq.A08("igluEffects", immutableList2);
        this.A02 = immutableList2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationVideoTemplateVideoClip)) {
                return false;
            }
            InspirationVideoTemplateVideoClip inspirationVideoTemplateVideoClip = (InspirationVideoTemplateVideoClip) obj;
            if (!11T.A0O(this.A01, inspirationVideoTemplateVideoClip.A01) || this.A00 != inspirationVideoTemplateVideoClip.A00 || !11T.A0O(this.A02, inspirationVideoTemplateVideoClip.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, (C1pq.A03(this.A01) * 31) + this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A01);
        while (A0b.hasNext()) {
            parcel.writeParcelable((InspirationVideoTemplateVideoAREffect) A0b.next(), i);
        }
        parcel.writeInt(this.A00);
        1Du A0b2 = 1BL.A0b(parcel, this.A02);
        while (A0b2.hasNext()) {
            parcel.writeParcelable((InspirationVideoTemplateVideoIGLUEffect) A0b2.next(), i);
        }
    }
}
