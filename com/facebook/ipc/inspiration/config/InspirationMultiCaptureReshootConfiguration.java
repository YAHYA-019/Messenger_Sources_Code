package com.facebook.ipc.inspiration.config;

import X.11T;
import X.AbN;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.photos.creativeediting.model.MusicTrackParams;

/* loaded from: InspirationMultiCaptureReshootConfiguration.class */
public final class InspirationMultiCaptureReshootConfiguration implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(31);
    public final int A00;
    public final MusicTrackParams A01;
    public final boolean A02;

    public InspirationMultiCaptureReshootConfiguration(Parcel parcel) {
        this.A01 = C3o5.A01(parcel, this) == 0 ? null : (MusicTrackParams) MusicTrackParams.CREATOR.createFromParcel(parcel);
        this.A00 = parcel.readInt();
        this.A02 = AbN.A1U(parcel);
    }

    public InspirationMultiCaptureReshootConfiguration(MusicTrackParams musicTrackParams, int i, boolean z) {
        this.A01 = musicTrackParams;
        this.A00 = i;
        this.A02 = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationMultiCaptureReshootConfiguration)) {
                return false;
            }
            InspirationMultiCaptureReshootConfiguration inspirationMultiCaptureReshootConfiguration = (InspirationMultiCaptureReshootConfiguration) obj;
            if (!11T.A0O(this.A01, inspirationMultiCaptureReshootConfiguration.A01) || this.A00 != inspirationMultiCaptureReshootConfiguration.A00 || this.A02 != inspirationMultiCaptureReshootConfiguration.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02((C1pq.A03(this.A01) * 31) + this.A00, this.A02);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("InspirationMultiCaptureReshootConfiguration{musicTrackParams=");
        A0k.append(this.A01);
        A0k.append(", reshotSegmentIndex=");
        A0k.append(this.A00);
        A0k.append(", shouldDisableLandingScreen=");
        return AbstractC2327GOs.A0X(A0k, this.A02);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        MusicTrackParams musicTrackParams = this.A01;
        if (musicTrackParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            musicTrackParams.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
