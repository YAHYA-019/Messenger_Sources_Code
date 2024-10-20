package com.facebook.xapp.messaging.threadview.theme.custom.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.C1pq;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: GradientBackground.class */
public final class GradientBackground implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(71);
    public final int A00;
    public final int A01;
    public final ImmutableList A02;

    /* JADX WARN: Multi-variable type inference failed */
    public GradientBackground(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int readInt = parcel.readInt();
        GradientParams[] gradientParamsArr = new GradientParams[readInt];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= readInt) {
                this.A02 = ImmutableList.copyOf(gradientParamsArr);
                this.A00 = parcel.readInt();
                this.A01 = parcel.readInt();
                return;
            }
            gradientParamsArr[i2] = parcel.readParcelable(A0e);
            i = i2 + 1;
        }
    }

    public GradientBackground(ImmutableList immutableList, int i, int i2) {
        C1pq.A08("gradients", immutableList);
        this.A02 = immutableList;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof GradientBackground)) {
                return false;
            }
            GradientBackground gradientBackground = (GradientBackground) obj;
            if (!11T.A0O(this.A02, gradientBackground.A02) || this.A00 != gradientBackground.A00 || this.A01 != gradientBackground.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((C1pq.A03(this.A02) * 31) + this.A00) * 31) + this.A01;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A02);
        while (A0b.hasNext()) {
            parcel.writeParcelable((GradientParams) A0b.next(), i);
        }
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
