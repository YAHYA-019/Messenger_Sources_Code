package com.facebook.ipc.composer.model;

import X.11T;
import X.C1pq;
import X.C3o5;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;
import com.mapbox.mapboxsdk.style.layers.Property;

/* loaded from: ThrowbackCameraRollMediaInfo.class */
public final class ThrowbackCameraRollMediaInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSR(16);
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public ThrowbackCameraRollMediaInfo(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        this.A02 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
    }

    public ThrowbackCameraRollMediaInfo(String str, String str2, String str3, String str4, int i, int i2) {
        this.A00 = i;
        C1pq.A08("localTargetDs", str);
        this.A02 = str;
        this.A01 = i2;
        C1pq.A08("photoPath", str2);
        this.A03 = str2;
        C1pq.A08("rankingFeatures", str3);
        this.A04 = str3;
        C1pq.A08(Property.SYMBOL_Z_ORDER_SOURCE, str4);
        this.A05 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ThrowbackCameraRollMediaInfo)) {
                return false;
            }
            ThrowbackCameraRollMediaInfo throwbackCameraRollMediaInfo = (ThrowbackCameraRollMediaInfo) obj;
            if (this.A00 != throwbackCameraRollMediaInfo.A00 || !11T.A0O(this.A02, throwbackCameraRollMediaInfo.A02) || this.A01 != throwbackCameraRollMediaInfo.A01 || !11T.A0O(this.A03, throwbackCameraRollMediaInfo.A03) || !11T.A0O(this.A04, throwbackCameraRollMediaInfo.A04) || !11T.A0O(this.A05, throwbackCameraRollMediaInfo.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, (C1pq.A04(this.A02, this.A00 + 31) * 31) + this.A01)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
    }
}
