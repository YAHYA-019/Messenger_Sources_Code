package X;

import com.facebook.messaging.communitymessaging.memberlist.extradata.CommunityTabInfo;
import com.facebook.messaging.communitymessaging.memberlist.extradata.RequestToJoinChatInfo;
import com.facebook.messaging.communitymessaging.memberlist.extradata.RequestToJoinVersion;
import com.facebook.messaging.communitymessaging.model.CommunityExtraData;
import com.facebook.messaging.data.communitymessaging.memberlist.model.CommunityMemberListSource;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.model.secondarydata.ParcelableSecondaryData;

/* loaded from: Cl3.class */
public final class Cl3 implements DFA {
    public final /* synthetic */ AlU A00;

    public Cl3(AlU alU) {
        this.A00 = alU;
    }

    public void CPj(int i) {
        String str;
        AlU alU = this.A00;
        if (alU.A01 != i) {
            alU.A0N = true;
            alU.A01 = i;
            if (AlU.A0I(alU)) {
                str = "communityThreadListViewData";
                if (alU.A01 == 1) {
                    alU.A08 = CommunityMemberListSource.A0L;
                    alU.A0P = true;
                    ParcelableSecondaryData parcelableSecondaryData = alU.A0F;
                    if (parcelableSecondaryData != null) {
                        alU.A0F = AbG.A0w(new RequestToJoinChatInfo(RequestToJoinVersion.A02), new C3R9(parcelableSecondaryData.A00));
                    }
                    C6I c6i = alU.A06;
                    if (c6i != null) {
                        1Ql A08 = 1Br.A08(c6i.A08);
                        A08.CaH(1G3.A00(1NK.A0j, String.valueOf(c6i.A09.A04)), 1Br.A00(c6i.A06));
                        A08.commit();
                        CPj cPj = (CPj) 1Br.A0B(alU.A0c);
                        CommunityExtraData A1X = alU.A1X();
                        String A0q = A1X != null ? 7zO.A0q(A1X.A00) : null;
                        CommunityExtraData A1X2 = alU.A1X();
                        CPj.A03(cPj, "member_requests_channel_list_page_rendered", "member_requests_channel_list_page", A0q, A1X2 != null ? A1X2.A06 : null, (String) null, "community_settings");
                    }
                } else {
                    alU.A08 = CommunityMemberListSource.A0K;
                    alU.A0P = false;
                    AlU.A09(alU);
                    CPj cPj2 = (CPj) 1Br.A0B(alU.A0c);
                    CommunityExtraData A1X3 = alU.A1X();
                    String A0q2 = A1X3 != null ? 7zO.A0q(A1X3.A00) : null;
                    CommunityExtraData A1X4 = alU.A1X();
                    CPj.A03(cPj2, "member_requests_community_page_rendered", "member_requests_community_page", A0q2, A1X4 != null ? A1X4.A06 : null, (String) null, "community_settings");
                }
                C6I c6i2 = alU.A06;
                if (c6i2 != null) {
                    c6i2.A00();
                    alU.A0A = AlU.A03(alU);
                    AlU.A0F(alU, (Integer) null);
                    return;
                }
            } else {
                CommunityTabInfo communityTabInfo = new CommunityTabInfo(AlU.A07(alU), i);
                ParcelableSecondaryData parcelableSecondaryData2 = alU.A0F;
                C3R9 c3r9 = parcelableSecondaryData2 != null ? new C3R9(parcelableSecondaryData2.A00) : new C3R9();
                1BK.A1O(communityTabInfo, c3r9.A00, 1904306014);
                alU.A0F = c3r9.A00();
                AlU.A09(alU);
                AlU.A0F(alU, (Integer) null);
                C0N c0n = (C0N) 1Br.A0B(alU.A0T);
                Integer num = 0S2.A0C;
                ThreadKey threadKey = alU.A0C;
                if (threadKey == null) {
                    str = "threadKey";
                } else {
                    Long A0l = 4YU.A0l(threadKey);
                    CommunityExtraData A1X5 = alU.A1X();
                    String str2 = alU.A0H;
                    int i2 = alU.A01;
                    1F9 r0 = alU.A0B;
                    if (r0 != null) {
                        c0n.A00(new C1784AsI(A1X5, r0, A0l, str2, i2), num);
                        return;
                    }
                    str = "folderName";
                }
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
    }
}
