package com.facebook.ipc.composer.model;

import X.11T;
import X.7zU;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: StoryCrossPostSetting.class */
public final class StoryCrossPostSetting implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(14);
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public StoryCrossPostSetting(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = parcel.readString();
        this.A02 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A03 = AbJ.A1W(parcel);
    }

    public StoryCrossPostSetting(String str, String str2, boolean z, boolean z2) {
        C1pq.A08("checkBoxSubtitle", str);
        this.A00 = str;
        C1pq.A08("checkBoxTitle", str2);
        this.A01 = str2;
        this.A02 = z;
        this.A03 = z2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof StoryCrossPostSetting)) {
                return false;
            }
            StoryCrossPostSetting storyCrossPostSetting = (StoryCrossPostSetting) obj;
            if (!11T.A0O(this.A00, storyCrossPostSetting.A00) || !11T.A0O(this.A01, storyCrossPostSetting.A01) || this.A02 != storyCrossPostSetting.A02 || this.A03 != storyCrossPostSetting.A03) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A02(C1pq.A04(this.A01, C1pq.A03(this.A00)), this.A02), this.A03);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
    }
}
