package com.facebook.messaging.wellbeing.unknowncontact.reachabilitycontrols.model;

import X.11T;
import X.7zN;
import X.7zU;
import X.C1pq;
import X.C3o5;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLMessagingReachabilitySettingsSection;

/* loaded from: ReachabilitySection.class */
public final class ReachabilitySection implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(99);
    public final GraphQLMessagingReachabilitySettingsSection A00;
    public final String A01;

    public ReachabilitySection(Parcel parcel) {
        this.A01 = 7zU.A0l(parcel, this);
        this.A00 = GraphQLMessagingReachabilitySettingsSection.values()[parcel.readInt()];
    }

    public ReachabilitySection(GraphQLMessagingReachabilitySettingsSection graphQLMessagingReachabilitySettingsSection, String str) {
        this.A01 = str;
        this.A00 = graphQLMessagingReachabilitySettingsSection;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ReachabilitySection)) {
                return false;
            }
            ReachabilitySection reachabilitySection = (ReachabilitySection) obj;
            if (!11T.A0O(this.A01, reachabilitySection.A01) || this.A00 != reachabilitySection.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = C1pq.A03(this.A01);
        return (A03 * 31) + C3o5.A03(this.A00);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        7zN.A0z(parcel, this.A00);
    }
}
