package com.facebook.messaging.sharing.broadcastflow.model;

import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.BwD;
import X.C1pq;
import X.C3o5;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: BroadcastFlowRealTimeFetchParam.class */
public final class BroadcastFlowRealTimeFetchParam implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(60);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public BroadcastFlowRealTimeFetchParam(BwD bwD) {
        this.A00 = bwD.A00;
        this.A01 = bwD.A01;
        this.A02 = bwD.A02;
        this.A03 = bwD.A03;
        this.A04 = bwD.A04;
        this.A05 = bwD.A05;
    }

    public BroadcastFlowRealTimeFetchParam(Parcel parcel) {
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
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        this.A04 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A05 = C3o5.A0O(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof BroadcastFlowRealTimeFetchParam)) {
                return false;
            }
            BroadcastFlowRealTimeFetchParam broadcastFlowRealTimeFetchParam = (BroadcastFlowRealTimeFetchParam) obj;
            if (!11T.A0O(this.A00, broadcastFlowRealTimeFetchParam.A00) || !11T.A0O(this.A01, broadcastFlowRealTimeFetchParam.A01) || !11T.A0O(this.A02, broadcastFlowRealTimeFetchParam.A02) || !11T.A0O(this.A03, broadcastFlowRealTimeFetchParam.A03) || !11T.A0O(this.A04, broadcastFlowRealTimeFetchParam.A04) || !11T.A0O(this.A05, broadcastFlowRealTimeFetchParam.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00))))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("BroadcastFlowRealTimeFetchParam{originalContentFbid=");
        A0k.append(this.A00);
        A0k.append(", originalContentOwnerFbid=");
        A0k.append(this.A01);
        A0k.append(", shareContentType=");
        A0k.append(this.A02);
        A0k.append(", shareSource=");
        A0k.append(this.A03);
        A0k.append(", topLevelContentFbid=");
        A0k.append(this.A04);
        A0k.append(", topLevelContentOwnerFbid=");
        A0k.append(this.A05);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A00);
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        1BL.A13(parcel, this.A05);
    }
}
