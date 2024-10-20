package com.facebook.xapp.messaging.threadview.renderer.photo.components;

import X.11T;
import X.1BL;
import X.1BM;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.FKb;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: FullScreenPhotoParams.class */
public final class FullScreenPhotoParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(70);
    public final Bundle A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public FullScreenPhotoParams(Bundle bundle, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        this.A05 = z;
        this.A06 = z2;
        this.A00 = bundle;
        C1pq.A08("photoId", str);
        this.A01 = str;
        this.A02 = str2;
        C1pq.A08("photoUri", str3);
        this.A03 = str3;
        this.A07 = z3;
        this.A04 = str4;
    }

    public FullScreenPhotoParams(Parcel parcel) {
        boolean z = false;
        this.A05 = AnonymousClass001.A1Q(C3o5.A01(parcel, this), 1);
        this.A06 = 1BM.A07(parcel);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
        }
        this.A01 = parcel.readString();
        this.A02 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A03 = parcel.readString();
        this.A07 = parcel.readInt() == 1 ? true : z;
        this.A04 = C3o5.A0O(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof FullScreenPhotoParams)) {
                return false;
            }
            FullScreenPhotoParams fullScreenPhotoParams = (FullScreenPhotoParams) obj;
            if (this.A05 != fullScreenPhotoParams.A05 || this.A06 != fullScreenPhotoParams.A06 || !11T.A0O(this.A00, fullScreenPhotoParams.A00) || !11T.A0O(this.A01, fullScreenPhotoParams.A01) || !11T.A0O(this.A02, fullScreenPhotoParams.A02) || !11T.A0O(this.A03, fullScreenPhotoParams.A03) || this.A07 != fullScreenPhotoParams.A07 || !11T.A0O(this.A04, fullScreenPhotoParams.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A02(C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A02(C1pq.A05(this.A05), this.A06))))), this.A07));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        Bundle bundle = this.A00;
        if (bundle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, i);
        }
        parcel.writeString(this.A01);
        1BL.A13(parcel, this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A07 ? 1 : 0);
        1BL.A13(parcel, this.A04);
    }
}
