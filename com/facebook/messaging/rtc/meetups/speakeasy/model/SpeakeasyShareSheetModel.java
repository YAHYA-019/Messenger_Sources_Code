package com.facebook.messaging.rtc.meetups.speakeasy.model;

import X.11T;
import X.1Du;
import X.4YU;
import X.4YV;
import X.7zN;
import X.7zO;
import X.7zU;
import X.AbG;
import X.AbH;
import X.AbI;
import X.AbJ;
import X.AbL;
import X.AnonymousClass001;
import X.BOc;
import X.C1pq;
import X.C3o5;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.inbox.units.InboxTrackableItem;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: SpeakeasyShareSheetModel.class */
public final class SpeakeasyShareSheetModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSS.A00(61);
    public final BOc A00;
    public final InboxTrackableItem A01;
    public final CallLinkModel A02;
    public final SpeakeasyTopicModel A03;
    public final User A04;
    public final ImmutableList A05;
    public final ImmutableList A06;
    public final ImmutableMap A07;
    public final Integer A08;
    public final Long A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final boolean A0E;
    public final boolean A0F;

    public SpeakeasyShareSheetModel(BOc bOc, InboxTrackableItem inboxTrackableItem, CallLinkModel callLinkModel, SpeakeasyTopicModel speakeasyTopicModel, User user, ImmutableList immutableList, ImmutableList immutableList2, ImmutableMap immutableMap, Integer num, Long l, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        C1pq.A08("actionsSource", bOc);
        this.A00 = bOc;
        C1pq.A08("audiencePickerOption", num);
        this.A08 = num;
        C1pq.A08("broadcastFlowEntryPoint", str);
        this.A0A = str;
        this.A02 = callLinkModel;
        C1pq.A08("creationMode", str2);
        this.A0B = str2;
        this.A01 = inboxTrackableItem;
        this.A05 = immutableList;
        this.A0E = z;
        this.A0F = z2;
        C1pq.A08("linkUrl", str3);
        this.A0C = str3;
        C1pq.A08("loggedInUser", user);
        this.A04 = user;
        C1pq.A08("roomId", str4);
        this.A0D = str4;
        C1pq.A08("roomsInvitedNotJoinedUserActionsMap", immutableMap);
        this.A07 = immutableMap;
        this.A09 = l;
        C1pq.A08("topic", speakeasyTopicModel);
        this.A03 = speakeasyTopicModel;
        this.A06 = immutableList2;
    }

    public SpeakeasyShareSheetModel(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        this.A00 = BOc.values()[parcel.readInt()];
        this.A08 = 7zU.A0e(parcel, 3);
        this.A0A = parcel.readString();
        ImmutableList immutableList = null;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (CallLinkModel) parcel.readParcelable(A0e);
        }
        this.A0B = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (InboxTrackableItem) InboxTrackableItem.CREATOR.createFromParcel(parcel);
        }
        int i = 0;
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            int readInt = parcel.readInt();
            CallLinkParticipant[] callLinkParticipantArr = new CallLinkParticipant[readInt];
            int i2 = 0;
            while (i2 < readInt) {
                i2 = AbI.A01(parcel, A0e, callLinkParticipantArr, i2);
            }
            this.A05 = ImmutableList.copyOf(callLinkParticipantArr);
        }
        this.A0E = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0F = AbJ.A1V(parcel);
        this.A0C = parcel.readString();
        this.A04 = (User) parcel.readParcelable(A0e);
        this.A0D = parcel.readString();
        HashMap A0u = AnonymousClass001.A0u();
        int readInt2 = parcel.readInt();
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= readInt2) {
                break;
            }
            AnonymousClass001.A1A(parcel.readString(), A0u, parcel.readInt());
            i3 = i4 + 1;
        }
        this.A07 = ImmutableMap.copyOf((Map) A0u);
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = 7zO.A0j(parcel);
        }
        this.A03 = (SpeakeasyTopicModel) parcel.readParcelable(A0e);
        if (parcel.readInt() != 0) {
            int readInt3 = parcel.readInt();
            String[] strArr = new String[readInt3];
            while (i < readInt3) {
                i = AbH.A00(parcel, strArr, i);
            }
            immutableList = ImmutableList.copyOf(strArr);
        }
        this.A06 = immutableList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SpeakeasyShareSheetModel)) {
                return false;
            }
            SpeakeasyShareSheetModel speakeasyShareSheetModel = (SpeakeasyShareSheetModel) obj;
            if (this.A00 != speakeasyShareSheetModel.A00 || this.A08 != speakeasyShareSheetModel.A08 || !11T.A0O(this.A0A, speakeasyShareSheetModel.A0A) || !11T.A0O(this.A02, speakeasyShareSheetModel.A02) || !11T.A0O(this.A0B, speakeasyShareSheetModel.A0B) || !11T.A0O(this.A01, speakeasyShareSheetModel.A01) || !11T.A0O(this.A05, speakeasyShareSheetModel.A05) || this.A0E != speakeasyShareSheetModel.A0E || this.A0F != speakeasyShareSheetModel.A0F || !11T.A0O(this.A0C, speakeasyShareSheetModel.A0C) || !11T.A0O(this.A04, speakeasyShareSheetModel.A04) || !11T.A0O(this.A0D, speakeasyShareSheetModel.A0D) || !11T.A0O(this.A07, speakeasyShareSheetModel.A07) || !11T.A0O(this.A09, speakeasyShareSheetModel.A09) || !11T.A0O(this.A03, speakeasyShareSheetModel.A03) || !11T.A0O(this.A06, speakeasyShareSheetModel.A06)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A03 = C3o5.A03(this.A00) + 31;
        Integer num = this.A08;
        if (num != null) {
            i = num.intValue();
        }
        return C1pq.A04(this.A06, C1pq.A04(this.A03, C1pq.A04(this.A09, C1pq.A04(this.A07, C1pq.A04(this.A0D, C1pq.A04(this.A04, C1pq.A04(this.A0C, C1pq.A02(C1pq.A02(C1pq.A04(this.A05, C1pq.A04(this.A01, C1pq.A04(this.A0B, C1pq.A04(this.A02, C1pq.A04(this.A0A, (A03 * 31) + i))))), this.A0E), this.A0F))))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        7zN.A0z(parcel, this.A00);
        parcel.writeInt(this.A08.intValue());
        parcel.writeString(this.A0A);
        C3o5.A0d(parcel, this.A02, i);
        parcel.writeString(this.A0B);
        InboxTrackableItem inboxTrackableItem = this.A01;
        if (inboxTrackableItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inboxTrackableItem.writeToParcel(parcel, i);
        }
        ImmutableList immutableList = this.A05;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                parcel.writeParcelable((CallLinkParticipant) A0Y.next(), i);
            }
        }
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeString(this.A0C);
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A0D);
        ImmutableMap immutableMap = this.A07;
        AbG.A1G(parcel, immutableMap);
        1Du A0i = 4YU.A0i(immutableMap);
        while (A0i.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0i);
            parcel.writeString(AnonymousClass001.A0j(A0z));
            parcel.writeInt(AnonymousClass001.A03(A0z.getValue()));
        }
        C3o5.A0g(parcel, this.A09);
        parcel.writeParcelable(this.A03, i);
        ImmutableList immutableList2 = this.A06;
        if (immutableList2 == null) {
            parcel.writeInt(0);
            return;
        }
        1Du A0Y2 = AbL.A0Y(parcel, immutableList2);
        while (A0Y2.hasNext()) {
            C3o5.A0h(parcel, A0Y2);
        }
    }
}
