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

/* loaded from: InspirationVideoTemplateVideoIGLUEffectProperty.class */
public final class InspirationVideoTemplateVideoIGLUEffectProperty implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(83);
    public final ImmutableList A00;
    public final Float A01;
    public final String A02;

    public InspirationVideoTemplateVideoIGLUEffectProperty(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A01 = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
        int readInt = parcel.readInt();
        InspirationVideoTemplateVideoIGLUEffectPropertyKeyframe[] inspirationVideoTemplateVideoIGLUEffectPropertyKeyframeArr = new InspirationVideoTemplateVideoIGLUEffectPropertyKeyframe[readInt];
        int i = 0;
        while (i < readInt) {
            i = AbI.A01(parcel, A0e, inspirationVideoTemplateVideoIGLUEffectPropertyKeyframeArr, i);
        }
        this.A00 = ImmutableList.copyOf(inspirationVideoTemplateVideoIGLUEffectPropertyKeyframeArr);
        this.A02 = parcel.readString();
    }

    public InspirationVideoTemplateVideoIGLUEffectProperty(ImmutableList immutableList, Float f, String str) {
        this.A01 = f;
        C1pq.A08("keyframes", immutableList);
        this.A00 = immutableList;
        C1pq.A08("propertyName", str);
        this.A02 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationVideoTemplateVideoIGLUEffectProperty)) {
                return false;
            }
            InspirationVideoTemplateVideoIGLUEffectProperty inspirationVideoTemplateVideoIGLUEffectProperty = (InspirationVideoTemplateVideoIGLUEffectProperty) obj;
            if (!11T.A0O(this.A01, inspirationVideoTemplateVideoIGLUEffectProperty.A01) || !11T.A0O(this.A00, inspirationVideoTemplateVideoIGLUEffectProperty.A00) || !11T.A0O(this.A02, inspirationVideoTemplateVideoIGLUEffectProperty.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A00, C1pq.A03(this.A01)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Float f = this.A01;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        }
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            parcel.writeParcelable((InspirationVideoTemplateVideoIGLUEffectPropertyKeyframe) A0b.next(), i);
        }
        parcel.writeString(this.A02);
    }
}
