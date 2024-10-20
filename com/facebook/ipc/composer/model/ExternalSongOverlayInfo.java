package com.facebook.ipc.composer.model;

import X.11T;
import X.4YW;
import X.AbK;
import X.AbM;
import X.C1pq;
import X.C3o5;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ExternalSongOverlayInfo.class */
public final class ExternalSongOverlayInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(85);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final String A04;
    public final String A05;

    public ExternalSongOverlayInfo(Parcel parcel) {
        this.A04 = AbK.A15(parcel, C3o5.A01(parcel, this));
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readFloat();
        this.A02 = parcel.readFloat();
        this.A03 = parcel.readFloat();
        this.A05 = parcel.readString();
    }

    public ExternalSongOverlayInfo(String str, String str2, float f, float f2, float f3, float f4) {
        this.A04 = str;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
        C1pq.A08("url", str2);
        this.A05 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ExternalSongOverlayInfo)) {
                return false;
            }
            ExternalSongOverlayInfo externalSongOverlayInfo = (ExternalSongOverlayInfo) obj;
            if (!11T.A0O(this.A04, externalSongOverlayInfo.A04) || this.A00 != externalSongOverlayInfo.A00 || this.A01 != externalSongOverlayInfo.A01 || this.A02 != externalSongOverlayInfo.A02 || this.A03 != externalSongOverlayInfo.A03 || !11T.A0O(this.A05, externalSongOverlayInfo.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, AbM.A00(AbM.A00(AbM.A00(AbM.A00(C1pq.A03(this.A04), this.A00), this.A01), this.A02), this.A03));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        4YW.A0E(parcel, this.A04);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A03);
        parcel.writeString(this.A05);
    }
}
