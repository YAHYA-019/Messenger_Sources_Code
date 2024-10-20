package com.facebook.messaging.service.model.communitymessaging;

import X.11T;
import X.1BL;
import X.1BM;
import X.1Du;
import X.4YT;
import X.7zO;
import X.7zU;
import X.AbH;
import X.AbJ;
import X.AbL;
import X.AbN;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.CSU;
import X.JQw;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.communitymessaging.model.CommunityChannelPrivacyType;
import com.facebook.messaging.communitymessaging.model.MessengerApprovalMode;
import com.facebook.messaging.communitymessaging.model.MessengerJoinRequestApprovalSetting;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: CommunityMessagingThreadSummarySaveParams.class */
public final class CommunityMessagingThreadSummarySaveParams implements Parcelable {
    public static volatile MessengerApprovalMode A0K;
    public static volatile MessengerJoinRequestApprovalSetting A0L;
    public static final Parcelable.Creator CREATOR = CSU.A00(29);
    public final CommunityChannelPrivacyType A00;
    public final ThreadSummary A01;
    public final ImmutableList A02;
    public final ImmutableList A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Integer A07;
    public final Long A08;
    public final Long A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final MessengerApprovalMode A0H;
    public final MessengerJoinRequestApprovalSetting A0I;
    public final Set A0J;

    public CommunityMessagingThreadSummarySaveParams(Parcel parcel) {
        int i = 0;
        ThreadSummary threadSummary = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A04 = null;
        } else {
            this.A04 = Boolean.valueOf(1BM.A07(parcel));
        }
        if (parcel.readInt() == 0) {
            this.A0H = null;
        } else {
            this.A0H = MessengerApprovalMode.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = Boolean.valueOf(1BM.A07(parcel));
        }
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = 7zO.A0j(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = CommunityChannelPrivacyType.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A09 = null;
        } else {
            this.A09 = 7zO.A0j(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A0B = null;
        } else {
            this.A0B = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0C = null;
        } else {
            this.A0C = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = Boolean.valueOf(AbJ.A1V(parcel));
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            int readInt = parcel.readInt();
            String[] strArr = new String[readInt];
            int i2 = 0;
            while (i2 < readInt) {
                i2 = AbH.A00(parcel, strArr, i2);
            }
            this.A02 = ImmutableList.copyOf(strArr);
        }
        this.A0D = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A0I = null;
        } else {
            this.A0I = MessengerJoinRequestApprovalSetting.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            int readInt2 = parcel.readInt();
            String[] strArr2 = new String[readInt2];
            int i3 = 0;
            while (i3 < readInt2) {
                i3 = AbH.A00(parcel, strArr2, i3);
            }
            this.A03 = ImmutableList.copyOf(strArr2);
        }
        if (parcel.readInt() == 0) {
            this.A0E = null;
        } else {
            this.A0E = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A0F = null;
        } else {
            this.A0F = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = 7zU.A0e(parcel, 4);
        }
        this.A0G = parcel.readString();
        this.A01 = parcel.readInt() != 0 ? (ThreadSummary) ThreadSummary.CREATOR.createFromParcel(parcel) : threadSummary;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt3 = parcel.readInt();
        while (i < readInt3) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0J = Collections.unmodifiableSet(A0v);
    }

    public CommunityMessagingThreadSummarySaveParams(CommunityChannelPrivacyType communityChannelPrivacyType, MessengerApprovalMode messengerApprovalMode, MessengerJoinRequestApprovalSetting messengerJoinRequestApprovalSetting, ThreadSummary threadSummary, ImmutableList immutableList, Boolean bool, Boolean bool2, Boolean bool3, Integer num, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, Set set) {
        this.A04 = bool;
        this.A0H = messengerApprovalMode;
        this.A05 = bool2;
        this.A08 = l;
        this.A0A = str;
        this.A00 = communityChannelPrivacyType;
        this.A09 = l2;
        this.A0B = str2;
        this.A0C = str3;
        this.A06 = bool3;
        this.A02 = immutableList;
        C1pq.A08("groupId", str4);
        this.A0D = str4;
        this.A0I = messengerJoinRequestApprovalSetting;
        this.A03 = null;
        this.A0E = str5;
        this.A0F = str6;
        this.A07 = num;
        this.A0G = "";
        this.A01 = threadSummary;
        this.A0J = Collections.unmodifiableSet(set);
    }

    public MessengerApprovalMode A00() {
        if (this.A0J.contains("approvalMode")) {
            return this.A0H;
        }
        if (A0K == null) {
            synchronized (this) {
                if (A0K == null) {
                    A0K = MessengerApprovalMode.A04;
                }
            }
        }
        return A0K;
    }

    public MessengerJoinRequestApprovalSetting A01() {
        if (this.A0J.contains("joinRequestApprovalSetting")) {
            return this.A0I;
        }
        if (A0L == null) {
            synchronized (this) {
                if (A0L == null) {
                    A0L = MessengerJoinRequestApprovalSetting.A04;
                }
            }
        }
        return A0L;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CommunityMessagingThreadSummarySaveParams)) {
                return false;
            }
            CommunityMessagingThreadSummarySaveParams communityMessagingThreadSummarySaveParams = (CommunityMessagingThreadSummarySaveParams) obj;
            if (!11T.A0O(this.A04, communityMessagingThreadSummarySaveParams.A04) || A00() != communityMessagingThreadSummarySaveParams.A00() || !11T.A0O(this.A05, communityMessagingThreadSummarySaveParams.A05) || !11T.A0O(this.A08, communityMessagingThreadSummarySaveParams.A08) || !11T.A0O(this.A0A, communityMessagingThreadSummarySaveParams.A0A) || this.A00 != communityMessagingThreadSummarySaveParams.A00 || !11T.A0O(this.A09, communityMessagingThreadSummarySaveParams.A09) || !11T.A0O(this.A0B, communityMessagingThreadSummarySaveParams.A0B) || !11T.A0O(this.A0C, communityMessagingThreadSummarySaveParams.A0C) || !11T.A0O(this.A06, communityMessagingThreadSummarySaveParams.A06) || !11T.A0O(this.A02, communityMessagingThreadSummarySaveParams.A02) || !11T.A0O(this.A0D, communityMessagingThreadSummarySaveParams.A0D) || A01() != communityMessagingThreadSummarySaveParams.A01() || !11T.A0O(this.A03, communityMessagingThreadSummarySaveParams.A03) || !11T.A0O(this.A0E, communityMessagingThreadSummarySaveParams.A0E) || !11T.A0O(this.A0F, communityMessagingThreadSummarySaveParams.A0F) || this.A07 != communityMessagingThreadSummarySaveParams.A07 || !11T.A0O(this.A0G, communityMessagingThreadSummarySaveParams.A0G) || !11T.A0O(this.A01, communityMessagingThreadSummarySaveParams.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int A04 = C1pq.A04(this.A0F, C1pq.A04(this.A0E, C1pq.A04(this.A03, (C1pq.A04(this.A0D, C1pq.A04(this.A02, C1pq.A04(this.A06, C1pq.A04(this.A0C, C1pq.A04(this.A0B, C1pq.A04(this.A09, (C1pq.A04(this.A0A, C1pq.A04(this.A08, C1pq.A04(this.A05, (C1pq.A03(this.A04) * 31) + C3o5.A03(A00())))) * 31) + C3o5.A03(this.A00))))))) * 31) + C3o5.A03(A01()))));
        Integer num = this.A07;
        if (num != null) {
            i = num.intValue();
        }
        return C1pq.A04(this.A01, C1pq.A04(this.A0G, (A04 * 31) + i));
    }

    public String toString() {
        String str;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CommunityMessagingThreadSummarySaveParams{allowMembersToInvite=");
        A0k.append(this.A04);
        A0k.append(", approvalMode=");
        A0k.append(A00());
        A0k.append(", audioRoomForChatCreationSelected=");
        A0k.append(this.A05);
        A0k.append(", channelCategoryId=");
        A0k.append(this.A08);
        A0k.append(", channelCreationEntryPoint=");
        A0k.append(this.A0A);
        A0k.append(", communityChannelPrivacyType=");
        A0k.append(this.A00);
        A0k.append(", communityId=");
        A0k.append(this.A09);
        A0k.append(JQw.A00(5));
        A0k.append(this.A0B);
        A0k.append(", emoji=");
        A0k.append(this.A0C);
        A0k.append(", enableSmartInvite=");
        A0k.append(this.A06);
        A0k.append(", gradient=");
        A0k.append(this.A02);
        A0k.append(", groupId=");
        A0k.append(this.A0D);
        A0k.append(", joinRequestApprovalSetting=");
        A0k.append(A01());
        A0k.append(", multiSelectedTemplateIdList=");
        A0k.append(this.A03);
        A0k.append(", name=");
        A0k.append(this.A0E);
        A0k.append(", parentSurface=");
        A0k.append(this.A0F);
        A0k.append(", saveType=");
        Integer num = this.A07;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "EDIT_CHANNEL";
                    break;
                case 2:
                    str = "SUGGEST_CHANNEL";
                    break;
                case 3:
                    str = "MEMBER_CREATE_CHANNEL";
                    break;
                default:
                    str = "CREATE_CHANNEL";
                    break;
            }
        } else {
            str = "null";
        }
        A0k.append(str);
        A0k.append(", threadId=");
        A0k.append(this.A0G);
        A0k.append(4YT.A00(85));
        A0k.append(this.A01);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        AbN.A0s(parcel, this.A04);
        C3o5.A0e(parcel, this.A0H);
        AbN.A0s(parcel, this.A05);
        C3o5.A0g(parcel, this.A08);
        1BL.A13(parcel, this.A0A);
        C3o5.A0e(parcel, this.A00);
        C3o5.A0g(parcel, this.A09);
        1BL.A13(parcel, this.A0B);
        1BL.A13(parcel, this.A0C);
        AbN.A0s(parcel, this.A06);
        ImmutableList immutableList = this.A02;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                C3o5.A0h(parcel, A0Y);
            }
        }
        parcel.writeString(this.A0D);
        C3o5.A0e(parcel, this.A0I);
        ImmutableList immutableList2 = this.A03;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y2 = AbL.A0Y(parcel, immutableList2);
            while (A0Y2.hasNext()) {
                C3o5.A0h(parcel, A0Y2);
            }
        }
        1BL.A13(parcel, this.A0E);
        1BL.A13(parcel, this.A0F);
        C3o5.A0f(parcel, this.A07);
        parcel.writeString(this.A0G);
        ThreadSummary threadSummary = this.A01;
        if (threadSummary == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            threadSummary.writeToParcel(parcel, i);
        }
        Iterator A0S = C3o5.A0S(parcel, this.A0J);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
