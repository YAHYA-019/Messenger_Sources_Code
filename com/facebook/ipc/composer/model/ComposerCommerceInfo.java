package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.4YV;
import X.C1pq;
import X.C3o5;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ComposerCommerceInfo.class */
public final class ComposerCommerceInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(8);
    public final MarketplaceCrossPostSettingModel A00;
    public final ProductItemLocationPickerSettings A01;
    public final String A02;

    public ComposerCommerceInfo(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        ProductItemLocationPickerSettings productItemLocationPickerSettings = null;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (MarketplaceCrossPostSettingModel) parcel.readParcelable(A0e);
        }
        this.A01 = parcel.readInt() != 0 ? (ProductItemLocationPickerSettings) parcel.readParcelable(A0e) : productItemLocationPickerSettings;
    }

    public ComposerCommerceInfo(MarketplaceCrossPostSettingModel marketplaceCrossPostSettingModel, ProductItemLocationPickerSettings productItemLocationPickerSettings, String str) {
        this.A02 = str;
        this.A00 = marketplaceCrossPostSettingModel;
        this.A01 = productItemLocationPickerSettings;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ComposerCommerceInfo)) {
                return false;
            }
            ComposerCommerceInfo composerCommerceInfo = (ComposerCommerceInfo) obj;
            if (!11T.A0O(this.A02, composerCommerceInfo.A02) || !11T.A0O(this.A00, composerCommerceInfo.A00) || !11T.A0O(this.A01, composerCommerceInfo.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A04(this.A00, C1pq.A03(this.A02)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A02);
        C3o5.A0d(parcel, this.A00, i);
        C3o5.A0d(parcel, this.A01, i);
    }
}
