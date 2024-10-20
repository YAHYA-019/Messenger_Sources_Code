package com.facebook.messaging.communitymessaging.model;

import X.11T;
import X.4YU;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.C1779AsD;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: ChannelMember.class */
public final class ChannelMember extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(82);
    public Boolean A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final Member A05;
    public final C1779AsD A06;
    public final boolean A07;

    public ChannelMember(Member member, C1779AsD c1779AsD, Boolean bool, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        11T.A0F(str, 4);
        this.A05 = member;
        this.A06 = c1779AsD;
        this.A07 = z;
        this.A01 = str;
        this.A03 = z2;
        this.A02 = z3;
        this.A04 = z4;
        this.A00 = bool;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ChannelMember)) {
                return false;
            }
            ChannelMember channelMember = (ChannelMember) obj;
            if (!11T.A0O(this.A05, channelMember.A05) || !11T.A0O(this.A06, channelMember.A06) || this.A07 != channelMember.A07 || !11T.A0O(this.A01, channelMember.A01) || this.A03 != channelMember.A03 || this.A02 != channelMember.A02 || this.A04 != channelMember.A04 || !11T.A0O(this.A00, channelMember.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((AnonymousClass002.A07(this.A01, ((((AnonymousClass001.A02(this.A05) * 31) + AnonymousClass001.A02(this.A06)) * 31) + AnonymousClass002.A00(this.A07 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A03 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A02 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A04 ? 1 : 0)) * 31) + 4YU.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        boolean booleanValue;
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A05, i);
        parcel.writeValue(this.A06);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        Boolean bool = this.A00;
        if (bool == null) {
            booleanValue = false;
        } else {
            parcel.writeInt(1);
            booleanValue = bool.booleanValue();
        }
        parcel.writeInt(booleanValue ? 1 : 0);
    }
}
