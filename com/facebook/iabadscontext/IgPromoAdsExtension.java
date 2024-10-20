package com.facebook.iabadscontext;

import X.11T;
import X.1BL;
import X.4YW;
import X.7zN;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.DKH;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: IgPromoAdsExtension.class */
public final class IgPromoAdsExtension extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(6);
    public final String A00;
    public final String A01;
    public final List A02;
    public final boolean A03;

    public IgPromoAdsExtension(String str, String str2, List list, boolean z) {
        this.A00 = str;
        this.A02 = list;
        this.A03 = z;
        this.A01 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof IgPromoAdsExtension)) {
                return false;
            }
            IgPromoAdsExtension igPromoAdsExtension = (IgPromoAdsExtension) obj;
            if (!11T.A0O(this.A00, igPromoAdsExtension.A00) || !11T.A0O(this.A02, igPromoAdsExtension.A02) || this.A03 != igPromoAdsExtension.A03 || !11T.A0O(this.A01, igPromoAdsExtension.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass002.A05(this.A02, 1BL.A05(this.A00) * 31) + AnonymousClass002.A00(this.A03 ? 1 : 0)) * 31) + 7zN.A05(this.A01);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("IgPromoAdsExtension(advertiserName=");
        A0k.append(this.A00);
        A0k.append(", promoCodes=");
        A0k.append(this.A02);
        A0k.append(", isAutofillEnabled=");
        A0k.append(this.A03);
        A0k.append(", footerSubtype=");
        return DKH.A0o(this.A01, A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00);
        Iterator A09 = 4YW.A09(parcel, this.A02);
        while (A09.hasNext()) {
            ((IgPromoAdsPromoCode) A09.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A01);
    }
}
