package com.facebook.videocodec.effects.model;

import X.11T;
import X.1Du;
import X.4YV;
import X.AbI;
import X.AbL;
import X.C1pq;
import X.FKb;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: MotionEffectGLConfig.class */
public final class MotionEffectGLConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKb.A00(18);
    public final ImmutableList A00;
    public final ImmutableList A01;

    public MotionEffectGLConfig(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        ImmutableList immutableList = null;
        int i = 0;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            int readInt = parcel.readInt();
            TransformFunction[] transformFunctionArr = new TransformFunction[readInt];
            int i2 = 0;
            while (i2 < readInt) {
                i2 = AbI.A01(parcel, A0e, transformFunctionArr, i2);
            }
            this.A00 = ImmutableList.copyOf(transformFunctionArr);
        }
        if (parcel.readInt() != 0) {
            int readInt2 = parcel.readInt();
            TransformStatusNode[] transformStatusNodeArr = new TransformStatusNode[readInt2];
            while (i < readInt2) {
                i = AbI.A01(parcel, A0e, transformStatusNodeArr, i);
            }
            immutableList = ImmutableList.copyOf(transformStatusNodeArr);
        }
        this.A01 = immutableList;
    }

    public MotionEffectGLConfig(ImmutableList immutableList, ImmutableList immutableList2) {
        this.A00 = immutableList;
        this.A01 = immutableList2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MotionEffectGLConfig)) {
                return false;
            }
            MotionEffectGLConfig motionEffectGLConfig = (MotionEffectGLConfig) obj;
            if (!11T.A0O(this.A00, motionEffectGLConfig.A00) || !11T.A0O(this.A01, motionEffectGLConfig.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A03(this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                parcel.writeParcelable((TransformFunction) A0Y.next(), i);
            }
        }
        ImmutableList immutableList2 = this.A01;
        if (immutableList2 == null) {
            parcel.writeInt(0);
            return;
        }
        1Du A0Y2 = AbL.A0Y(parcel, immutableList2);
        while (A0Y2.hasNext()) {
            parcel.writeParcelable((TransformStatusNode) A0Y2.next(), i);
        }
    }
}
