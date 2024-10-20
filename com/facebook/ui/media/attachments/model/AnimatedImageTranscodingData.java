package com.facebook.ui.media.attachments.model;

import X.0RZ;
import X.11T;
import X.1BL;
import X.1Du;
import X.7zM;
import X.7zU;
import X.AnonymousClass001;
import X.C1pq;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: AnimatedImageTranscodingData.class */
public final class AnimatedImageTranscodingData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKe(85);
    public final ImmutableList A00;
    public final Float A01;
    public final Float A02;
    public final Float A03;
    public final String A04;

    public AnimatedImageTranscodingData(Parcel parcel) {
        this.A04 = 7zU.A0l(parcel, this);
        int readInt = parcel.readInt();
        Float[] fArr = new Float[readInt];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= readInt) {
                this.A00 = ImmutableList.copyOf(fArr);
                this.A01 = Float.valueOf(parcel.readFloat());
                this.A02 = Float.valueOf(parcel.readFloat());
                this.A03 = Float.valueOf(parcel.readFloat());
                return;
            }
            fArr[i2] = Float.valueOf(parcel.readFloat());
            i = i2 + 1;
        }
    }

    public AnimatedImageTranscodingData(ImmutableList immutableList, Float f, Float f2, Float f3, String str) {
        C1pq.A08("animatedImageUri", str);
        this.A04 = str;
        C1pq.A08("positionData", immutableList);
        this.A00 = immutableList;
        C1pq.A08("rotationCenterX", f);
        this.A01 = f;
        C1pq.A08("rotationCenterY", f2);
        this.A02 = f2;
        C1pq.A08("rotationDegree", f3);
        this.A03 = f3;
        0RZ.A04(AnonymousClass001.A1Q(this.A00.size(), 8));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AnimatedImageTranscodingData)) {
                return false;
            }
            AnimatedImageTranscodingData animatedImageTranscodingData = (AnimatedImageTranscodingData) obj;
            if (!11T.A0O(this.A04, animatedImageTranscodingData.A04) || !11T.A0O(this.A00, animatedImageTranscodingData.A00) || !11T.A0O(this.A01, animatedImageTranscodingData.A01) || !11T.A0O(this.A02, animatedImageTranscodingData.A02) || !11T.A0O(this.A03, animatedImageTranscodingData.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A03(this.A04)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            parcel.writeFloat(7zM.A00(A0b.next()));
        }
        parcel.writeFloat(this.A01.floatValue());
        parcel.writeFloat(this.A02.floatValue());
        parcel.writeFloat(this.A03.floatValue());
    }
}
