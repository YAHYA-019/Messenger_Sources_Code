package com.instagram.common.clips.model;

import X.11T;
import X.1BL;
import X.4YV;
import X.AnonymousClass001;
import X.JQz;
import X.LGm;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: VideoCropParams.class */
public final class VideoCropParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(88);
    public final double A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public VideoCropParams(double d, float f, float f2, float f3) {
        this.A00 = d;
        this.A01 = f;
        this.A03 = f2;
        this.A02 = f3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoCropParams)) {
                return false;
            }
            VideoCropParams videoCropParams = (VideoCropParams) obj;
            if (Double.compare(this.A00, videoCropParams.A00) != 0 || Float.compare(this.A01, videoCropParams.A01) != 0 || Float.compare(this.A03, videoCropParams.A03) != 0 || Float.compare(this.A02, videoCropParams.A02) != 0) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return JQz.A07(1BL.A00(1BL.A00(1BL.A01(Double.doubleToLongBits(this.A00)) * 31, this.A01), this.A03), this.A02);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("VideoCropParams(timestampUs=");
        A0k.append(this.A00);
        A0k.append(", leftPercent=");
        A0k.append(this.A01);
        A0k.append(", topPercent=");
        A0k.append(this.A03);
        A0k.append(", scale=");
        A0k.append(this.A02);
        return 4YV.A0x(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeDouble(this.A00);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A03);
        parcel.writeFloat(this.A02);
    }
}
