package com.fbpay.w3c;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.4YW;
import X.AbI;
import X.C1pq;
import X.DKH;
import X.LGn;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* loaded from: Contact.class */
public final class Contact implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGn(26);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final String A02;

    public Contact(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int readInt = parcel.readInt();
        Email[] emailArr = new Email[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbI.A01(parcel, A0e, emailArr, i2);
        }
        this.A00 = ImmutableList.copyOf(emailArr);
        this.A02 = DKH.A0l(parcel);
        int readInt2 = parcel.readInt();
        Phone[] phoneArr = new Phone[readInt2];
        while (i < readInt2) {
            i = AbI.A01(parcel, A0e, phoneArr, i);
        }
        this.A01 = ImmutableList.copyOf(phoneArr);
    }

    public Contact(ImmutableList immutableList, ImmutableList immutableList2) {
        C1pq.A08("emails", immutableList);
        this.A00 = immutableList;
        this.A02 = null;
        C1pq.A08("phones", immutableList2);
        this.A01 = immutableList2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Contact)) {
                return false;
            }
            Contact contact = (Contact) obj;
            if (!11T.A0O(this.A00, contact.A00) || !11T.A0O(this.A02, contact.A02) || !11T.A0O(this.A01, contact.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A01, C1pq.A04(this.A02, C1pq.A03(this.A00)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            parcel.writeParcelable((Email) A0b.next(), i);
        }
        4YW.A0E(parcel, this.A02);
        1Du A0b2 = 1BL.A0b(parcel, this.A01);
        while (A0b2.hasNext()) {
            parcel.writeParcelable((Phone) A0b2.next(), i);
        }
    }
}
