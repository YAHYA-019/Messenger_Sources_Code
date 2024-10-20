package com.facebook.messaging.business.montageads.models;

import X.11T;
import X.1BL;
import X.4YV;
import X.AbF;
import X.C1pq;
import X.C3o5;
import X.CSW;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MontageAdsVideo.class */
public final class MontageAdsVideo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSW(39);
    public final int A00;
    public final int A01;
    public final int A02;
    public final Uri A03;
    public final String A04;
    public final String A05;

    public MontageAdsVideo(Uri uri, String str, String str2, int i, int i2, int i3) {
        this.A04 = str;
        this.A00 = i;
        this.A01 = i2;
        AbF.A1T(str2);
        this.A05 = str2;
        this.A03 = uri;
        this.A02 = i3;
    }

    public MontageAdsVideo(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        Uri uri = null;
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A05 = parcel.readString();
        this.A03 = parcel.readInt() != 0 ? (Uri) parcel.readParcelable(A0e) : uri;
        this.A02 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MontageAdsVideo)) {
                return false;
            }
            MontageAdsVideo montageAdsVideo = (MontageAdsVideo) obj;
            if (!11T.A0O(this.A04, montageAdsVideo.A04) || this.A00 != montageAdsVideo.A00 || this.A01 != montageAdsVideo.A01 || !11T.A0O(this.A05, montageAdsVideo.A05) || !11T.A0O(this.A03, montageAdsVideo.A03) || this.A02 != montageAdsVideo.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A04(this.A03, C1pq.A04(this.A05, (((C1pq.A03(this.A04) * 31) + this.A00) * 31) + this.A01)) * 31) + this.A02;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A04);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A05);
        C3o5.A0d(parcel, this.A03, i);
        parcel.writeInt(this.A02);
    }
}
