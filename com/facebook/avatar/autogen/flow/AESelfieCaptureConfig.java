package com.facebook.avatar.autogen.flow;

import X.11T;
import X.1BL;
import X.4YV;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.avatar.autogen.download.MsgrModelDownloader;
import com.facebook.smartcapture.resources.DefaultResourcesProvider;

/* loaded from: AESelfieCaptureConfig.class */
public final class AESelfieCaptureConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new DKf(46);
    public final MsgrModelDownloader A00;
    public final Boolean A01;
    public final String A02;
    public final DefaultResourcesProvider A03;

    public AESelfieCaptureConfig(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        Boolean bool = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (MsgrModelDownloader) parcel.readParcelable(A0e);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (DefaultResourcesProvider) parcel.readParcelable(A0e);
        }
        this.A01 = parcel.readInt() != 0 ? Boolean.valueOf(AbN.A1U(parcel)) : bool;
        this.A02 = C3o5.A0O(parcel);
    }

    public AESelfieCaptureConfig(MsgrModelDownloader msgrModelDownloader, Boolean bool, String str) {
        this.A00 = msgrModelDownloader;
        this.A03 = null;
        this.A01 = bool;
        this.A02 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AESelfieCaptureConfig)) {
                return false;
            }
            AESelfieCaptureConfig aESelfieCaptureConfig = (AESelfieCaptureConfig) obj;
            if (!11T.A0O(this.A00, aESelfieCaptureConfig.A00) || !11T.A0O(this.A03, aESelfieCaptureConfig.A03) || !11T.A0O(this.A01, aESelfieCaptureConfig.A01) || !11T.A0O(this.A02, aESelfieCaptureConfig.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A04(this.A03, C1pq.A03(this.A00))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0d(parcel, this.A00, i);
        C3o5.A0d(parcel, this.A03, i);
        AbN.A0s(parcel, this.A01);
        1BL.A13(parcel, this.A02);
    }
}
