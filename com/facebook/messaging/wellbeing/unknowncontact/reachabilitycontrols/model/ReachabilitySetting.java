package com.facebook.messaging.wellbeing.unknowncontact.reachabilitycontrols.model;

import X.11T;
import X.1BL;
import X.1Du;
import X.4YV;
import X.7zN;
import X.AbF;
import X.AbI;
import X.C1pq;
import X.C3o5;
import X.FKY;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLMessagingReachabilitySettingsSection;
import com.google.common.collect.ImmutableList;

/* loaded from: ReachabilitySetting.class */
public final class ReachabilitySetting implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKY(0);
    public final GraphQLMessagingReachabilitySettingsSection A00;
    public final DeliverySetting A01;
    public final ImmutableList A02;
    public final ImmutableList A03;
    public final ImmutableList A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public ReachabilitySetting(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A05 = parcel.readString();
        this.A01 = (DeliverySetting) parcel.readParcelable(A0e);
        this.A06 = parcel.readString();
        int readInt = parcel.readInt();
        DeliverySetting[] deliverySettingArr = new DeliverySetting[readInt];
        int i = 0;
        int i2 = 0;
        while (i2 < readInt) {
            i2 = AbI.A01(parcel, A0e, deliverySettingArr, i2);
        }
        this.A02 = ImmutableList.copyOf(deliverySettingArr);
        int readInt2 = parcel.readInt();
        MultiIgSetting[] multiIgSettingArr = new MultiIgSetting[readInt2];
        int i3 = 0;
        while (i3 < readInt2) {
            i3 = AbI.A01(parcel, A0e, multiIgSettingArr, i3);
        }
        this.A03 = ImmutableList.copyOf(multiIgSettingArr);
        int readInt3 = parcel.readInt();
        ReachabilitySettingsProposedChanges[] reachabilitySettingsProposedChangesArr = new ReachabilitySettingsProposedChanges[readInt3];
        while (i < readInt3) {
            i = AbI.A01(parcel, A0e, reachabilitySettingsProposedChangesArr, i);
        }
        this.A04 = ImmutableList.copyOf(reachabilitySettingsProposedChangesArr);
        this.A00 = GraphQLMessagingReachabilitySettingsSection.values()[parcel.readInt()];
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        this.A09 = parcel.readString();
    }

    public ReachabilitySetting(GraphQLMessagingReachabilitySettingsSection graphQLMessagingReachabilitySettingsSection, DeliverySetting deliverySetting, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, String str, String str2, String str3, String str4, String str5) {
        C1pq.A08("audience", str);
        this.A05 = str;
        this.A01 = deliverySetting;
        C1pq.A08("deliveryInfoText", str2);
        this.A06 = str2;
        this.A02 = immutableList;
        C1pq.A08("multiIgSettings", immutableList2);
        this.A03 = immutableList2;
        C1pq.A08("proposedChanges", immutableList3);
        this.A04 = immutableList3;
        C1pq.A08("section", graphQLMessagingReachabilitySettingsSection);
        this.A00 = graphQLMessagingReachabilitySettingsSection;
        AbF.A1V(str3);
        this.A07 = str3;
        C1pq.A08("warningDialogueDescription", str4);
        this.A08 = str4;
        C1pq.A08("warningDialogueTitle", str5);
        this.A09 = str5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ReachabilitySetting)) {
                return false;
            }
            ReachabilitySetting reachabilitySetting = (ReachabilitySetting) obj;
            if (!11T.A0O(this.A05, reachabilitySetting.A05) || !11T.A0O(this.A01, reachabilitySetting.A01) || !11T.A0O(this.A06, reachabilitySetting.A06) || !11T.A0O(this.A02, reachabilitySetting.A02) || !11T.A0O(this.A03, reachabilitySetting.A03) || !11T.A0O(this.A04, reachabilitySetting.A04) || this.A00 != reachabilitySetting.A00 || !11T.A0O(this.A07, reachabilitySetting.A07) || !11T.A0O(this.A08, reachabilitySetting.A08) || !11T.A0O(this.A09, reachabilitySetting.A09)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A04, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A04(this.A06, C1pq.A04(this.A01, C1pq.A03(this.A05))))));
        return C1pq.A04(this.A09, C1pq.A04(this.A08, C1pq.A04(this.A07, (A04 * 31) + C3o5.A03(this.A00))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A06);
        1Du A0b = 1BL.A0b(parcel, this.A02);
        while (A0b.hasNext()) {
            parcel.writeParcelable((DeliverySetting) A0b.next(), i);
        }
        1Du A0b2 = 1BL.A0b(parcel, this.A03);
        while (A0b2.hasNext()) {
            parcel.writeParcelable((MultiIgSetting) A0b2.next(), i);
        }
        1Du A0b3 = 1BL.A0b(parcel, this.A04);
        while (A0b3.hasNext()) {
            parcel.writeParcelable((ReachabilitySettingsProposedChanges) A0b3.next(), i);
        }
        7zN.A0z(parcel, this.A00);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
    }
}
