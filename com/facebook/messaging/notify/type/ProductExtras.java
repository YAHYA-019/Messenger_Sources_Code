package com.facebook.messaging.notify.type;

import X.11T;
import X.1BL;
import X.C04v;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ProductExtras.class */
public final class ProductExtras extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CST(93);
    public final Integer A00;
    public final String A01;

    public ProductExtras(Integer num, String str) {
        1BL.A1F(num, str);
        this.A00 = num;
        this.A01 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ProductExtras)) {
                return false;
            }
            ProductExtras productExtras = (ProductExtras) obj;
            if (this.A00 != productExtras.A00 || !11T.A0O(this.A01, productExtras.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int intValue = this.A00.intValue();
        return (((1 != intValue ? "ROLL_CALL" : "PAYMENT").hashCode() + intValue) * 31) + this.A01.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(1 - this.A00.intValue() != 0 ? "ROLL_CALL" : "PAYMENT");
        parcel.writeString(this.A01);
    }
}
