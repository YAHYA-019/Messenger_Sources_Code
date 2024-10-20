package com.facebook.inspiration.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.4YW;
import X.AbI;
import X.C1pq;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: InspirationInlineEffectsTrayState.class */
public final class InspirationInlineEffectsTrayState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKf(57);
    public final int A00;
    public final InspirationEffectWithSource A01;
    public final ImmutableList A02;
    public final boolean A03;

    public InspirationInlineEffectsTrayState(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int readInt = parcel.readInt();
        InspirationEffect[] inspirationEffectArr = new InspirationEffect[readInt];
        boolean z = false;
        int i = 0;
        while (i < readInt) {
            i = AbI.A01(parcel, A0e, inspirationEffectArr, i);
        }
        this.A02 = ImmutableList.copyOf(inspirationEffectArr);
        this.A00 = parcel.readInt();
        this.A03 = parcel.readInt() == 1 ? true : z;
        this.A01 = parcel.readInt() == 0 ? null : (InspirationEffectWithSource) parcel.readParcelable(A0e);
    }

    public InspirationInlineEffectsTrayState(InspirationEffectWithSource inspirationEffectWithSource, ImmutableList immutableList, int i, boolean z) {
        C1pq.A08("effectsAppendList", immutableList);
        this.A02 = immutableList;
        this.A00 = i;
        this.A03 = z;
        this.A01 = inspirationEffectWithSource;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationInlineEffectsTrayState)) {
                return false;
            }
            InspirationInlineEffectsTrayState inspirationInlineEffectsTrayState = (InspirationInlineEffectsTrayState) obj;
            if (!11T.A0O(this.A02, inspirationInlineEffectsTrayState.A02) || this.A00 != inspirationInlineEffectsTrayState.A00 || this.A03 != inspirationInlineEffectsTrayState.A03 || !11T.A0O(this.A01, inspirationInlineEffectsTrayState.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A02((C1pq.A03(this.A02) * 31) + this.A00, this.A03));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A02);
        while (A0b.hasNext()) {
            parcel.writeParcelable((InspirationEffect) A0b.next(), i);
        }
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03 ? 1 : 0);
        4YW.A0D(parcel, this.A01, i);
    }
}
