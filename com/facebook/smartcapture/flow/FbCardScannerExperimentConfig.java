package com.facebook.smartcapture.flow;

import X.11T;
import X.1Br;
import X.1Bu;
import X.FKe;
import X.Fs1;
import X.JLP;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FbCardScannerExperimentConfig.class */
public final class FbCardScannerExperimentConfig implements Parcelable, JLP {
    public static final Parcelable.Creator CREATOR = FKe.A00(24);
    public final float A00;
    public final int A01;
    public final 1Br A02;
    public final boolean A03;

    public FbCardScannerExperimentConfig() {
        this(1, 0.8f, false);
    }

    public FbCardScannerExperimentConfig(int i, float f, boolean z) {
        this.A03 = z;
        this.A01 = i;
        this.A00 = f;
        this.A02 = 1Bu.A00(116432);
    }

    public boolean BT3() {
        1Br.A0C(this.A02);
        return false;
    }

    public boolean BVB(String str) {
        return ((Fs1) 1Br.A0B(this.A02)).BVB(str);
    }

    public boolean BW9() {
        1Br.A0C(this.A02);
        return false;
    }

    public boolean BWC() {
        return ((Fs1) 1Br.A0B(this.A02)).BWC();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A01);
        parcel.writeFloat(this.A00);
    }
}
