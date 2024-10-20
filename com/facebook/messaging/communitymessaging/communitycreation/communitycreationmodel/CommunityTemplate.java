package com.facebook.messaging.communitymessaging.communitycreation.communitycreationmodel;

import X.11T;
import X.1BL;
import X.7zT;
import X.AnonymousClass002;
import X.BMB;
import X.C04v;
import X.C1u3;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CommunityTemplate.class */
public final class CommunityTemplate extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(64);
    public final int A00;
    public final C1u3 A01;
    public final BMB A02;
    public final String A03;
    public final String A04;

    public CommunityTemplate(C1u3 c1u3, BMB bmb, String str, String str2, int i) {
        7zT.A1W(bmb, str, str2, c1u3);
        this.A02 = bmb;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = c1u3;
        this.A00 = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CommunityTemplate)) {
                return false;
            }
            CommunityTemplate communityTemplate = (CommunityTemplate) obj;
            if (this.A02 != communityTemplate.A02 || !11T.A0O(this.A04, communityTemplate.A04) || !11T.A0O(this.A03, communityTemplate.A03) || this.A01 != communityTemplate.A01 || this.A00 != communityTemplate.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.A01, AnonymousClass002.A07(this.A03, AnonymousClass002.A07(this.A04, 1BL.A03(this.A02)))) + this.A00;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        1BL.A12(parcel, this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        1BL.A12(parcel, this.A01);
        parcel.writeInt(this.A00);
    }
}
