package com.facebook.iabadscontext;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.DKH;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: IABBwPayPalExtension.class */
public final class IABBwPayPalExtension extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKf(2);
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public IABBwPayPalExtension(String str, String str2, boolean z, boolean z2) {
        11T.A0F(str, 3);
        this.A02 = z;
        this.A03 = z2;
        this.A01 = str;
        this.A00 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof IABBwPayPalExtension)) {
                return false;
            }
            IABBwPayPalExtension iABBwPayPalExtension = (IABBwPayPalExtension) obj;
            if (this.A02 != iABBwPayPalExtension.A02 || this.A03 != iABBwPayPalExtension.A03 || !11T.A0O(this.A01, iABBwPayPalExtension.A01) || !11T.A0O(this.A00, iABBwPayPalExtension.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A07(this.A01, ((AnonymousClass002.A00(this.A02 ? 1 : 0) * 31) + AnonymousClass002.A00(this.A03 ? 1 : 0)) * 31) + 1BL.A05(this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("IABBwPayPalExtension(acceleratePayPalLogin=");
        A0k.append(this.A02);
        A0k.append(", enableCta=");
        A0k.append(this.A03);
        A0k.append(", testVariant=");
        A0k.append(this.A01);
        A0k.append(", signedExternalOfferId=");
        return DKH.A0o(this.A00, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
