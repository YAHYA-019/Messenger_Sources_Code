package com.facebook.messaging.service.model.communitymessaging;

import X.11T;
import X.1BL;
import X.AbI;
import X.AbN;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CommunityMessagingThreadSummaryResult.class */
public final class CommunityMessagingThreadSummaryResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(28);
    public final Boolean A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public CommunityMessagingThreadSummaryResult(Parcel parcel) {
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
        this.A00 = parcel.readInt() != 0 ? Boolean.valueOf(AbN.A1U(parcel)) : bool;
        this.A04 = C3o5.A0O(parcel);
    }

    public CommunityMessagingThreadSummaryResult(Integer num, String str, String str2, String str3) {
        this.A01 = num;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = null;
        this.A04 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CommunityMessagingThreadSummaryResult)) {
                return false;
            }
            CommunityMessagingThreadSummaryResult communityMessagingThreadSummaryResult = (CommunityMessagingThreadSummaryResult) obj;
            if (!11T.A0O(this.A01, communityMessagingThreadSummaryResult.A01) || !11T.A0O(this.A02, communityMessagingThreadSummaryResult.A02) || !11T.A0O(this.A03, communityMessagingThreadSummaryResult.A03) || !11T.A0O(this.A00, communityMessagingThreadSummaryResult.A00) || !11T.A0O(this.A04, communityMessagingThreadSummaryResult.A04)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A04, C1pq.A04(this.A00, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A03(this.A01)))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CommunityMessagingThreadSummaryResult{errorCode=");
        A0k.append(this.A01);
        A0k.append(", errorDescription=");
        A0k.append(this.A02);
        A0k.append(", errorSummary=");
        A0k.append(this.A03);
        A0k.append(", shouldShowBlockedUserWarning=");
        A0k.append(this.A00);
        A0k.append(", threadId=");
        A0k.append(this.A04);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0f(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        AbN.A0s(parcel, this.A00);
        1BL.A13(parcel, this.A04);
    }
}
