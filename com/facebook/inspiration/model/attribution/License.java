package com.facebook.inspiration.model.attribution;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.AbI;
import X.C1pq;
import X.C3o5;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: License.class */
public final class License implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(97);
    public final ImmutableList A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public License(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int readInt = parcel.readInt();
        AttributedAsset[] attributedAssetArr = new AttributedAsset[readInt];
        int i = 0;
        while (i < readInt) {
            i = AbI.A01(parcel, A0e, attributedAssetArr, i);
        }
        this.A00 = ImmutableList.copyOf(attributedAssetArr);
        String str = null;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        this.A02 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A03 = C3o5.A0O(parcel);
    }

    public License(ImmutableList immutableList, String str, String str2, String str3) {
        C1pq.A08("attributedAssets", immutableList);
        this.A00 = immutableList;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof License)) {
                return false;
            }
            License license = (License) obj;
            if (!11T.A0O(this.A00, license.A00) || !11T.A0O(this.A01, license.A01) || !11T.A0O(this.A02, license.A02) || !11T.A0O(this.A03, license.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            parcel.writeParcelable((AttributedAsset) A0b.next(), i);
        }
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
    }
}
