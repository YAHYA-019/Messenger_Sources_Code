package com.facebook.payments.p2p.model;

import X.C41w;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.MoreObjects;

/* loaded from: Amount.class */
public class Amount implements Parcelable, C41w {
    public static final Amount A00 = new Amount("USD", 0, 0);
    public static final Amount A01 = new Amount("USD", 0, 0);
    public static final Parcelable.Creator CREATOR = FKZ.A00(85);
    public final int mAmountWithOffset;
    public String mCurrency;
    public final int mOffset;

    public Amount() {
        this.mCurrency = null;
        this.mOffset = -1;
        this.mAmountWithOffset = -1;
    }

    public Amount(Parcel parcel) {
        this.mCurrency = parcel.readString();
        this.mOffset = parcel.readInt();
        this.mAmountWithOffset = parcel.readInt();
        String str = this.mCurrency;
        this.mCurrency = str == null ? "USD" : str;
    }

    public Amount(String str, int i, int i2) {
        this.mCurrency = str;
        this.mOffset = i;
        this.mAmountWithOffset = i2;
        this.mCurrency = str == null ? "USD" : str;
    }

    @Override // X.C41w
    public /* bridge */ /* synthetic */ Object CY7() {
        String str = this.mCurrency;
        if (str == null) {
            str = "USD";
        }
        this.mCurrency = str;
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("currency", this.mCurrency);
        stringHelper.add("offset", this.mOffset);
        stringHelper.add("amount_with_offset", this.mAmountWithOffset);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mCurrency);
        parcel.writeInt(this.mOffset);
        parcel.writeInt(this.mAmountWithOffset);
    }
}
