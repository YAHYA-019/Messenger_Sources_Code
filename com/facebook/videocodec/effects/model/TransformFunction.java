package com.facebook.videocodec.effects.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.7zM;
import X.C1pq;
import X.C3o5;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: TransformFunction.class */
public final class TransformFunction implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(20);
    public final long A00;
    public final ImmutableList A01;

    public TransformFunction(Parcel parcel) {
        int A01 = C3o5.A01(parcel, this);
        Float[] fArr = new Float[A01];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= A01) {
                this.A01 = ImmutableList.copyOf(fArr);
                this.A00 = parcel.readLong();
                return;
            } else {
                fArr[i2] = Float.valueOf(parcel.readFloat());
                i = i2 + 1;
            }
        }
    }

    public TransformFunction(ImmutableList immutableList, long j) {
        C1pq.A08("bezierCurve", immutableList);
        this.A01 = immutableList;
        this.A00 = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof TransformFunction)) {
                return false;
            }
            TransformFunction transformFunction = (TransformFunction) obj;
            if (!11T.A0O(this.A01, transformFunction.A01) || this.A00 != transformFunction.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A01(C1pq.A03(this.A01), this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A01);
        while (A0b.hasNext()) {
            parcel.writeFloat(7zM.A00(A0b.next()));
        }
        parcel.writeLong(this.A00);
    }
}
