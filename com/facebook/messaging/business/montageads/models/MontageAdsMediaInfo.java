package com.facebook.messaging.business.montageads.models;

import X.11T;
import X.1BL;
import X.4YV;
import X.C1pq;
import X.C3o5;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.business.common.calltoaction.model.AdCallToAction;

/* loaded from: MontageAdsMediaInfo.class */
public final class MontageAdsMediaInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSW(38);
    public final int A00;
    public final int A01;
    public final int A02;
    public final AdCallToAction A03;
    public final MontageAdsImage A04;
    public final MontageAdsVideo A05;
    public final String A06;
    public final String A07;

    public MontageAdsMediaInfo(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A00 = parcel.readInt();
        MontageAdsVideo montageAdsVideo = null;
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (AdCallToAction) AdCallToAction.CREATOR.createFromParcel(parcel);
        }
        this.A01 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = (MontageAdsImage) parcel.readParcelable(A0e);
        }
        this.A06 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        this.A02 = parcel.readInt();
        this.A05 = parcel.readInt() != 0 ? (MontageAdsVideo) parcel.readParcelable(A0e) : montageAdsVideo;
    }

    public MontageAdsMediaInfo(AdCallToAction adCallToAction, MontageAdsImage montageAdsImage, MontageAdsVideo montageAdsVideo, String str, String str2, int i, int i2, int i3) {
        this.A00 = i;
        this.A03 = adCallToAction;
        this.A01 = i2;
        this.A04 = montageAdsImage;
        C1pq.A08("itemId", str);
        this.A06 = str;
        this.A07 = str2;
        this.A02 = i3;
        this.A05 = montageAdsVideo;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MontageAdsMediaInfo)) {
                return false;
            }
            MontageAdsMediaInfo montageAdsMediaInfo = (MontageAdsMediaInfo) obj;
            if (this.A00 != montageAdsMediaInfo.A00 || !11T.A0O(this.A03, montageAdsMediaInfo.A03) || this.A01 != montageAdsMediaInfo.A01 || !11T.A0O(this.A04, montageAdsMediaInfo.A04) || !11T.A0O(this.A06, montageAdsMediaInfo.A06) || !11T.A0O(this.A07, montageAdsMediaInfo.A07) || this.A02 != montageAdsMediaInfo.A02 || !11T.A0O(this.A05, montageAdsMediaInfo.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, (C1pq.A04(this.A07, C1pq.A04(this.A06, C1pq.A04(this.A04, (C1pq.A04(this.A03, this.A00 + 31) * 31) + this.A01))) * 31) + this.A02);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        AdCallToAction adCallToAction = this.A03;
        if (adCallToAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            adCallToAction.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A01);
        C3o5.A0d(parcel, this.A04, i);
        parcel.writeString(this.A06);
        1BL.A13(parcel, this.A07);
        parcel.writeInt(this.A02);
        C3o5.A0d(parcel, this.A05, i);
    }
}
