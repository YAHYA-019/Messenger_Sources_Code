package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.invitelink.model.CommunityMessagingInviteLinkData;
import com.facebook.messaging.communitymessaging.model.CommunityMessagingFbGroupType;
import com.facebook.messaging.communitymessaging.model.CommunityMessagingJoinFlowEntrypoint;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.jvm.functions.Function1;

/* renamed from: X.9mb, reason: invalid class name */
/* loaded from: 9mb.class */
public final class C9mb {
    public final Context A00;
    public final 06Z A01;
    public final EnumC3499Mfu A02;
    public final CfG A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final AZE A0E;
    public final C9a8 A0F;
    public final C9m6 A0G;
    public final CommunityMessagingJoinFlowEntrypoint A0H;
    public final String A0I;
    public final Function1 A0J;
    public final 1Br A0K;

    public C9mb(Context context, 06Z r303, EnumC3499Mfu enumC3499Mfu, AZE aze, CommunityMessagingJoinFlowEntrypoint communityMessagingJoinFlowEntrypoint, String str, Function1 function1) {
        1BL.A1F(context, r303);
        this.A00 = context;
        this.A01 = r303;
        this.A0H = communityMessagingJoinFlowEntrypoint;
        this.A0I = str;
        this.A0J = function1;
        this.A0E = aze;
        this.A02 = enumC3499Mfu;
        this.A08 = 1Bu.A01(context, 82282);
        this.A0C = 1Bq.A00(66630);
        this.A05 = 1Bu.A01(context, 147544);
        this.A0B = 1Bu.A01(context, 82650);
        this.A06 = 1Bu.A01(context, 147543);
        this.A04 = 7zM.A0Q();
        this.A09 = 1Bq.A00(68080);
        this.A07 = 1Bq.A00(68708);
        this.A0K = 1Bq.A00(68709);
        this.A0A = 1Bq.A00(66774);
        1Br.A0C(this.A05);
        this.A0G = new C9m6(context);
        this.A03 = ((CHy) 1Br.A0B(this.A0B)).A01(context, 2131958504);
        1Br.A0C(this.A06);
        this.A0F = new C9a8(context, r303, enumC3499Mfu, communityMessagingJoinFlowEntrypoint, str, new DD4(this, 0));
        this.A0D = 7zM.A0O();
    }

    public static final C4Ff A00(C9mb c9mb) {
        return (C4Ff) 1Br.A0B(c9mb.A0K);
    }

    public static final void A01(FbUserSession fbUserSession, C9mb c9mb, Long l, C00m c00m, C00m c00m2, C00m c00m3, long j, long j2) {
        C9m5 c9m5 = (C9m5) 1Br.A0B(c9mb.A07);
        c9m5.A00 = 1Br.A01(c9m5.A06);
        A00(c9mb).A03("fetch_join_flow_data_with_community_id_start");
        22I r0 = (22I) 1Lm.A05(c9mb.A00, fbUserSession, 33183);
        r0.A0A(new A0v(r0, c9mb, l, c00m, c00m2, c00m3, 1, j), j, j2);
    }

    public static final void A02(FbUserSession fbUserSession, C9mb c9mb, String str, Function1 function1) {
        A00(c9mb).A03("load_join_flow_data_start");
        ((BDa) 1Lm.A05(c9mb.A00, fbUserSession, 68503)).A01(A1f.A00(function1, c9mb, 37), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean A03(C9mb c9mb, CommunityMessagingInviteLinkData communityMessagingInviteLinkData, boolean z) {
        C9m6 c9m6;
        int i;
        boolean z2 = communityMessagingInviteLinkData.A0J;
        if (z2 && !C9m6.A02(communityMessagingInviteLinkData) && (!7zV.A1A(c9mb.A0C) || communityMessagingInviteLinkData.A04 != CommunityMessagingFbGroupType.A03 || communityMessagingInviteLinkData.A07 != 0S2.A01)) {
            return false;
        }
        if (!z) {
            c9mb.A03.D2v();
        }
        A00(c9mb).A01(communityMessagingInviteLinkData, "already_joined");
        Integer num = communityMessagingInviteLinkData.A08;
        Integer num2 = communityMessagingInviteLinkData.A07;
        11T.A0A(num2);
        byte b = num == null || num == 0S2.A00 || num2 == 0S2.A0C || (7zV.A1A(c9mb.A0C) && num2 == 0S2.A01 && communityMessagingInviteLinkData.A04 == CommunityMessagingFbGroupType.A03);
        if (!z2) {
            ((C9m5) 1Br.A0B(c9mb.A07)).A04(c9mb.A02, communityMessagingInviteLinkData, c9mb.A0H, false);
        }
        if (7zQ.A0e().A06() && b == true) {
            AZE aze = c9mb.A0E;
            if (aze != null) {
                aze.CTA();
            }
            int ordinal = communityMessagingInviteLinkData.A03.ordinal();
            if (ordinal == 2) {
                c9m6 = c9mb.A0G;
                i = 9;
            } else {
                if (ordinal != 3 && ordinal != 4) {
                    return true;
                }
                c9m6 = c9mb.A0G;
                i = 10;
            }
            c9m6.A04(communityMessagingInviteLinkData, AQt.A01(communityMessagingInviteLinkData, c9mb, i));
            return true;
        }
        C9m6 c9m62 = c9mb.A0G;
        String str = communityMessagingInviteLinkData.A0E;
        Long l = communityMessagingInviteLinkData.A0A;
        C96j c96j = communityMessagingInviteLinkData.A03;
        11T.A0A(c96j);
        C96j c96j2 = C96j.A02;
        C7f c7f = (C7f) 1Br.A0B(c9m62.A03);
        if (c96j != c96j2) {
            c7f.A01(c9m62.A00, String.valueOf(str));
            return true;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(l);
        Context context = c9m62.A00;
        boolean A1X = 1BL.A1X(valueOf, valueOf2);
        Uri build = new Uri.Builder().scheme("fb").authority("group_chat_join_bottom_sheet").appendQueryParameter(4YT.A00(352), valueOf).appendQueryParameter(4YT.A00(452), valueOf2).build();
        11T.A0A(build);
        ListenableFuture A03 = ((C67Q) 1Br.A0B(c7f.A01)).A03(context, 4YU.A0F(build.toString()), null, 0S2.A0C);
        11T.A0A(A03);
        1Kd.A0F(new ABq(str, c9m62, A1X ? 1 : 0), A03, ((CG7) 1Br.A0B(c9m62.A05)).A01() ? 4YV.A11(c9m62.A01) : 1JU.A01);
        return true;
    }

    public final void A04(FbUserSession fbUserSession, String str) {
        11T.A0H(fbUserSession, str);
        AKf aKf = new AKf(fbUserSession, this, str, 4);
        C9m5 c9m5 = (C9m5) 1Br.A0B(this.A07);
        c9m5.A00 = 1Br.A01(c9m5.A06);
        A00(this).A03("fetch_join_flow_data_with_link_hash_start");
        BDa bDa = (BDa) 1Lm.A05(this.A00, fbUserSession, 68503);
        C00i c00i = this.A09.A00;
        Integer A0w = 7zS.A0w(c00i);
        Integer A0w2 = 7zS.A0w(c00i);
        bDa.A00(A1f.A00(aKf, this, 36), 1BK.A0d(), A0w, A0w2, str);
    }

    public final void A05(FbUserSession fbUserSession, String str, String str2) {
        11T.A0H(fbUserSession, str);
        11T.A0F(str2, 2);
        long A00 = 6EX.A00(1BK.A0n(str), Long.parseLong(str2));
        A01(fbUserSession, this, 1BK.A0n(str2), new AKc(2, A00, this, fbUserSession), null, null, Long.parseLong(str), 0L);
    }

    public final void A06(FbUserSession fbUserSession, String str, String str2, String str3, boolean z) {
        AKM akm;
        11T.A0F(fbUserSession, 0);
        11T.A0G(str, 1, str2);
        Long l = null;
        if (z) {
            akm = null;
        } else {
            this.A03.ABm();
            akm = new AKM(this, 9);
        }
        long parseLong = Long.parseLong(str);
        long parseLong2 = Long.parseLong(str2);
        if (str3 != null) {
            l = 1BK.A0n(str3);
        }
        A01(fbUserSession, this, l, new AKn(this, fbUserSession, str2, 0, z), new AKn(this, fbUserSession, str3, 1, z), akm, parseLong, parseLong2);
    }

    public final void A07(FbUserSession fbUserSession, C00m c00m, long j, long j2) {
        11T.A0F(fbUserSession, 0);
        C9m5 c9m5 = (C9m5) 1Br.A0B(this.A07);
        c9m5.A01 = 1Br.A01(c9m5.A06);
        A01(fbUserSession, this, null, new M15(1, j2, j, this, fbUserSession, c00m), null, null, j, j2);
    }
}
