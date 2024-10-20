package com.facebook.cameracore.ardelivery.model;

import X.0S2;
import X.1BL;
import X.7zU;
import X.DKf;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: ARRequestEffect.class */
public final class ARRequestEffect implements Parcelable {
    public static final Parcelable.Creator CREATOR = DKf.A00(76);
    public Integer A00;
    public String A01;
    public final ARRequestAsset A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public ARRequestEffect(Parcel parcel) {
        this.A02 = (ARRequestAsset) 1BL.A0C(parcel, ARRequestAsset.class);
        this.A03 = parcel.readString();
        this.A05 = parcel.createTypedArrayList(ARRequestAsset.CREATOR);
        this.A04 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = 7zU.A0e(parcel, 2);
    }

    public ARRequestEffect(ARRequestAsset aRRequestAsset, String str, List list) {
        this.A02 = aRRequestAsset;
        this.A05 = list;
        this.A03 = aRRequestAsset.A02.A09;
        this.A04 = str;
        this.A00 = 0S2.A00;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A03);
        parcel.writeTypedList(this.A05);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00.intValue());
    }
}
