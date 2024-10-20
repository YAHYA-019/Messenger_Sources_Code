package com.facebook.payments.checkout.configuration.model;

import X.11T;
import X.1Du;
import X.4YV;
import X.AbI;
import X.AbL;
import X.C1pq;
import X.DKH;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: CouponCodeScreenComponent.class */
public final class CouponCodeScreenComponent implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(70);
    public final ImmutableList A00;
    public final boolean A01;
    public final String A02;

    public CouponCodeScreenComponent(Parcel parcel) {
        ImmutableList copyOf;
        ClassLoader A0e = 4YV.A0e(this);
        if (parcel.readInt() == 0) {
            copyOf = null;
        } else {
            int readInt = parcel.readInt();
            CouponCode[] couponCodeArr = new CouponCode[readInt];
            int i = 0;
            while (i < readInt) {
                i = AbI.A01(parcel, A0e, couponCodeArr, i);
            }
            copyOf = ImmutableList.copyOf(couponCodeArr);
        }
        this.A00 = copyOf;
        this.A01 = DKH.A1W(parcel);
        this.A02 = parcel.readString();
    }

    public CouponCodeScreenComponent(ImmutableList immutableList, String str, boolean z) {
        this.A00 = immutableList;
        this.A01 = z;
        this.A02 = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CouponCodeScreenComponent)) {
                return false;
            }
            CouponCodeScreenComponent couponCodeScreenComponent = (CouponCodeScreenComponent) obj;
            if (!11T.A0O(this.A00, couponCodeScreenComponent.A00) || this.A01 != couponCodeScreenComponent.A01 || !11T.A0O(this.A02, couponCodeScreenComponent.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A02(C1pq.A03(this.A00), this.A01));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ImmutableList immutableList = this.A00;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                parcel.writeParcelable((CouponCode) A0Y.next(), i);
            }
        }
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeString(this.A02);
    }
}
