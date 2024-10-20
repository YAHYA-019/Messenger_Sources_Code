package com.facebook.messaging.service.model.communitymessaging;

import X.11T;
import X.1BL;
import X.1BM;
import X.AbI;
import X.AbJ;
import X.AbN;
import X.AnonymousClass001;
import X.BwC;
import X.C1pq;
import X.C3o5;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CommunityMessagingThreadSummary.class */
public final class CommunityMessagingThreadSummary implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(27);
    public final Boolean A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    public CommunityMessagingThreadSummary(BwC bwC) {
        this.A01 = null;
        this.A02 = bwC.A00;
        this.A03 = bwC.A01;
        this.A04 = bwC.A02;
        this.A00 = null;
        this.A06 = bwC.A04;
        this.A07 = bwC.A05;
        this.A05 = bwC.A03;
    }

    public CommunityMessagingThreadSummary(Parcel parcel) {
        Boolean bool = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = AbI.A0z(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        this.A00 = parcel.readInt() != 0 ? Boolean.valueOf(1BM.A07(parcel)) : bool;
        this.A06 = 1BM.A07(parcel);
        this.A07 = AbJ.A1W(parcel);
        this.A05 = C3o5.A0O(parcel);
    }

    public CommunityMessagingThreadSummary(Boolean bool, Integer num, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.A01 = num;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = bool;
        this.A06 = z;
        this.A07 = z2;
        this.A05 = str4;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CommunityMessagingThreadSummary)) {
                return false;
            }
            CommunityMessagingThreadSummary communityMessagingThreadSummary = (CommunityMessagingThreadSummary) obj;
            if (!11T.A0O(this.A01, communityMessagingThreadSummary.A01) || !11T.A0O(this.A02, communityMessagingThreadSummary.A02) || !11T.A0O(this.A03, communityMessagingThreadSummary.A03) || !11T.A0O(this.A04, communityMessagingThreadSummary.A04) || !11T.A0O(this.A00, communityMessagingThreadSummary.A00) || this.A06 != communityMessagingThreadSummary.A06 || this.A07 != communityMessagingThreadSummary.A07 || !11T.A0O(this.A05, communityMessagingThreadSummary.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, C1pq.A02(C1pq.A02(C1pq.A04(this.A00, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A03(this.A01))))), this.A06), this.A07));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CommunityMessagingThreadSummary{errorCode=");
        A0k.append(this.A01);
        A0k.append(", errorDescription=");
        A0k.append(this.A02);
        A0k.append(", errorDetailExtra=");
        A0k.append(this.A03);
        A0k.append(", errorSummary=");
        A0k.append(this.A04);
        A0k.append(", shouldShowBlockedUserWarning=");
        A0k.append(this.A00);
        A0k.append(", shouldShowErrorDialog=");
        A0k.append(this.A06);
        A0k.append(", status=");
        A0k.append(this.A07);
        A0k.append(", threadId=");
        A0k.append(this.A05);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0f(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        AbN.A0s(parcel, this.A00);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A07 ? 1 : 0);
        1BL.A13(parcel, this.A05);
    }
}
