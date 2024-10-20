package com.facebook.ipc.composer.model;

import X.11T;
import X.1BL;
import X.AbN;
import X.C1pq;
import X.C3o5;
import X.FKa;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLXFBBizMessagingRecurringNotificationsFrequency;

/* loaded from: MarketingMessagesTopic.class */
public final class MarketingMessagesTopic implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKa.A00(95);
    public final GraphQLXFBBizMessagingRecurringNotificationsFrequency A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public MarketingMessagesTopic(Parcel parcel) {
        String str = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A00 = null;
        } else {
            this.A00 = GraphQLXFBBizMessagingRecurringNotificationsFrequency.values()[parcel.readInt()];
        }
        this.A03 = AbN.A1U(parcel);
        this.A01 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A02 = C3o5.A0O(parcel);
    }

    public MarketingMessagesTopic(GraphQLXFBBizMessagingRecurringNotificationsFrequency graphQLXFBBizMessagingRecurringNotificationsFrequency, String str, String str2, boolean z) {
        this.A00 = graphQLXFBBizMessagingRecurringNotificationsFrequency;
        this.A03 = z;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof MarketingMessagesTopic)) {
                return false;
            }
            MarketingMessagesTopic marketingMessagesTopic = (MarketingMessagesTopic) obj;
            if (this.A00 != marketingMessagesTopic.A00 || this.A03 != marketingMessagesTopic.A03 || !11T.A0O(this.A01, marketingMessagesTopic.A01) || !11T.A0O(this.A02, marketingMessagesTopic.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A02(C3o5.A03(this.A00) + 31, this.A03)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0e(parcel, this.A00);
        parcel.writeInt(this.A03 ? 1 : 0);
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
    }
}
