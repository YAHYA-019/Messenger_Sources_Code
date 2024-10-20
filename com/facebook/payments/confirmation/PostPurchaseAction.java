package com.facebook.payments.confirmation;

import X.11T;
import X.1BL;
import X.4YV;
import X.7zU;
import X.C1pq;
import X.C3o5;
import X.FKZ;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: PostPurchaseAction.class */
public final class PostPurchaseAction implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKZ.A00(29);
    public final PostPurchaseActionSpec$PostPurchaseActionData A00;
    public final Integer A01;
    public final String A02;

    public PostPurchaseAction(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        PostPurchaseActionSpec$PostPurchaseActionData postPurchaseActionSpec$PostPurchaseActionData = null;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        this.A00 = parcel.readInt() != 0 ? (PostPurchaseActionSpec$PostPurchaseActionData) parcel.readParcelable(A0e) : postPurchaseActionSpec$PostPurchaseActionData;
        this.A01 = 7zU.A0e(parcel, 4);
    }

    public PostPurchaseAction(String str, Integer num) {
        this.A02 = str;
        this.A00 = null;
        this.A01 = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PostPurchaseAction)) {
                return false;
            }
            PostPurchaseAction postPurchaseAction = (PostPurchaseAction) obj;
            if (!11T.A0O(this.A02, postPurchaseAction.A02) || !11T.A0O(this.A00, postPurchaseAction.A00) || this.A01 != postPurchaseAction.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A00, C1pq.A03(this.A02));
        Integer num = this.A01;
        return (A04 * 31) + (num == null ? -1 : num.intValue());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A02);
        C3o5.A0d(parcel, this.A00, i);
        parcel.writeInt(this.A01.intValue());
    }
}
