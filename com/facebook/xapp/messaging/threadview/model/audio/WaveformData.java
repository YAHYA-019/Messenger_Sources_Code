package com.facebook.xapp.messaging.threadview.model.audio;

import X.11T;
import X.1BL;
import X.1Du;
import X.82N;
import X.C1pq;
import X.C3o5;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: WaveformData.class */
public final class WaveformData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82N(30);
    public final int A00;
    public final ImmutableList A01;

    public WaveformData(Parcel parcel) {
        int A01 = C3o5.A01(parcel, this);
        Double[] dArr = new Double[A01];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= A01) {
                this.A01 = ImmutableList.copyOf(dArr);
                this.A00 = parcel.readInt();
                return;
            } else {
                dArr[i2] = Double.valueOf(parcel.readDouble());
                i = i2 + 1;
            }
        }
    }

    public WaveformData(ImmutableList immutableList, int i) {
        C1pq.A08("amplitudes", immutableList);
        this.A01 = immutableList;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof WaveformData)) {
                return false;
            }
            WaveformData waveformData = (WaveformData) obj;
            if (!11T.A0O(this.A01, waveformData.A01) || this.A00 != waveformData.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A04(this.A01, 1) * 31) + this.A00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A01);
        while (A0b.hasNext()) {
            parcel.writeDouble(((Number) A0b.next()).doubleValue());
        }
        parcel.writeInt(this.A00);
    }
}
