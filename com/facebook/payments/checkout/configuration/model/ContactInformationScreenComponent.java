package com.facebook.payments.checkout.configuration.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.7zN;
import X.AbI;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.payments.contactinfo.model.ContactInfo;
import com.facebook.payments.contactinfo.model.ContactInfoType;
import com.google.common.collect.ImmutableList;

/* loaded from: ContactInformationScreenComponent.class */
public final class ContactInformationScreenComponent implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKY.A00(67);
    public final ContactInfo A00;
    public final ContactInfo A01;
    public final ContactInfo A02;
    public final ImmutableList A03;
    public final ImmutableList A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public ContactInformationScreenComponent(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        int readInt = parcel.readInt();
        ContactInfoType[] contactInfoTypeArr = new ContactInfoType[readInt];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= readInt) {
                break;
            }
            contactInfoTypeArr[i2] = ContactInfoType.values()[parcel.readInt()];
            i = i2 + 1;
        }
        this.A03 = ImmutableList.copyOf(contactInfoTypeArr);
        int readInt2 = parcel.readInt();
        ContactInfo[] contactInfoArr = new ContactInfo[readInt2];
        int i3 = 0;
        while (i3 < readInt2) {
            i3 = AbI.A01(parcel, A0e, contactInfoArr, i3);
        }
        this.A04 = ImmutableList.copyOf(contactInfoArr);
        ContactInfo contactInfo = null;
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (ContactInfo) parcel.readParcelable(A0e);
        }
        this.A07 = DKH.A1W(parcel);
        this.A06 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (ContactInfo) parcel.readParcelable(A0e);
        }
        this.A02 = parcel.readInt() != 0 ? (ContactInfo) parcel.readParcelable(A0e) : contactInfo;
    }

    public ContactInformationScreenComponent(ContactInfo contactInfo, ContactInfo contactInfo2, ContactInfo contactInfo3, ImmutableList immutableList, ImmutableList immutableList2, String str, String str2, boolean z) {
        C1pq.A08("contactInfoTypesToShow", immutableList);
        this.A03 = immutableList;
        C1pq.A08("contactInfos", immutableList2);
        this.A04 = immutableList2;
        this.A05 = str;
        this.A00 = contactInfo;
        this.A07 = z;
        C1pq.A08("screenComponentType", str2);
        this.A06 = str2;
        this.A01 = contactInfo2;
        this.A02 = contactInfo3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ContactInformationScreenComponent)) {
                return false;
            }
            ContactInformationScreenComponent contactInformationScreenComponent = (ContactInformationScreenComponent) obj;
            if (!11T.A0O(this.A03, contactInformationScreenComponent.A03) || !11T.A0O(this.A04, contactInformationScreenComponent.A04) || !11T.A0O(this.A05, contactInformationScreenComponent.A05) || !11T.A0O(this.A00, contactInformationScreenComponent.A00) || this.A07 != contactInformationScreenComponent.A07 || !11T.A0O(this.A06, contactInformationScreenComponent.A06) || !11T.A0O(this.A01, contactInformationScreenComponent.A01) || !11T.A0O(this.A02, contactInformationScreenComponent.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A04(this.A06, C1pq.A02(C1pq.A04(this.A00, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A03(this.A03)))), this.A07))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1Du A0b = 1BL.A0b(parcel, this.A03);
        while (A0b.hasNext()) {
            7zN.A0z(parcel, (ContactInfoType) A0b.next());
        }
        1Du A0b2 = 1BL.A0b(parcel, this.A04);
        while (A0b2.hasNext()) {
            parcel.writeParcelable((Parcelable) A0b2.next(), i);
        }
        1BL.A13(parcel, this.A05);
        C3o5.A0d(parcel, this.A00, i);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeString(this.A06);
        C3o5.A0d(parcel, this.A01, i);
        C3o5.A0d(parcel, this.A02, i);
    }
}
