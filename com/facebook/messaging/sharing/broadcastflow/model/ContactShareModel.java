package com.facebook.messaging.sharing.broadcastflow.model;

import X.11T;
import X.1BL;
import X.AbJ;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ContactShareModel.class */
public final class ContactShareModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(62);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    public ContactShareModel(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        this.A07 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A08 = AbJ.A1W(parcel);
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        this.A04 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A05 = C3o5.A0O(parcel);
        this.A06 = parcel.readString();
    }

    public ContactShareModel(String str) {
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A07 = false;
        this.A08 = false;
        this.A03 = null;
        this.A04 = null;
        this.A05 = null;
        this.A06 = str;
    }

    public ContactShareModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A07 = z;
        this.A08 = z2;
        this.A03 = str4;
        this.A04 = str5;
        this.A05 = str6;
        C1pq.A08("sharedContactId", str7);
        this.A06 = str7;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ContactShareModel)) {
                return false;
            }
            ContactShareModel contactShareModel = (ContactShareModel) obj;
            if (!11T.A0O(this.A00, contactShareModel.A00) || !11T.A0O(this.A01, contactShareModel.A01) || !11T.A0O(this.A02, contactShareModel.A02) || this.A07 != contactShareModel.A07 || this.A08 != contactShareModel.A08 || !11T.A0O(this.A03, contactShareModel.A03) || !11T.A0O(this.A04, contactShareModel.A04) || !11T.A0O(this.A05, contactShareModel.A05) || !11T.A0O(this.A06, contactShareModel.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A06, C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A02(C1pq.A02(C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00))), this.A07), this.A08)))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
        parcel.writeString(this.A06);
    }
}
