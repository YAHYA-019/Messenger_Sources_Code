package com.facebook.messaging.dma.initparams.metadataprovider.model;

import X.11T;
import X.82M;
import X.AnonymousClass207;
import X.C04v;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.facebook.xapp.messaging.threadview.initparams.model.ThreadInitParamsMetadata;

/* loaded from: DmaConsentMetadata.class */
public final class DmaConsentMetadata extends C04v implements ThreadInitParamsMetadata {
    public static final AnonymousClass207 A04;
    public static final Parcelable.Creator CREATOR = new 82M(31);
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A04 = new AnonymousClass207(DmaConsentMetadata.class, null);
    }

    public DmaConsentMetadata(boolean z, boolean z2, boolean z3, boolean z4) {
        this.A01 = z;
        this.A00 = z2;
        this.A02 = z3;
        this.A03 = z4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DmaConsentMetadata)) {
                return false;
            }
            DmaConsentMetadata dmaConsentMetadata = (DmaConsentMetadata) obj;
            if (this.A01 != dmaConsentMetadata.A01 || this.A00 != dmaConsentMetadata.A00 || this.A02 != dmaConsentMetadata.A02 || this.A03 != dmaConsentMetadata.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1237;
        if (this.A01) {
            i = 1231;
        }
        int i2 = i * 31;
        int i3 = 1237;
        if (this.A00) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A02) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A03) {
            i7 = 1231;
        }
        return i6 + i7;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
    }
}
