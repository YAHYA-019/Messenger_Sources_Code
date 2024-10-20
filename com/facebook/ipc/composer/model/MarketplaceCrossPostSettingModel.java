package com.facebook.ipc.composer.model;

import X.11T;
import X.7zU;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: MarketplaceCrossPostSettingModel.class */
public final class MarketplaceCrossPostSettingModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(96);
    public final String A00;
    public final boolean A01;
    public final boolean A02;

    public MarketplaceCrossPostSettingModel(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A02 = AbJ.A1W(parcel);
    }

    public MarketplaceCrossPostSettingModel(String str, boolean z, boolean z2) {
        C1pq.A08("checkBoxLabel", str);
        this.A00 = str;
        this.A01 = z;
        this.A02 = z2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MarketplaceCrossPostSettingModel)) {
                return false;
            }
            MarketplaceCrossPostSettingModel marketplaceCrossPostSettingModel = (MarketplaceCrossPostSettingModel) obj;
            if (!11T.A0O(this.A00, marketplaceCrossPostSettingModel.A00) || this.A01 != marketplaceCrossPostSettingModel.A01 || this.A02 != marketplaceCrossPostSettingModel.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A02(C1pq.A03(this.A00), this.A01), this.A02);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
