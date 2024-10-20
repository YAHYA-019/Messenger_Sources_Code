package com.facebook.messaging.communitymessaging.adminassist.adminassistupsell.model;

import X.11T;
import X.C1pq;
import X.C3o5;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: AdminAssistCommandSequence.class */
public final class AdminAssistCommandSequence implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(53);
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public AdminAssistCommandSequence(Parcel parcel) {
        this.A00 = C3o5.A01(parcel, this);
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A01 = parcel.readInt();
    }

    public AdminAssistCommandSequence(String str, int i, String str2, int i2, String str3) {
        this.A00 = i;
        C1pq.A08("commandSequenceId", str);
        this.A02 = str;
        C1pq.A08("commandSequenceMainText", str2);
        this.A03 = str2;
        C1pq.A08("commandSequenceSubText", str3);
        this.A04 = str3;
        this.A01 = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof AdminAssistCommandSequence)) {
                return false;
            }
            AdminAssistCommandSequence adminAssistCommandSequence = (AdminAssistCommandSequence) obj;
            if (this.A00 != adminAssistCommandSequence.A00 || !11T.A0O(this.A02, adminAssistCommandSequence.A02) || !11T.A0O(this.A03, adminAssistCommandSequence.A03) || !11T.A0O(this.A04, adminAssistCommandSequence.A04) || this.A01 != adminAssistCommandSequence.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, this.A00 + 31))) * 31) + this.A01;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A01);
    }
}
