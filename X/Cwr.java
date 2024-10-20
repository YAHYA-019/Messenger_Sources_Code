package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.accountswitch.model.MessengerAccountInfo;
import com.facebook.messaging.communitymessaging.model.CommunityExtraData;
import com.facebook.messaging.communitymessaging.plugins.memberrequest.memberrequestlistitem.MemberRequestListItemImplementation;
import com.facebook.messaging.invites.CombinedInviteFriendsActivity;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.nativepagereply.savedreplies.model.SavedReplyItem;
import com.facebook.messaging.rtc.incall.impl.active.lobby.views.LobbyRootView;
import com.facebook.messaging.sharing.broadcastflow.logging.BroadcastFlowMnetItem;
import com.facebook.presence.api.model.NoteTypeEnum;
import com.facebook.presence.api.model.RichStatusTimestamp;
import com.facebook.ui.emoji.model.Emoji;
import com.facebook.user.model.User;
import com.facebook.user.model.UserPhoneNumber;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: Cwr.class */
public final class Cwr implements AnonymousClass553 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public Cwr(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj3;
        this.A03 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r0v353, types: [X.All, androidx.fragment.app.Fragment] */
    @Override // X.AnonymousClass553
    public void onClick(View view) {
        C00i c00i;
        List list;
        QAd qAd;
        CPV cpv;
        C5k c5k;
        BOf bOf;
        Emoji emoji;
        String str;
        switch (this.A00) {
            case 0:
                ((Bbu) this.A03).A00.A1d((MessengerAccountInfo) this.A02);
                c00i = ((CJ0) this.A01).A05;
                ((9YE) c00i.get()).A00();
                return;
            case 1:
                B9K.A0D(((Bbu) this.A03).A00, (MessengerAccountInfo) this.A02);
                c00i = ((CJ0) this.A01).A05;
                ((9YE) c00i.get()).A00();
                return;
            case 2:
                11T.A0F(view, 0);
                C9kp c9kp = (C9kp) this.A01;
                C1964Axt c1964Axt = (C1964Axt) this.A03;
                8Ca A01 = c9kp.A01(view, c1964Axt.A01);
                LQD lqd = ((7QJ) A01).A04;
                int i = 2131959017;
                if (c1964Axt.A07) {
                    i = 2131959018;
                }
                lqd.add(i).setOnMenuItemClickListener(new CYd(c1964Axt, 0));
                A01.A00();
                return;
            case 3:
                MemberRequestListItemImplementation memberRequestListItemImplementation = (MemberRequestListItemImplementation) this.A03;
                MemberRequestListItemImplementation.A00(memberRequestListItemImplementation, "decline_button", "decline_member_join_request");
                CIy cIy = (CIy) 1Br.A0B(memberRequestListItemImplementation.A03);
                CommunityExtraData communityExtraData = (CommunityExtraData) this.A01;
                cIy.A03(new CjD(this.A02, memberRequestListItemImplementation, 1), (ThreadKey) null, AbG.A02(communityExtraData), communityExtraData.A00, 7zQ.A0H(memberRequestListItemImplementation.A05.A04));
                return;
            case 4:
                MemberRequestListItemImplementation memberRequestListItemImplementation2 = (MemberRequestListItemImplementation) this.A03;
                MemberRequestListItemImplementation.A00(memberRequestListItemImplementation2, "approve_button", "approve_member_join_request");
                CIy cIy2 = (CIy) 1Br.A0B(memberRequestListItemImplementation2.A03);
                CommunityExtraData communityExtraData2 = (CommunityExtraData) this.A01;
                cIy2.A02(new CjD(this.A02, memberRequestListItemImplementation2, 2), (ThreadKey) null, AbG.A02(communityExtraData2), communityExtraData2.A00, 7zQ.A0H(memberRequestListItemImplementation2.A05.A04));
                return;
            case 5:
                Beg beg = (Beg) this.A02;
                if (beg != null) {
                    User user = (User) this.A03;
                    CombinedInviteFriendsActivity combinedInviteFriendsActivity = beg.A00;
                    HashMap A0u = AnonymousClass001.A0u();
                    C1550Al5 c1550Al5 = combinedInviteFriendsActivity.A01;
                    c1550Al5.A08.add(user.A0k);
                    C1550Al5.A03(c1550Al5);
                    BxV bxV = combinedInviteFriendsActivity.A02;
                    bxV.getClass();
                    UserPhoneNumber A03 = user.A03();
                    List list2 = null;
                    if (!user.A0G() || A03 == null) {
                        list = null;
                        list2 = Arrays.asList(user.A13);
                    } else {
                        if (!bxV.A03.AZk(36310422320120067L)) {
                            Context context = bxV.A01;
                            11T.A0F(context, 0);
                            R0k.A00(context, A03.A03, AbK.A13(context, context.getString(2131958407), 2131958411));
                            return;
                        }
                        list = Arrays.asList(A03.A03);
                    }
                    1Kd.A0F(new D4H(7, bxV, A0u, user), bxV.A02.A01(list2, list), bxV.A05);
                    return;
                }
                return;
            case 6:
                COe cOe = (COe) this.A01;
                Context context2 = (Context) this.A02;
                long j = ((SavedReplyItem) this.A03).A00;
                cOe.A0C.get();
                DR6 A012 = C5ic.A01(context2, cOe.A04);
                A012.A0K(true);
                A012.A00(2131967365);
                A012.A06(2131959817);
                A012.A0D(new CR0(cOe, j, 0), 2131955704);
                CSG.A03(A012, cOe, ActionId.HEADER_DATA_LOADED);
                A012.A05();
                c00i = cOe.A0F;
                ((9YE) c00i.get()).A00();
                return;
            case 7:
                ((IRF) this.A03).A0d(ImmutableList.of((Object) ((C56i) this.A01).A00.A03.A03));
                return;
            case 8:
                ((DIo) this.A02).BLU();
                qAd = (QAd) this.A01;
                if (qAd == null || !qAd.A0C) {
                    return;
                }
                cpv = (CPV) 1Br.A0B(((LobbyRootView) this.A03).A0O);
                c5k = new C5k();
                bOf = BOf.A01;
                c5k.A00 = bOf;
                c5k.A00(BOG.A01);
                c5k.A02 = BOd.A04;
                c5k.A05 = qAd.B8C();
                cpv.A04(new C99(c5k));
                return;
            case 9:
                ((DIo) this.A02).BYB();
                qAd = (QAd) this.A01;
                if (qAd == null || !qAd.A0C) {
                    return;
                }
                cpv = (CPV) 1Br.A0B(((LobbyRootView) this.A03).A0O);
                c5k = new C5k();
                bOf = BOf.A06;
                c5k.A00 = bOf;
                c5k.A00(BOG.A01);
                c5k.A02 = BOd.A04;
                c5k.A05 = qAd.B8C();
                cpv.A04(new C99(c5k));
                return;
            case 10:
                CHL chl = (CHL) this.A01;
                ((C1O) chl.A02.get()).A00(chl.A01, (Cf5) this.A03, CHL.A00((FbUserSession) this.A02, chl) ? 0S2.A0C : 0S2.A00);
                return;
            case 11:
                ((DIh) this.A03).BLe((BroadcastFlowMnetItem) this.A01, "ADD_TO_STORY_ID");
                return;
            case 12:
                ((DIq) this.A01).CWP((ThreadKey) this.A02, (User) this.A03);
                return;
            case 13:
                11T.A0F(view, 0);
                Context context3 = (Context) this.A01;
                Cug cug = (Cug) this.A02;
                ((82O) 1Bn.A0A(793)).A0L(context3, (ThreadKey) this.A03).A02(cug.A02, "thread_settings_row");
                View.OnClickListener onClickListener = cug.A01;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 14:
                11T.A0F(view, 0);
                C3D c3d = ((D2E) this.A03).A02;
                AtG atG = (AtG) this.A02;
                c3d.A00((FbUserSession) this.A01, atG.A02, atG.A04).onClick(view);
                return;
            default:
                ?? r0 = (C1566All) this.A03;
                View view2 = (View) this.A02;
                1Iw r02 = (1Iw) this.A01;
                RichStatusTimestamp richStatusTimestamp = r0.A04;
                if (richStatusTimestamp == null || (emoji = r0.A06) == null || (str = r0.A09) == null) {
                    return;
                }
                String A0W = 0CV.A0W(str, "\n", "");
                FbUserSession fbUserSession = r0.A01;
                if (fbUserSession == null) {
                    7zL.A1C();
                    throw 0Q8.createAndThrow();
                }
                1Kd.A0F(new D4m(view2, view2, r02, richStatusTimestamp, richStatusTimestamp, r0, emoji, emoji, A0W, A0W), ((C86) 7zN.A0m((Fragment) r0, fbUserSession, 68440)).A00(new C1773As7(NoteTypeEnum.A04, emoji, null, null, null, A0W, null, null, null, null, null, C1566All.A03(richStatusTimestamp), 1BK.A1V(richStatusTimestamp.A01, 0S2.A00), false, false), null, C1566All.A06(r0).A00, 0), 7zQ.A14());
                return;
        }
    }
}
