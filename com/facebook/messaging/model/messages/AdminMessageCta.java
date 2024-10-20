package com.facebook.messaging.model.messages;

import X.11T;
import X.1BL;
import X.7dK;
import X.82M;
import X.C1pq;
import X.C3o5;
import X.FJ8;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AdminMessageCta.class */
public final class AdminMessageCta implements Parcelable {
    public static final Parcelable.Creator CREATOR = new 82M(41);
    public final 7dK A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    public AdminMessageCta(7dK r302, Integer num, String str, String str2) {
        this.A00 = r302;
        this.A01 = num;
        this.A02 = str;
        this.A03 = str2;
    }

    public AdminMessageCta(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = FJ8.A01(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = Integer.valueOf(parcel.readInt());
        }
        this.A02 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A03 = C3o5.A0O(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AdminMessageCta)) {
                return false;
            }
            AdminMessageCta adminMessageCta = (AdminMessageCta) obj;
            if (!11T.A0O(this.A00, adminMessageCta.A00) || !11T.A0O(this.A01, adminMessageCta.A01) || !11T.A0O(this.A02, adminMessageCta.A02) || !11T.A0O(this.A03, adminMessageCta.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A04(this.A00, 1))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        7dK r0 = this.A00;
        if (r0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            FJ8.A0A(parcel, r0);
        }
        C3o5.A0f(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
    }
}
