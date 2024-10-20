package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.invitelink.model.CommunityMessagingInviteLinkData;
import com.facebook.messaging.communitymessaging.model.CommunityMessagingFbGroupType;
import com.facebook.messaging.communitymessaging.model.CommunityMessagingJoinFlowEntrypoint;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.PrivacyContextCoding;
import com.facebook.msys.mci.TransportAgnosticLogging;

/* renamed from: X.9m5, reason: invalid class name */
/* loaded from: 9m5.class */
public final class C9m5 {
    public long A00;
    public long A01;
    public String A02;
    public final FbUserSession A03;
    public final 1Br A05;
    public final PrivacyContext A07;
    public final 1Br A06 = 1Bq.A00(84488);
    public final 1Br A04 = 1Bu.A00(83118);

    public C9m5() {
        PrivacyContext newPrivacyContextWithTransportKeyNative = PrivacyContextCoding.newPrivacyContextWithTransportKeyNative(null, "FBLegacyBroker");
        11T.A0A(newPrivacyContextWithTransportKeyNative);
        this.A07 = newPrivacyContextWithTransportKeyNative;
        1Br A0Y = 7zM.A0Y();
        this.A05 = A0Y;
        this.A03 = 7zS.A0E(A0Y);
    }

    public static final long A00(CommunityMessagingFbGroupType communityMessagingFbGroupType) {
        int ordinal = communityMessagingFbGroupType.ordinal();
        if (ordinal == 0) {
            return 0L;
        }
        if (ordinal == 1) {
            return 1L;
        }
        if (ordinal == 2) {
            return 2;
        }
        throw 1BK.A1F();
    }

    public static final long A01(CommunityMessagingFbGroupType communityMessagingFbGroupType, Integer num) {
        if (communityMessagingFbGroupType == CommunityMessagingFbGroupType.A02 || communityMessagingFbGroupType == CommunityMessagingFbGroupType.A04) {
            return -1;
        }
        int intValue = num == null ? -1 : num.intValue();
        long j = 0;
        if (intValue != 0) {
            if (intValue == 1) {
                return 1L;
            }
            if (intValue == 2) {
                j = 2;
            }
        }
        return j;
    }

    public static final long A02(CommunityMessagingJoinFlowEntrypoint communityMessagingJoinFlowEntrypoint) {
        if (communityMessagingJoinFlowEntrypoint != null) {
            switch (communityMessagingJoinFlowEntrypoint.ordinal()) {
                case 0:
                    return 0L;
                case 1:
                    return 1L;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                    return 6;
                case 11:
                    return 7;
                case 13:
                    return 8;
                case 14:
                    return 9;
                case 15:
                    return 10;
                case 16:
                    return 11;
            }
        }
        return -1;
    }

    public final void A03(EnumC3499Mfu enumC3499Mfu, CommunityMessagingInviteLinkData communityMessagingInviteLinkData, CommunityMessagingJoinFlowEntrypoint communityMessagingJoinFlowEntrypoint, Integer num, long j) {
        11T.A0F(communityMessagingInviteLinkData, 0);
        Long l = communityMessagingInviteLinkData.A0B;
        String str = null;
        String valueOf = l != null ? String.valueOf(l) : null;
        Long l2 = communityMessagingInviteLinkData.A0A;
        if (l2 != null) {
            str = String.valueOf(l2);
        }
        boolean A1W = AnonymousClass001.A1W(communityMessagingInviteLinkData.A06, 0S2.A01);
        Integer num2 = communityMessagingInviteLinkData.A08;
        CommunityMessagingFbGroupType communityMessagingFbGroupType = communityMessagingInviteLinkData.A04;
        11T.A0A(communityMessagingFbGroupType);
        C96j c96j = communityMessagingInviteLinkData.A03;
        11T.A0A(c96j);
        long A01 = this.A01 == 0 ? 0L : 1Br.A01(this.A06) - this.A01;
        String str2 = this.A02;
        this.A02 = null;
        if (str2 != null && valueOf != null) {
            PrivacyContext privacyContext = this.A07;
            long A00 = A00(communityMessagingFbGroupType);
            long A02 = A02(communityMessagingJoinFlowEntrypoint);
            long A05 = 7zT.A05(c96j);
            Long valueOf2 = Long.valueOf(A01);
            long A012 = A01(communityMessagingFbGroupType, num2);
            long j2 = num.intValue() != 0 ? 1L : 0L;
            long A002 = 9BZ.A00(enumC3499Mfu);
            Object[] objArr = new Object[52];
            System.arraycopy(new Object[]{0, 0L, (byte) 0, Long.valueOf(j), 3, 0L, (byte) 0, str, 3, 0L, (byte) 1, valueOf, 0, 0L, (byte) 1, Long.valueOf(A00), 0, 0L, (byte) 1, Long.valueOf(A02), 0, 0L, (byte) 0, Long.valueOf(-1), 0, 0L, (byte) 1}, 0, objArr, 0, 27);
            System.arraycopy(new Object[]{Long.valueOf(A05), 22, 0L, (byte) 0, valueOf2, 3, 0L, (byte) 1, str2, 0, 0L, (byte) 0, Long.valueOf(A012), 2, 0L, (byte) 1, Boolean.valueOf(A1W), 0, 0L, (byte) 0, Long.valueOf(j2), 0, 0L, (byte) 0, Long.valueOf(A002)}, 0, objArr, 27, 25);
            TransportAgnosticLogging.logTalEventToPipe(privacyContext, 0, false, 13, objArr, 9Fg.A00);
        }
        this.A01 = 0L;
    }

    public final void A04(EnumC3499Mfu enumC3499Mfu, CommunityMessagingInviteLinkData communityMessagingInviteLinkData, CommunityMessagingJoinFlowEntrypoint communityMessagingJoinFlowEntrypoint, boolean z) {
        System.out.println(this.A00);
        Long l = communityMessagingInviteLinkData.A0B;
        String str = null;
        String valueOf = l != null ? String.valueOf(l) : null;
        Long l2 = communityMessagingInviteLinkData.A0A;
        if (l2 != null) {
            str = String.valueOf(l2);
        }
        boolean A1W = AnonymousClass001.A1W(communityMessagingInviteLinkData.A06, 0S2.A01);
        Integer num = communityMessagingInviteLinkData.A08;
        CommunityMessagingFbGroupType communityMessagingFbGroupType = communityMessagingInviteLinkData.A04;
        11T.A0A(communityMessagingFbGroupType);
        C96j c96j = communityMessagingInviteLinkData.A03;
        11T.A0A(c96j);
        long A01 = this.A00 == 0 ? 0L : 1Br.A01(this.A06) - this.A00;
        String A0u = 4YV.A0u(C04I.A00());
        this.A02 = A0u;
        if (A0u != null && valueOf != null) {
            PrivacyContext privacyContext = this.A07;
            long A00 = A00(communityMessagingFbGroupType);
            long A02 = A02(communityMessagingJoinFlowEntrypoint);
            long j = z ? 0L : 1L;
            long A05 = 7zT.A05(c96j);
            Long valueOf2 = Long.valueOf(A01);
            long A012 = A01(communityMessagingFbGroupType, num);
            long A002 = 9BZ.A00(enumC3499Mfu);
            Object[] objArr = new Object[52];
            Long valueOf3 = Long.valueOf(-1);
            System.arraycopy(new Object[]{0, 0L, (byte) 0, valueOf3, 3, 0L, (byte) 0, str, 3, 0L, (byte) 1, valueOf, 0, 0L, (byte) 1, Long.valueOf(A00), 0, 0L, (byte) 1, Long.valueOf(A02), 0, 0L, (byte) 0, Long.valueOf(j), 0, 0L, (byte) 1}, 0, objArr, 0, 27);
            System.arraycopy(new Object[]{Long.valueOf(A05), 22, 0L, (byte) 0, valueOf2, 3, 0L, (byte) 1, A0u, 0, 0L, (byte) 0, Long.valueOf(A012), 2, 0L, (byte) 1, Boolean.valueOf(A1W), 0, 0L, (byte) 0, valueOf3, 0, 0L, (byte) 0, Long.valueOf(A002)}, 0, objArr, 27, 25);
            TransportAgnosticLogging.logTalEventToPipe(privacyContext, 0, false, 13, objArr, C9Fi.A00);
        }
        this.A00 = 0L;
    }
}
