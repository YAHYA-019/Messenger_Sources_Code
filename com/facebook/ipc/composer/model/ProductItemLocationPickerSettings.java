package com.facebook.ipc.composer.model;

import X.1BM;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ProductItemLocationPickerSettings.class */
public final class ProductItemLocationPickerSettings implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSR.A00(5);
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;

    public ProductItemLocationPickerSettings(Parcel parcel) {
        this.A00 = AnonymousClass001.A1Q(C3o5.A01(parcel, this), 1);
        this.A01 = 1BM.A07(parcel);
        this.A02 = AbJ.A1W(parcel);
    }

    public ProductItemLocationPickerSettings(boolean z, boolean z2, boolean z3) {
        this.A00 = z;
        this.A01 = z2;
        this.A02 = z3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ProductItemLocationPickerSettings)) {
                return false;
            }
            ProductItemLocationPickerSettings productItemLocationPickerSettings = (ProductItemLocationPickerSettings) obj;
            if (this.A00 != productItemLocationPickerSettings.A00 || this.A01 != productItemLocationPickerSettings.A01 || this.A02 != productItemLocationPickerSettings.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A02(C1pq.A02(C1pq.A05(this.A00), this.A01), this.A02);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
