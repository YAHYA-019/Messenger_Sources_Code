package com.facebook.messaging.communitymessaging.model;

import X.11T;
import X.1BL;
import X.4YV;
import X.AbN;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BSy;
import X.C04v;
import X.C3o5;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CommunityExtraData.class */
public final class CommunityExtraData extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(84);
    public final long A00;
    public final Boolean A01;
    public final Integer A02;
    public final Integer A03;
    public final Long A04;
    public final String A05;
    public final String A06;

    public CommunityExtraData(Boolean bool, Integer num, Integer num2, Long l, String str, String str2, long j) {
        11T.A0F(str, 1);
        this.A06 = str;
        this.A00 = j;
        this.A04 = l;
        this.A01 = bool;
        this.A05 = str2;
        this.A03 = num;
        this.A02 = num2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CommunityExtraData)) {
                return false;
            }
            CommunityExtraData communityExtraData = (CommunityExtraData) obj;
            if (!11T.A0O(this.A06, communityExtraData.A06) || this.A00 != communityExtraData.A00 || !11T.A0O(this.A04, communityExtraData.A04) || !11T.A0O(this.A01, communityExtraData.A01) || !11T.A0O(this.A05, communityExtraData.A05) || !11T.A0O(this.A03, communityExtraData.A03) || this.A02 != communityExtraData.A02) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A02 = (((((((AnonymousClass002.A02(this.A00, 4YV.A02(this.A06)) + AnonymousClass001.A02(this.A04)) * 31) + AnonymousClass001.A02(this.A01)) * 31) + 1BL.A05(this.A05)) * 31) + AnonymousClass001.A02(this.A03)) * 31;
        Integer num = this.A02;
        if (num != null) {
            i = BSy.A00(num).hashCode() + num.intValue();
        }
        return A02 + i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A06);
        parcel.writeLong(this.A00);
        C3o5.A0g(parcel, this.A04);
        AbN.A0s(parcel, this.A01);
        parcel.writeString(this.A05);
        C3o5.A0f(parcel, this.A03);
        Integer num = this.A02;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(BSy.A00(num));
        }
    }
}
