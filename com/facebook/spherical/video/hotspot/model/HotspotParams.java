package com.facebook.spherical.video.hotspot.model;

import X.11T;
import X.7zU;
import X.AbF;
import X.C1pq;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.proxygen.TraceFieldType;

/* loaded from: HotspotParams.class */
public final class HotspotParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKe.A00(31);
    public final String A00;
    public final String A01;
    public final String A02;

    public HotspotParams(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public HotspotParams(String str, String str2, String str3) {
        AbF.A1T(str);
        this.A00 = str;
        C1pq.A08("instanceId", str2);
        this.A01 = str2;
        C1pq.A08(TraceFieldType.Uri, str3);
        this.A02 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof HotspotParams)) {
                return false;
            }
            HotspotParams hotspotParams = (HotspotParams) obj;
            if (!11T.A0O(this.A00, hotspotParams.A00) || !11T.A0O(this.A01, hotspotParams.A01) || !11T.A0O(this.A02, hotspotParams.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
